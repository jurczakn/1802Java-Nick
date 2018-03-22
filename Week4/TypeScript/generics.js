"use strict";
exports.__esModule = true;
var classes_1 = require("./classes");
var numArray;
numArray = [1, 2, 3, 4, 5, 6, 7];
//numArray = ['hi', 'bye'];
function identity(arg) {
    return arg;
}
var GenericClass = /** @class */ (function () {
    function GenericClass() {
    }
    return GenericClass;
}());
var Trainer = /** @class */ (function () {
    function Trainer() {
    }
    return Trainer;
}());
var t = new Trainer();
t.myPoke = new classes_1.NewPokemans('');
t.myPoke = new classes_1.Pokemans('');
