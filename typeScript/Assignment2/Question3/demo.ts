// let iterable1 = [1,2,3,4,5,6];
// function createIterator1(array:number[]){
//     let count = 0;
//     return{
//         getNextArmstrong1: function(){
//             return count< array.length?
//             {value: array[count++], done:false}:
//             {value: undefined, done:true};
//         }
//     }
// }
// let myIterator1 = createIterator1(iterable1);
// console.log(myIterator1.getNextArmstrong1());
// console.log(myIterator1.getNextArmstrong1());
// console.log(myIterator1.getNextArmstrong1());
// console.log(myIterator1.getNextArmstrong1());
// console.log(myIterator1.getNextArmstrong1());
// console.log(myIterator1.getNextArmstrong1());
// console.log(myIterator1.getNextArmstrong1());
let list=  [153,370,371,407];
function * generatorFunc(n1:number){
    
    for(let item of list){
        yield item;
    }
    yield null;
}
var generatorObject = generatorFunc(128);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
var generatorObject = generatorFunc(128); 
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);