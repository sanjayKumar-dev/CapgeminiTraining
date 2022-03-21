class genFibonacci{
    prev: number;
    curr: number;
    constructor(prev: number, curr: number){
        this.prev = prev;
        this.curr = curr;
    }

    next(){

        return this.prev+this.curr;
    }
}

let obj1 = new genFibonacci(1, 2);
console.log(obj1.next());