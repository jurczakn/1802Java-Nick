function bubble(element){

    element.style.backgroundColor = "green";
    alert(element.id);

}

window.onload = function(){

    //Event Propagation
    //2 types, set by last parameter of addEventListener() method
    //Sets to bubbling or capturing
    //bubbling runs events from innermost to outermost element, set using false
    //capturing runs events from outermost to innermost element, set using true
    document.getElementById("A").addEventListener("click", function(){bubble(this)}, true);
    document.getElementById("B").addEventListener("click", function(){bubble(this)}, true);
    document.getElementById("C").addEventListener("click", function(){bubble(this)}, true);
    document.getElementById("D").addEventListener("click", function(){bubble(this)}, true);
    

}