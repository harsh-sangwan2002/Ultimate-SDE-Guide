// Impure functions modifies the state of outer variables or objects
// Example - 1
function sum1(arr) {
  let total = 0;
  arr[0] = 0;

  for (let i = 0; i < arr.length; i++) total += arr[i];

  return total;
}

let newArr = [1, 2, 3, 4];
console.log(sum1(newArr)); // 9
console.log(newArr);

// Example - 2
function sum2() {
  let arr = arguments,
    total = 0;
  arr[0] = 0;

  console.log(arguments);
  console.log(typeof arguments); // object
  console.log(arguments instanceof Array);

  for (let i = 0; i < arr.length; i++) total += arr[i];

  return total;
}

let i = 1,
  j = 2,
  k = 3,
  l = 4;
console.log(sum2(i, j, k, l)); // 9
console.log(i, j, k, l);

// Example - 3
let newArr1 = [1, 2, 3, 4];

function sum3() {
  newArr1[0] = 0;
  let total = 0;

  for (let i = 0; i < newArr1.length; i++) total += newArr1[i];

  return total;
}

console.log(sum3());
console.log(newArr1);

newArr1[2] = 5;
console.log(sum3());

newArr1[3] = 10;
console.log(sum3());

// Example - 4
var c = 0;

function sum4(a, b) {
  return a + b + c++;
}

console.log(sum4(1, 2)); // 3
console.log(sum4(1, 2)); // 4
