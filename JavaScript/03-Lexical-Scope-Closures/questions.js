// Q-1
// console.log(foo); // [Function: foo]

// var foo = 10;

// function foo() {
//   return 20;
// }

// Q-2
// console.log(foo()); // 20

// var foo = 10;

// function foo() {
//   return 20;
// }

// Q-3
// var foo = 10;

// function foo() {
//   return 20;
// }

// console.log(foo); // 10

// Q-4
// function foo() {
//   return 20;
// }

// var foo = 10;

// console.log(foo()); // TypeError: foo is not a function

// Q-5
// console.log(foo); // [Function: foo]

// function foo() {
//   return 1;
// }

// var foo = 2;

// console.log(foo); // 2

// Q-6
// function foo() {
//   return 1;
// }

// var foo;

// console.log(foo); // [Function: foo]

// Q-7
// var foo = 1;

// function foo() {
//   return 2;
// }

// function foo() {
//   return 3;
// }

// console.log(foo); // 1

// Q-8
// console.log(foo); // [Function: foo]

// var foo = function () {
//   return 10;
// };

// function foo() {
//   return 20;
// }

// Q-9
// console.log(foo()); // 20

// var foo = function () {
//   return 10;
// };

// function foo() {
//   return 20;
// }

// Q-10
var foo = function () {
  return 10;
};

function foo() {
  return 20;
}

console.log(foo()); // 10