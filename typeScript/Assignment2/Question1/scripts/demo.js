"use strict";
class genFibonacci {
    constructor(prev, curr) {
        this.prev = prev;
        this.curr = curr;
    }
    next() {
        return this.prev + this.curr;
    }
}
let obj1 = new genFibonacci(1, 2);
console.log(obj1.next());
//# sourceMappingURL=demo.js.map