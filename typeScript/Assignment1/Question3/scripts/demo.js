"use strict";
let Order = {
    id: 123,
    title: "Hey This is tiltle",
    price: 50,
    printOrder() {
        console.log(this.id);
        console.log(this.title);
        console.log(this.price);
    },
    getPrice() {
        return this.price;
    }
};
let copy = Object.assign({}, Order);
console.log(copy);
//# sourceMappingURL=demo.js.map