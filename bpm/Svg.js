import Activity from './Activity.js'
import Arrow from './Arrow.js'

export default class Svg {
    activitys = [];
    arrows = []

    constructor(width, height, document) {
        this.document = document;
        this.width = width;
        this.height = height;;
        this._init();
    }

    _init(){
        this.svg = document.createElementNS('http://www.w3.org/2000/svg','svg');
        this.svg.setAttribute('id','svg');
        this.svg.setAttribute('width', this.width);
        this.svg.setAttribute('height', this.height);
        document.getElementsByTagName('body')[0].appendChild(this.svg);
    }

    createActivity(){
        let activity = new Activity(this, document);
        this.activitys.push(activity)
    }

    createArrow(initialPosition, finalPosition){
        var arrow = new Arrow(initialPosition, finalPosition, this, this.document);
        this.arrows.push(arrow);
        var connectorToBeConnected = null;
        var activityToBeConnected = null;
        const mouseMoveHandler = (e) => {
            let mouseMovement = {
                x: e.movementX,
                y: e.movementY
            };
            let zoom = e.view.devicePixelRatio; //TO ADD COMPORTAMENTO COM ZOOM
            arrow.onFinalDrag(mouseMovement);
            function verifyCollision(position1, position2){
                if (
                    position1.x < position2.x + 25 &&
                    position1.x + 25 > position2.x &&
                    position1.y < position2.y + 25 &&
                    25 + position1.y > position2.y
                  ) {
                    // Collision detected!
                    return true;
                  } else {
                    // No collision
                    return false;
                  }
            }
            this.activitys.forEach((activity) => {
                activity.connectors.forEach((connector) => {
                    console.log(arrow.finalPoint)
                    if(verifyCollision({
                        x: connector.position.x + activity.relativePosition.x, 
                        y: connector.position.y + activity.relativePosition.y}, 
                        arrow.finalPoint)){
                            connector.element.setAttribute('r', 20);
                            connectorToBeConnected = connector;
                            activityToBeConnected = activity;
                        }else{
                            connector.element.setAttribute('r', 10); 
                            connectorToBeConnected = null;
                            activityToBeConnected = null;
                        }
                })
            })
        }

        const mouseUpHandler = () => {
            console.log(connectorToBeConnected)
            if(connectorToBeConnected){
                arrow.finalPoint = {
                    x: connectorToBeConnected.position.x + activityToBeConnected.relativePosition.x, 
                    y: connectorToBeConnected.position.y + activityToBeConnected.relativePosition.y
                }
                arrow._setPointerPosition();
                activityToBeConnected.finalArrows.push(arrow);
            }

            this.document.removeEventListener("mousemove", mouseMoveHandler);
            this.document.removeEventListener("mouseup", mouseUpHandler);
        }

        this.document.addEventListener("mousemove", mouseMoveHandler);
        this.document.addEventListener("mouseup", mouseUpHandler);
        return arrow;
    }
} 