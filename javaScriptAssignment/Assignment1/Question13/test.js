
function sumForLoop(num){
    var sum = 0;
    for(i=0; i<num.length; i++){
        sum += num[i];
    }
    return sum;
}

function sumWhileLoop(num){
    var sum = 0;
    var i =0;
    while(i<num.length){
        sum += num[i];
        i++;
    }
    return sum;
}

function sumDoWhileLoop(num){
    var sum = 0;
    var i =0;
    do{
        sum += num[i];
        i++;
    }
    while(i<num.length);
    return sum;
}

var arr = [1, 2, 3, 4, 5, 6, 7];

console.log("Using For Loop "+sumForLoop(arr));
console.log("Using While Loop "+sumWhileLoop(arr));
console.log("Using Do While Loop "+sumDoWhileLoop(arr));