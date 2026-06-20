// Closure => A function bundled with it's lexical or outer environment is known as a closure.
function sum(x) {
  return function (y) {
    return x + y;
  };
}

const s1 = sum(1);
console.log(s1(2)); // 3
console.log(s1(3)); // 4
console.log(s1(4)); // 5

const s2 = sum(2);
console.log(s2(3)); // 5
console.log(s2(4)); // 6
console.log(s2(5)); // 7
