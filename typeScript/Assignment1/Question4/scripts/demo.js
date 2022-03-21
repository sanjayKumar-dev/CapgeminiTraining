"use strict";
let arr = ["abc", "abcd", "xyzabc"];
let obj = [];
let objArr = (arr) => {
    for (let a of arr) {
        obj.push({ name: a, length: a.length });
    }
};
objArr(arr);
console.log(obj);
//# sourceMappingURL=demo.js.map