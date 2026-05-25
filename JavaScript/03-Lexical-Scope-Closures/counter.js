function counter() {
    let x = 0;

    return function () {
        return ++x;
    }
}

let myCounter = counter();
console.log(myCounter()); // 1
console.log(myCounter()); // 2
console.log(myCounter()); // 3