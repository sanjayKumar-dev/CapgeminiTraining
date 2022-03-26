"use strict";
function checkArm(num) {
    let temp = num;
    let r = 0;
    let sum = 0;
    while (temp > 0) {
        r = temp % 10;
        sum = sum + (r * r * r);
        temp /= 10;
    }
    if (num === sum) {
        return true;
    }
    return false;
}
for (let i = 0; i < 1000; i++) {
    let ans = checkArm(i);
    if (ans === true) {
        console.log(i);
    }
}
let iterable1 = [153, 370, 371, 407];
function createIterator1(array) {
    let count = 0;
    return {
        getNextArmstrong1: function () {
            return count < array.length ?
                { value: array[count++], done: false } :
                { value: undefined, done: true };
        }
    };
}
let myIterator1 = createIterator1(iterable1);
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
//# sourceMappingURL=demo.js.map