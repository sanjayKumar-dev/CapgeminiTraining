// function map(arr, fun){
//     for(i=0; i<arr.length; i++){
//         arr[i] = fun(arr[i]);
//     }
// }

function square(num){
    return num*num;
}

// var arr = [1, 2, 3, 4, 5];
// map(arr, square);
// console.log(arr);

// var arr1 = [1, 4, 9, 16, 25];
// map(arr1, Math.sqrt);
// console.log(arr1);

var i = 0;
function mapRecc(arr, fun){
    if(i<arr.length){
        arr[i] = fun(arr[i]);
        i++;
        mapRecc(arr, fun);
    }
}

var arr3 = [1, 2, 3, 4, 5];
mapRecc(arr3, square);
console.log(arr3);

var arr4 = [1, 4, 9, 16, 25];
mapRecc(arr4, Math.sqrt);
console.log(arr4);