var arr1 = ['a','b','c'];
var arr2 = [1,2,3];

var arr;
// var children = arr1.concat(arr2); 

function concatArrAlt(arr1, arr2){
    var i = 0;
    var j = 0;
    while(i<arr1.length && j<arr2.length){
        arr += arr1[i];
        arr+= arr2[j];
        i++;
        j++;
    }
}
concatArrAlt(arr1, arr2);
console.log(arr);