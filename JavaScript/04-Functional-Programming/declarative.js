let radiuses = [1, 2, 3, 4, 5];

const computeCircumference = (radius) => 2 * Math.PI * radius;
const computeArea = (radius) => Math.PI * radius * radius;

const calculate = (arr, cb) => arr.map((radius) => Math.round(cb(radius)));

console.log(calculate(radiuses, computeCircumference));
console.log(calculate(radiuses, computeArea));
