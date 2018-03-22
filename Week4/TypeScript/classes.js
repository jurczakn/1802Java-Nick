"use strict";
//classes create blueprints - it will translate into JS, creating a constructor,
// and use for type checking
//in angular classes used for components, services, directives, pipes, and many others
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
//vvv allows class to be accessible outside of .ts file it is defined in
var Pokemans = /** @class */ (function () {
    //        ^^^^^ read only works like const in JavaScript
    function Pokemans(color) {
        this.color = color;
    }
    Pokemans.prototype.getLevel = function () {
        return this.level;
    };
    //vvvv does same thing as in Java
    Pokemans.makePokemanNoise = function () {
        console.log("I am a pokeman");
    };
    return Pokemans;
}());
exports.Pokemans = Pokemans;
var meowth = new Pokemans('grey');
meowth.id = 52;
meowth.name = 'meowth, thats right';
meowth.type = 'normal';
//cannot access private members outside class
//meowth.level = 5;
console.log(meowth.getLevel());
Pokemans.makePokemanNoise();
//There is inheritance
var NewPokemans = /** @class */ (function (_super) {
    __extends(NewPokemans, _super);
    function NewPokemans() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return NewPokemans;
}(Pokemans));
exports.NewPokemans = NewPokemans;
