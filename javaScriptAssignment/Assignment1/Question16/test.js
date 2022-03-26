var n = prompt("Enter Row", 2);
var m = prompt("Enter Col", 2);

var x = ["row0", "row1", "row3", "row4"];
var count = 0;
for(i=0; i<n; i++){
    var row = document.createElement("tr")
    row.setAttribute("id", x[count]);
    var element = document.getElementById("table");
    element.appendChild(row);
    count++;
}



for(j=0;j<count; j++){
    for(i=0; i<m; i++){
        var col = document.createElement("td");
        const node = document.createTextNode("col");
        col.appendChild(node);
        var ele = document.getElementById(x[j]);
        ele.appendChild(col);
    }
}