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

const p1 = createDummyPromise(3000, "3 sec");
const p2 = createDummyPromise(5000, "5 sec");
const p3 = createDummyPromise(10000, "1 sec");

// resolves the promise which settles first
// rejects if all the promises are rejected (AggregateError)
Promise.any([p1, p2, p3]).then(res => {
    console.log(res);
}).catch(err => {
    console.log(err);
})