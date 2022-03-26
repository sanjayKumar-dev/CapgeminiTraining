var n = prompt("Enter the Numbe", 5);
var sum = 0;
for(i=1; i<=n; i++){
    if(find(i) === true)
        sum+=i;
}
//console.log(sum);
document.getElementById("demo").innerHTML = sum;

function find(x){
    if(x%3 ===0 || x%5 ===0)
        return true;
    else
        return false;
}