const calculateArea = (radius) => Math.round(Math.PI * radius * radius);
const calculateCircumference = (radius) => Math.round(2 * Math.PI * radius);

const compute = (fn, arr) => arr.map(radius => fn(radius));

let arr = [1, 2, 3, 4];
console.log(compute(calculateCircumference, arr));
console.log(compute(calculateArea, arr));