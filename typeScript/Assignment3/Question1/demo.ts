var add1 = function(A:any,B:any)
{
    return new Promise((resolve,reject)=>
    {
        var sum=A+B;
        if(sum)
        {
            resolve(sum);
        }
        else
        {
           reject(Error("Could not add the two values")) ;
        }
    });
;
}
add1(2,5).then((added)=>{
    console.log("Addition is: "+added);
});

// let valx = new Promise<number>((resolve, reject) => {
//     resolve(5);
// });
// console.log(valx);

// let valy = new Promise<string>((resolve, reject) => {
//     resolve("sanjay");
// });
// console.log(valy);