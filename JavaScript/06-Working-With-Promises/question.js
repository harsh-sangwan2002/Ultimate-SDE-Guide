// 1. Go to GYM (2000ms)
// 2. Take a bath (1000ms)
// 3. Have breakfast (3000ms)

function createDummyPromise(delay, message) {

    return new Promise((resolve, reject) => {

        setTimeout(() => {
            resolve(message);
        }, delay);
    })
}

createDummyPromise(2000, "Gym").then(res => {
    console.log(res);
    return createDummyPromise(1000, "Bath");
}).then(res => {
    console.log(res);
    return createDummyPromise(3000, "Breakfast");
}).then(res => {
    console.log(res);
}).catch(err => {
    console.log(err);
})