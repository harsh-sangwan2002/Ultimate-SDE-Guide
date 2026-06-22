const res = new Promise((resolve, reject) => {

    const passing_marks = 70, current_marks = 60;

    if (current_marks > passing_marks)
        resolve("Passed");

    else
        reject("Failed");
})

console.log(res);

res.then(val => {
    console.log("then => ", val);
}).catch(err => {
    console.log("catch => ", err);
})

const toss = new Promise((resolve, reject) => {

    let isHead = Math.random() > 0.5;

    if (isHead)
        resolve("It's a head");

    else
        reject("It's a tail");
})

console.log(toss);

toss.then(res => {
    console.log(res);
}).catch(err => {
    console.log(err);
})