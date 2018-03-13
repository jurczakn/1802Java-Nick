console.log("Hello World");
//this is a comment
var a = 5;

a = "a new string";

console.log(a);

var b, c, d, e, f, g, h, i;

b = `5`;
c = true;
d = {};
e = null;
g = [];
i = function(){};

function changeString(myVar){

    console.log("myVar inside changeString "+myVar);
    myVar="New String";
    console.log("new value of myVar " + myVar);

}

var myString = "Old value";
changeString(myString);
console.log("Value outside method " + myString);
