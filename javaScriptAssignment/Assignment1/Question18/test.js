var str = "The quick brown fox";

var temp = str.split(" ");

for(i=0; i<temp.length; i++){
    var char = temp[i].charAt(0);
    temp[i] = temp[i].substring(1, temp[i].length)+char+"ay";
}

console.log(temp);

for(i=0; i<temp.length; i++){
    str += temp[i].toLowerCase()+" "; 
}
console.log(str);