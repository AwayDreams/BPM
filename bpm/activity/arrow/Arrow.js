export default class Arrow { 

    constructor(initialPoint, finalPoint, svg, document){
        this.document = document;
        this.svg = svg;
        this.initialPoint = initialPoint;
        this.finalPoint = finalPoint;
        this.pointer = this._createPointer();
        this.path = this._createPath();
        this._setPathString();
        this.group = this._createGroup();
        this.svg.svg.append(this.group);
        this.isConnected = false;
        return this;
    }

    onFinalDrag(mouseMovement){
        this.finalPoint.x += mouseMovement.x
        this.finalPoint.y += mouseMovement.y
        this._setPathString();
        this._setPointerPosition();
    }
    
    onInitialDrag(mouseMovement){
        this.initialPoint.x += mouseMovement.x
        this.initialPoint.y += mouseMovement.y
        this._setPathString();
        this._setPointerPosition();
    }

    _createGroup(){
        var group = document.createElementNS('http://www.w3.org/2000/svg','g');
        group.appendChild(this.path);
        group.appendChild(this.pointer);
        return group;
    }

    _createPath(){
        let path = document.createElementNS('http://www.w3.org/2000/svg','path');
        path.setAttribute('class', 'arrow')
        return path;
    }

    _openMenu(){
        
    }

    _setPathString(){
        let curve1 = {x: this.finalPoint.x, y: this.initialPoint.y}
        let curve2 = {x: this.initialPoint.x, y: this.finalPoint.y}
        this.path.setAttribute('d', `M ${this.initialPoint.x},${this.initialPoint.y} C${curve1.x},${curve1.y} ${curve2.x},${curve2.y} ${this.finalPoint.x},${this.finalPoint.y}`) // ponto 1, curva 1, curva 2, ponto 2
    }

    _setPointerPosition(){
        this.pointer.setAttribute('cx', this.finalPoint.x);
        this.pointer.setAttribute('cy', this.finalPoint.y);
        
    }

    _createPointer(){
        let circle = document.createElementNS('http://www.w3.org/2000/svg','circle');
        circle.setAttribute('cx', this.finalPoint.x); // 130. 20
        circle.setAttribute('cy', this.finalPoint.y);
        circle.setAttribute('r', 10);
        circle.setAttribute('stroke', "gray");
        circle.setAttribute('stroke-width', '1');
        circle.setAttribute('fill', 'red');
        circle.addEventListener('mousedown', (e) => {
            const mouseMoveHandler = (e) => {
                if(this.isConnected){
                    return;
                }
                let mouseMovement = {
                    x: e.movementX,
                    y: e.movementY
                };
                let zoom = e.view.devicePixelRatio; //TO ADD COMPORTAMENTO COM ZOOM
                this.onFinalDrag(mouseMovement);
            }
    
            const mouseUpHandler = () => {
                this.document.removeEventListener("mousemove", mouseMoveHandler);
                this.document.removeEventListener("mouseup", mouseUpHandler);
            }
    
            this.document.addEventListener("mousemove", mouseMoveHandler);
            this.document.addEventListener("mouseup", mouseUpHandler);
        })
        return circle;
    }
    
}