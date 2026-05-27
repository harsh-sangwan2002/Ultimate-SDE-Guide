/* We are given an array of radiuses, find out the area and circumference of the circles.
*/
function calculateArea(arr) {

    let res = [];

    for (let i = 0; i < arr.length; i++)
        res.push(Math.round(Math.PI * arr[i] * arr[i]));

    return res;
}

function calculateCircumference(arr) {

    let res = [];

    for (let i = 0; i < arr.length; i++)
        res.push(Math.round(2 * Math.PI * arr[i]));

    return res;
}

let arr = [1, 2, 3, 4];
console.log(calculateCircumference(arr));
console.log(calculateArea(arr));