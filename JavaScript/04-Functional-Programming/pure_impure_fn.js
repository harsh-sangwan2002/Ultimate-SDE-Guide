// Example - 1
function sum(arr) {
  arr[0] = 0;
  let total = 0;

  for (let i = 0; i < arr.length; i++) total += arr[i];

  return total;
}

let arr = [1, 2, 3, 4, 5];
console.log(sum(arr));
console.log(arr);

// Example - 2
function sum1(a, b, c, d) {
  let arr = arguments;
  arr[0] = 0;

  let total = 0;
  for (let i = 0; i < arr.length; i++) total += arr[i];

  return total;
}

let i = 1,
  j = 2,
  k = 3,
  l = 4;
console.log(sum1(i, j, k, l));

// Example - 3
var c = 0;

function sum(a, b) {
  return a + b + c++;
}
console.log(sum(1, 2)); // 3
console.log(sum(1, 2)); // 4
