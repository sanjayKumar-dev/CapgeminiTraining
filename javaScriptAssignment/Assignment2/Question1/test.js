function square(x){
    return x*x;
}

function double(x){
    return x*2;
}

function composedValue(x){
    return square(double(x));
}

console.log(composedValue(5));