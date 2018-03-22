import {Pokemans, NewPokemans} from './classes';

//Interfaces are contracts for other classes and objects
//Can be used to define custom types without creating a class
interface Pokeball {

    type: string;
    color: string;
    amount: number;
    //can have optional fields in interface
    pokemon?: Pokemans;

}

interface Catchable {

    catch(): void;

}

let mypoke:Catchable = {

    catch: function(){

        //..

    }

}

let pokeball: Pokeball;

pokeball = {type: 'master ball', color: 'purple', amount: 1};
//pokeball = {type: 'master', color: 'green'};
pokeball = {type: 'master ball', color: 'purple', amount: 1, pokemon: new Pokemans('something')};