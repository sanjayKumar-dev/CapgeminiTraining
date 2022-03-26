function isEven(num){
    return (num%2 == 0);
}

function find(arr, fun){
    for(i=0;i<arr.length-1; i++){
        if(fun(arr[i])){
            return arr[i];
        }
    }
}

console.log(isEven(3));
console.log(isEven(4));

var arr = [1, 3, 5, 4, 2];
console.log(find(arr, isEven));