function memorizedSum() {
  let res = {};

  return function (arr) {
    if (res[arr]) {
      console.log("Memory", res);
      return res[arr];
    } else {
      console.log("Computing", res);
      return (res[arr] = arr[0] + arr[1]);
    }
  };
}

const sum = memorizedSum();
console.log(sum([1, 2]));
console.log(sum([1, 2]));

console.log(sum([2, 3]));
console.log(sum([2, 3]));
