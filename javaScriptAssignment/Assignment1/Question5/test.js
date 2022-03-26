var year = 2020;
var n = 20;
var count = 0;

while(count!=n){
    year++;
    if((year%400 ===0) ||
        (year%4===0 && year%100 !=0)){
            count++;
            console.log(year);
        }
}