const txt = '{"name":"abc", "lastNAme":"xyz"}'
var store = JSON.parse(txt);

console.log(store)

var str = ({
    firstName : "Sanjay",
    lastName : "Kumar"
})

var res = eval(str);
console.log(res);

console.log(typeof(str));