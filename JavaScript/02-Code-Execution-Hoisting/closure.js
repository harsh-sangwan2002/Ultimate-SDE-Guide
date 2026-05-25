function sum(a, b) {
    return function () {
        return a + b;
    }
}

const s1 = sum(1, 2);
console.log(s1);
console.log(typeof s1); // function
console.log(s1());

function compute(fn, x, y) {
    return fn(x, y);
}

var agg = function (a, b) {
    return a + b;
}

var sub = function (a, b) {
    return a - b;
}

console.log(compute(agg, 1, 2));
console.log(compute(sub, 1, 2));