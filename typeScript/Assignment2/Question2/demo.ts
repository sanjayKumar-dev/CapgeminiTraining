function checkArm(num: number){
    let temp = num;
    let r=0;
    let sum = 0;
    while(num>0){
        r = num%10;
        sum = sum + (r*r*r);
        num = num/10;
    }

    if(temp == sum){
        return true;
    }
    else{
        return false;
    }
}

for(let i=0; i<1000; i++){
    let ans = checkArm(i);
    if(ans == true){
        console.log(i);
    }
}


let iterable1 = [1,2,3,4,5,6];
function createIterator1(array:number[]){
    let count = 0;
    return{
        getNextArmstrong1: function(){
            return count< array.length?
            {value: array[count++], done:false}:
            {value: undefined, done:true};
        }
    }
}
let myIterator1 = createIterator1(iterable1);
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());
console.log(myIterator1.getNextArmstrong1());




