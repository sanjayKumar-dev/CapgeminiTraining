function square(x){
    return x*x;
}

function double(x){
    return x*2;
}

function compose(f1, f2, x){
    return f1(f2(x));
}

console.log(compose(square, double, 5));
console.log(compose(double, square, 5));