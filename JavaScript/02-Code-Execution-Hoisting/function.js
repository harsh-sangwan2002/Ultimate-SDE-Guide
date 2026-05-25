// 1. Function declaration
function sum(a, b) {
    return a + b;
}
console.log(sum(1, 2)); // 3

// 2. Anonymous function
var sum = function (a, b) {
    return a + b;
}
console.log(sum(2, 3)); // 5

// 3. Named function expression
var sum = function sum(a, b) {
    return a + b;
}
console.log(sum(3, 4)); // 7

// 4. Arrow function
var sum = (a, b) => a + b;
console.log(sum(4, 5)); // 9