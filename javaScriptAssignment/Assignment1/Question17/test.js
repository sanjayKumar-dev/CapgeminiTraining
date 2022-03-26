var arr = [1,2,3,4,5,6];

function rotate(arr1, n){
    reverse(0, n-1);
    reverse(arr1, n, arr1.length-1);
    reverse(arr1, 0, arr1.length-1);

}

function reverse(arr1, start, end){
    while(start<end){
        var temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end] = temp;
        start++;
        end--;
    }
}
rotate(arr, 2)
console.log(arr);