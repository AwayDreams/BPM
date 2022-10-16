export default class Activity {
  position = {
    x: 1,
    y: 1,
  };
  relativePosition = {
    x: 0,
    y: 0,
  };
  dimension = {
    width: 150,
    height: 100,
  };
  isMenuEnabled = false;
  initialArrows = [];
  finalArrows = [];
  connectors = [];

  constructor(svg, document) {
    this.mousePosition = {
      x: 0,
      y: 0,
    };
    this.document = document;
    this.svg = svg;
    this.rect = this._createRect();
    this.text = this._createText();
    this.connector1 = this._createConnector(130, 20);
    this.connector2 = this._createConnector(20, 20);
    this.group = this._createGroup();
    this.group = this._createGroup();
    this.rect.addEventListener("mousedown", (e) => {
      this.onDragActivityStart(e);
    });
    this.svg.svg.appendChild(this.group);
    return this;
  }

  onClickActivity(event) {
    this.isMenuEnabled = this.isMenuEnabled ? false : true;
    if (this.isMenuEnabled) {
      this.createMenu();
    }
  }

  onDragActivityStart(event) {
    const mouseMoveHandler = (e) => {
      let mouseMovement = {
        x: e.movementX,
        y: e.movementY,
      };
      let zoom = e.view.devicePixelRatio; //TO ADD COMPORTAMENTO COM ZOOM
      this.relativePosition.x += mouseMovement.x;
      this.relativePosition.y += mouseMovement.y;
      this.group.setAttribute(
        "transform",
        `translate(${this.relativePosition.x},${this.relativePosition.y})`
      );
      this.initialArrows.forEach((arrow) => arrow.onInitialDrag(mouseMovement));
      this.finalArrows.forEach((arrow) => arrow.onFinalDrag(mouseMovement));
    };

    const mouseUpHandler = () => {
      this.document.removeEventListener("mousemove", mouseMoveHandler);
      this.document.removeEventListener("mouseup", mouseUpHandler);
    };

    this.document.addEventListener("mousemove", mouseMoveHandler);
    this.group.addEventListener("mouseup", mouseUpHandler);
  }

  createMenu() {
    var rect = this._createRect(
      this.dimension.width * 1.2,
      this.dimension.height * 1.2
    );
    this.group.appendChild(rect);
    this.svg.svg.appendChild(this.group);
  }

  _createConnector(selfPositionX, selfPositionY) {
    this.connectors.push(
      new Connector(
        {
          x: this.position.x + selfPositionX,
          y: this.position.y + selfPositionY,
        }, this.relativePosition,
        this,
        this.initialArrows,
        this.svg
      )
    );
  }

  _createGroup() {
    var group = document.createElementNS("http://www.w3.org/2000/svg", "g");
    group.appendChild(this.rect);
    group.appendChild(this.text);
    this.connectors.forEach(connector => {group.appendChild(connector.element)})
    return group;
  }

  _createRect(width, height) {
    var rect = document.createElementNS("http://www.w3.org/2000/svg", "rect");
    rect.setAttribute("x", this.position.x);
    rect.setAttribute("y", this.position.y);
    width
      ? rect.setAttribute("width", width)
      : rect.setAttribute("width", this.dimension.width);
    height
      ? rect.setAttribute("height", height)
      : rect.setAttribute("height", this.dimension.height);
    rect.setAttribute("id", "activity");
    rect.setAttribute("stroke-width", "3");
    rect.setAttribute("stroke", "rgb(255,0,0)");
    rect.setAttribute("stroke", "rgb(255,0,0)");
    rect.setAttribute("fill", "rgba(0,0,0,0)");
    return rect;
  }

  _createText() {
    var text = document.createElementNS("http://www.w3.org/2000/svg", "text");
    text.setAttribute("x", this.position.x + 10);
    text.setAttribute("y", this.position.y + 50);
    text.setAttribute("color", "blue");
    text.append("teste");
    return text;
  }
}

class Connector {
  arrowPosition;

  constructor(position, relativePosition, activity, initialArrows, svg) {
    this.initialArrows = initialArrows;
    this.activity = activity;
    this.relativePosition = relativePosition
    this.svg = svg
    this.position = position;
    this._init(position);
    return this;
  }

  _init() {
    this.element = document.createElementNS(
      "http://www.w3.org/2000/svg",
      "circle"
    );
    this.element.setAttribute("cx", this.position.x); // 130. 20
    this.element.setAttribute("cy", this.position.y);
    this.element.setAttribute("r", 10);
    this.element.setAttribute("stroke", "gray");
    this.element.setAttribute("stroke-width", "1");
    this.element.setAttribute("fill", "red");
    this.element.addEventListener("mousedown", (e) => {
      this.initialArrows.push(
        this.svg.createArrow(
          {
            x: this.position.x + this.relativePosition.x,
            y: this.position.y + this.relativePosition.y,
          },
          {
            x: this.position.x + this.relativePosition.x + 10,
            y: this.position.y + this.relativePosition.y + 10,
          }
        )
      );
    });
  }

  updateArrowPosition(){
    this.element.setAttribute("cx", this.position.x); // 130. 20
    this.element.setAttribute("cy", this.position.y);
  }
}
