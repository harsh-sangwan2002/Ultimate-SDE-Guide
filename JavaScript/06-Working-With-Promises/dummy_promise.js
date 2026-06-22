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

createDummyPromise(20000, "20 sec").then(data => {
    console.log(data);
}).catch(err => {
    console.log(err);
});

createDummyPromise(3000, "3 sec").then(data => {
    console.log(data);
});

createDummyPromise(5000, "5 sec").then(data => {
    console.log(data);
})

createDummyPromise(1000, "1 sec").then(data => {
    console.log(data);
});