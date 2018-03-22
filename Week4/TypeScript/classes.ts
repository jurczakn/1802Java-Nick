//classes create blueprints - it will translate into JS, creating a constructor,
// and use for type checking
//in angular classes used for components, services, directives, pipes, and many others

//vvv allows class to be accessible outside of .ts file it is defined in
export class Pokemans{

    //fields
    type: string;
    id: number;
    name: string;
    //^^^^ by defualt they are public fields
    //vvvv can use access modifiers
    private level: number;

    //vvv protected works same way as in Java
    protected readonly shiny: boolean;
    //        ^^^^^ read only works like const in JavaScript


    constructor(public color: string){

    }

    public getLevel(): number{

        return this.level;

    }

    //vvvv does same thing as in Java
    static makePokemanNoise(){

        console.log("I am a pokeman");

    }

}

let meowth = new Pokemans('grey');
meowth.id = 52;
meowth.name = 'meowth, thats right';
meowth.type = 'normal';
//cannot access private members outside class
//meowth.level = 5;
console.log(meowth.getLevel());
Pokemans.makePokemanNoise();

//There is inheritance
export class NewPokemans extends Pokemans{}