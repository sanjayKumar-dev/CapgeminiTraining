var n = prompt("Enter the Numbe", 5);
var sum = 0;
for(i=1; i<=n; i++){
    sum+=i;
}
//console.log(sum);
document.getElementById("demo").innerHTML = sum;