function map(arr, fun){
    for(i=0; i<arr.length; i++){
        arr[i] = fun(arr[i]);
    }
}

function square(num){
    return num*num;
}

var arr = [1, 2, 3, 4, 5];
map(arr, square);
console.log(arr);

var arr1 = [1, 4, 9, 16, 25];
map(arr1, Math.sqrt);
console.log(arr1);