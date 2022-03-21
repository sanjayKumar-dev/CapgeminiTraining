let arr = ["abc", "abcd", "xyzabc"];
let obj: { name: any; length: any; }[] = [];
let objArr = (arr: any) =>{
    for(let a of arr){
        obj.push({name: a, length: a.length});
    }
}

objArr(arr);

console.log(obj);