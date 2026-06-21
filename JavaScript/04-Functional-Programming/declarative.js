// We are given an array of radius of circles => Calculate the area and circumference of the circles
const calculateArea = (radius) => Math.round(Math.PI * radius * radius);
const calculateCircumference = (radius) => Math.round(2 * Math.PI * radius);

const compute = (arr, fn) => arr.map((radius) => fn(radius));

let radiuses = [1, 2, 3, 4, 5];

console.log(compute(radiuses, calculateArea));
console.log(compute(radiuses, calculateCircumference));
