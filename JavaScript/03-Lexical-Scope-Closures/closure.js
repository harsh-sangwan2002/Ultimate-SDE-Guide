/*
Closure is a function that "remembers" its surrounding state (the lexical environment) even after that surrounding environment has finished executing. Closures are created every time a function is defined within another function
*/
function sum(x) {
    return function (y) {
        return x + y;
    }
}

const sum1 = sum(1);

console.log(sum1(2));
console.log(sum1(3));
console.log(sum1(4));

console.log('-------------------------------------------');

const sum2 = sum(2);

console.log(sum2(2));
console.log(sum2(3));
console.log(sum2(4));