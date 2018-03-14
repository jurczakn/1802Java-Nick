function addTree(x){

    var id = document.getElementById("t_id").value;
    var species = document.getElementById("t_species").value;
    var age = document.getElementById("t_age").value;
    var height = document.getElementById("t_height").value;

    console.log(x);
    console.log("id: "+id);
    console.log("species: "+species);
    console.log("age: "+age);
    console.log("height: "+height);

}

window.onload = function(){

    var button = document.getElementById("add_tree");

    button.addEventListener("click", function(){addTree(5)});

}