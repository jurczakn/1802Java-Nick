"use strict";
/* var x = 9
console.log(x) //<------Semi Colon injection

function add(x, y){
    "use strict";

    return x
     + y
     console.log(x)

} */

function getCoffee(){

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){

        console.log(xhr.readyState);

        if(xhr.readyState === 4 && xhr.status === 200){

            console.log(xhr.responseText);

        }

    }

    xhr.open("GET", "", true);
    //xhr.setRequestHeader("Access-Control-Allow-Origin", "*");
    xhr.send();

}

window.onload = function(){

    document.getElementById("myButton").addEventListener("click", getCoffee, false);

}