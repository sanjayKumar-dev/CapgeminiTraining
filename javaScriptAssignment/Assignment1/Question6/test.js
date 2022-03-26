var list = ["Hello", "World", "in", "a", "frame"] ;

function printPattern(arr){

    for(i=0;i<arr.length; i++){
        if(i==0){
            console.log("*********************");
            console.log("*"+arr[i]+"*");
        }
        else if(i==arr.length-1){
            console.log("*"+arr[i]+"*");
            console.log("*********************");
        }
        else{
            console.log("*"+arr[i]+"*");
        }
    }
}

printPattern(list);