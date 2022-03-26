class person   {
    constructor(fname,lname,age,skills,dateofbirth,address,married,profession)
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.skills=skills;
        this.dateofbirth=dateofbirth;
        this.address=address; 
        this.married=married;
        this.profession=profession;
    
    }
}

var person1=new 
person("nikhil","goud",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
var person2=new 
person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jr analyst");

function print(per){
    console.log("fname : "+per.fname);
    console.log("lname : "+per.lname);
    console.log("age : "+per.age);
    console.log("skills : "+per.skills);
    console.log("DOB : "+per.dateofbirth);
    console.log("address : "+per.address);
    console.log("Married : "+per.married);
    console.log("Professions : "+per.profession)
}
var person3 = new person("harish","chinna",21,"HTML","08/06/1997");
var person3=Object.create(person1);
print(person3);