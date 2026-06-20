// There are 7 primitive types in JS => number, string, boolean, null, undefined, bigint, and symbol
var x = 10;
console.log(x);
console.log(typeof x); // number

console.log("----------------------");

x = "Hello";
console.log(x);
console.log(typeof x); // string

console.log("----------------------");

x = true;
console.log(x);
console.log(typeof x); // boolean

console.log("----------------------");

x = undefined;
console.log(x);
console.log(typeof x); // undefined

console.log("----------------------");

x = null;
console.log(x);
console.log(typeof x); // object

console.log("----------------------");

x = 123456789123456789123456789123456789n;
console.log(x);
x = BigInt("962137498263478962193846982763478");
console.log(x);
console.log(typeof x); // bigint

console.log("----------------------");

x = Symbol(123);
console.log(x);
x = Symbol("123");
console.log(x);
console.log(typeof x); // symbol

console.log("----------------------");
