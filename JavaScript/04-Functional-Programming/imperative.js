let radiuses = [1, 2, 3, 4, 5];

function calculateCircumference(arr) {
  let res = [];

  for (let i = 0; i < arr.length; i++)
    res.push(Math.round(2 * Math.PI * arr[i]));

  return res;
}

function calculateArea(arr) {
  let res = [];

  for (let i = 0; i < arr.length; i++)
    res.push(Math.round(Math.PI * arr[i] * arr[i]));

  return res;
}

console.log(calculateCircumference(radiuses));
console.log(calculateArea(radiuses));
