window.onload = function(){

    document.getElementById("pokemonSubmit").addEventListener("click", getPokemon, false);

}

function displayPokemon(pokemon){

    document.getElementById("pokemonname").innerHTML = pokemon.name;

}

function getPokemon(){

    var pokemonId = document.getElementById("pokemonid").value;

    //Step  1. make XHR
    var xhr = new XMLHttpRequest();

    //Step 2. function to handle ready state change of the response
    xhr.onreadystatechange = function(){

        if(xhr.readyState === 4 && xhr.status === 200){

            var pokemon = JSON.parse(xhr.responseText);
            console.log(pokemon);
            displayPokemon(pokemon);

        }

        else {

            console.log(xhr.readyState);
            if(xhr.readyState === 4){

                console.log(xhr.status);

            }

        }

    }
    xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/" + pokemonId, true);
    xhr.send();
}