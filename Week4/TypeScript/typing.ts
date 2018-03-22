//TypeScript - strong typing allows us to define types for our variables
let myString: string;

myString = 'This is my String';

//trying to assign a number to a string - myString, causes Error
//myString = 4;

//TypeScript can also infer types
let anotherString = 'This is a string without :string';

//anotherString = 4;

let yetAnotherString;

yetAnotherString = 'this is a string';
yetAnotherString = 4;

//Other basic types
let aString: string;
let aNumber: number;
let aBoolean: boolean;
let anArray: Array<string>;
let aTuple: [string, number];
let anything: any;
//avoid using any, bad practice
let nothing: void;
let never: never;
enum MyEnum {hello, goodbye, ok};
let myEnum: MyEnum;
myEnum = MyEnum.goodbye;