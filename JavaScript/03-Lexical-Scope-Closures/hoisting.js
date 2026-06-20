// Q-1
// console.log(a); // [Function: a]

// var a = 10;

// function a() {
//   console.log("Function A");
// }

// console.log(a); // 10

// Q-2
// console.log(a()); // Declared Function

// var a = function () {
//   return "Variable Function";
// };

// function a() {
//   return "Declared Function";
// }

// Q-3
// var a = 100;

// function a() {
//   return 200;
// }

// console.log(typeof a); // number
// console.log(a); // 100

// Q-4
// console.log(a); // [Function: a]

// function a() {
//   return 1;
// }

// var a = 20;

// function a() {
//   return 2;
// }

// console.log(a); // 20

function a() {
  return "First";
}

var a;

console.log(a()); // First

var a = function () {
  return "Second";
};

console.log(a()); // Second
