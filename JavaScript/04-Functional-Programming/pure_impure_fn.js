/* 
If a function modifies the external variables or state of an object it is called as an impure function.
*/
function sum(arr) {

    let total = 0;
    arr[0] = 0;

    for (let i = 0; i < arr.length; i++)
        total += arr[i];

    return total;
}

let arr = [1, 2, 3, 4];
console.log(sum(arr)); // 9
console.log(arr); // [0, 2, 3, 4]

function sum1(a, b, c, d) {
    let total = 0, arr = arguments;
    arr[0] = 0;

    console.log(typeof arr);
    for (let i = 0; i < arr.length; i++)
        total += arr[i];

    return total;
}

let i = 1, j = 2, k = 3, l = 4;
console.log(sum1(i, j, k, l));
console.log(i, j, k, l);

var c = 0;

function sum2(a, b,) {

    return a + b + c++;
}
console.log(sum2(1, 2));
console.log(sum2(1, 2));