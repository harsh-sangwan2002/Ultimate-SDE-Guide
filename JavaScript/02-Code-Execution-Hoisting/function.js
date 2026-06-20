// 1. Function declaration
function sum(a, b) {
  return a + b;
}
console.log(sum(1, 2)); // 3

// 2. Function expression / Anonymous Function
var sum = function (a, b) {
  return a + b;
};
console.log(sum(2, 3)); // 5

// 3. Named Function Expression
var sum = function sum(a, b) {
  return a + b;
};
console.log(sum(3, 4)); // 7

// 4. Arrow Function
var sum = (a, b) => a + b;
console.log(sum(4, 5)); // 9

// 5. IIFE Function
console.log(
  (function (a, b) {
    return a + b;
  })(5, 6),
);

// 6. Nested Function
function test(a, b) {
  return function () {
    return a + b;
  };
}

var t1 = test(1, 2);
console.log(typeof t1);
console.log(t1());

// 7. Callback Function
function compute(fn, a, b) {
  return fn(a, b);
}

function sum(a, b) {
  return a + b;
}

function sub(a, b) {
  return a - b;
}

console.log(compute(sum, 1, 2));
console.log(compute(sub, 10, 2));
