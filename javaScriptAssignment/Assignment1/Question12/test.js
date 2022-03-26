
function longeToken(str){
    var maxRes = "";
    var res = "";

    for(i =0; i<str.length; i++){
        if(str[i]==='a' || str[i]==='b'){
            res = "";
        }
        else{
            
            res +=str[i];
            if(res.length > maxRes.length){
                maxRes = res;
            }
        }
    }
    return maxRes;

}

console.log(longeToken("ababcdababefgababhiab"))