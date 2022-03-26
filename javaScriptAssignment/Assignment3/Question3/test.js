class Rect{
    constructor(height, width){
        this.height = height;
        this.width = width;
    }

    getArea(){
        return this.height*this.width;
    }
}

var myClass = new Rect(20, 50);

console.log(myClass.height);
console.log(myClass.width);

myClass.height = 500;
myClass.width = 100;

console.log("Height : "+myClass.height);
console.log("Width : "+myClass.width);
console.log("Area : "+myClass.getArea());

//Rect r = new Rect(4, 5);
//cant create the intance like this;