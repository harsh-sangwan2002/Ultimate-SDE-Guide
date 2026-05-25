function memorizedSum() {
    const res = {};

    return function (arr) {
        if (res[arr]) {
            console.log("Memorized Sum: ", res);
            return res[arr];
        }

        else {
            console.log("Computing...", res);
            return res[arr] = arr[0] + arr[1];
        }
    }
}

const s1 = memorizedSum();
console.log(s1([1, 2]));
console.log(s1([1, 2]));

console.log(s1([2, 3]));
console.log(s1([2, 3]));