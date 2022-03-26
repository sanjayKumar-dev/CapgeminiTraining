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

function findResc(arr, fun){
    if(fun(arr[0]) == true ){
        return arr[0];
    }
    else{
        findResc((arr.slice(1, arr.length)), fun);
    }
}

// console.log(isEven(3));
// console.log(isEven(4));

var arr = [1, 3, 5, 4, 2];
console.log(find(arr, isEven));
console.log(findResc(arr, isEven));