var x = 123;
console.log(x);
console.log(typeof x); // number -> 64 bits +-(2^53-1)

console.log('---------------------------------');

x = "Hello";
console.log(x);
console.log(typeof x); // string -> 2 bytes per character

console.log('---------------------------------');

x = true;
console.log(x);
console.log(typeof x); // boolean

console.log('---------------------------------');

x = undefined;
console.log(x);
console.log(typeof x); // undefined

console.log('---------------------------------');

x = null;
console.log(x);
console.log(typeof x); // object

console.log('---------------------------------');

x = 123768712638761287637816287387n;
console.log(x);
console.log(typeof x); // bigint

console.log('---------------------------------');

x = Symbol('123');
console.log(x);
console.log(typeof x); // symbol