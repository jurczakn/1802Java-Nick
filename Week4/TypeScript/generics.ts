import {Pokemans, NewPokemans} from './classes';

let numArray: Array<number>;

numArray = [1, 2, 3, 4, 5, 6, 7];

//numArray = ['hi', 'bye'];

function identity<T>(arg: T): T{

    return arg;

}

interface GenericInterface<T>{

    stuff: T;

    (arg:T): T;

}

class GenericClass<T, D, E> {

    stuff: T;
    stuff2: T;

    add: (x:T, y:T) => T;

}

class Trainer<T extends Pokemans> {

    myPoke: T;

}

let t: Trainer<NewPokemans> = new Trainer<NewPokemans>();

t.myPoke = new NewPokemans('');

t.myPoke = new Pokemans('');
