"use strict";
/* var x = 9
console.log(x) //<------Semi Colon injection

function add(x, y){
    "use strict";

    return x
     + y
     console.log(x)

} */

function displayCoffee(coffee){
	
	var p = document.getElementById("stuff");
	p.innerHTML = "roast: " + coffee.roast + " size: " + coffee.size;
	
}

function getCoffee(){

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){

        console.log(xhr.readyState);

        if(xhr.readyState === 4 && xhr.status === 200){

            console.log(xhr.responseText);
            var coffee = JSON.parse(xhr.responseText);
            displayCoffee(coffee);
            
        }

    }

    xhr.open("GET", "coffee.json", true);
    xhr.send();

}

window.onload = function(){

    document.getElementById("myButton").addEventListener("click", getCoffee, false);

}