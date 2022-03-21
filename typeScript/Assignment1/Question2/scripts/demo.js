"use strict";
let x = 10;
if (x == 10) {
    let a = 5;
}
else {
    let a = 6;
}
//console.log(a); cannot print a becase its scope is only in if and else block
// to use it ue can use var insted of let
if (x == 10) {
    var a = 5;
}
else {
    var a = 6;
}
console.log(a);
//# sourceMappingURL=demo.js.map