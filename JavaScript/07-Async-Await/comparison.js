function createDummyPromise(delay, message) {

    return new Promise((res, rej) => {

        const TIMEOUT = 5000;

        if (delay > TIMEOUT)
            rej("Max delay can be 5 sec, your delay is: " + delay);

        else
            setTimeout(() => {
                res(message);
            }, delay);
    })
}

// ES5
// createDummyPromise(20000, "20 sec").then(data => {
//     console.log(data);
// }).catch(err => {
//     console.log(err);
// });

// createDummyPromise(3000, "3 sec").then(data => {
//     console.log(data);
// });

// createDummyPromise(5000, "5 sec").then(data => {
//     console.log(data);
// })

// createDummyPromise(1000, "1 sec").then(data => {
//     console.log(data);
// });

// ES6
// try {
//     const r1 = await createDummyPromise(20000, "20 sec");
//     console.log(r1);

//     const r2 = await createDummyPromise(3000, "3 sec");
//     console.log(r2);

//     const r3 = await createDummyPromise(5000, "5 sec");
//     console.log(r3);

//     const r4 = await createDummyPromise(1000, "1 sec");
//     console.log(r4);
// } catch (err) {
//     console.log(err);
// }

// const p1 = createDummyPromise(20000, "20 sec");
const p2 = createDummyPromise(3000, "3 sec");
const p3 = createDummyPromise(5000, "5 sec");
const p4 = createDummyPromise(1000, "1 sec");

try {

    // const r1 = await p1;
    // console.log(r1);

    const r2 = await p2;
    console.log(r2);

    const r3 = await p3;
    console.log(r3);

    const r4 = await p4;
    console.log(r4);
} catch (err) {
    console.log(err);
}