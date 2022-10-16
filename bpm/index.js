import Svg from './Svg.js'



document.addEventListener("DOMContentLoaded", function(event) { 
    draw();
  });


function draw(){
    let svg = new Svg(800,600,document);
    document.getElementsByTagName('button')[0].addEventListener('click', () => {
        svg.createActivity()
    })
    document.getElementsByTagName('button')[1].addEventListener('click', () => {
        svg.createArrow()
    })
    
}
