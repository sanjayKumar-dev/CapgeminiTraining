
var randomNum = [];
for(i=0;i<100; i++){
    randomNum[i] = Math.floor(Math.random() * 101)
}

console.log(randomNum);

randomNum.sort(function(a, b) {return a-b} );
console.log("Largest Number "+randomNum[99]);
console.log("Samllest Number "+randomNum[0]);

function evenOdd(randomNum){
    var evenCount = 0;
    var oddCount = 0;

    for(i=0;i<100; i++){
        if(randomNum[i]%2 == 0)
            evenCount+=1;
        else
            oddCount+=1;
    }
    if(evenCount > oddCount){
        console.log("Even Count : "+ evenCount);
    }
    else{
        console.log("Odd Count : "+ oddCount);
    }
}

evenOdd(randomNum);

var sum = 0;
for(i=0;i<100; i++){
    sum+=randomNum[i];
}

console.log("Sum : "+ sum );
console.log("Average : "+ sum/100 );

