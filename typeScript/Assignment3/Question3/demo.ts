interface printable {
    print(a: any):void;
}


class circle implements printable{
    radius: number;
    constructor(radius: number){
        this.radius = radius;
    }
    print(): void {
        console.log(this.radius);
    }
    
}

class employee implements printable{
    name: string;
    constructor(name: string){
        this.name = name;
    }
    print(): void {
        console.log(this.name);
    }
    
}

let obj1 = new circle(10);
let obj2 = new employee("Sanjay");
obj1.print();
obj2.print();