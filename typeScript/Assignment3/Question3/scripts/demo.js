"use strict";
class circle {
    constructor(radius) {
        this.radius = radius;
    }
    print() {
        console.log(this.radius);
    }
}
class employee {
    constructor(name) {
        this.name = name;
    }
    print() {
        console.log(this.name);
    }
}
let obj1 = new circle(10);
let obj2 = new employee("Sanjay");
obj1.print();
obj2.print();
//# sourceMappingURL=demo.js.map