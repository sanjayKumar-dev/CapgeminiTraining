
var randomNum = [];
for(i=0;i<20; i++){
    randomNum[i] = Math.floor(Math.random() * 101)
}

console.log("Before Bubble Sort : "+randomNum);

function bubbleSort(arr){
    for(i=0; i<arr.length; i++){
        for(j=0; j<(arr.length -i -1); j++){
            if(arr[j]>arr[j+1]){
                var temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
bubbleSort(randomNum);
console.log("After Bubble Sort : "+randomNum);
