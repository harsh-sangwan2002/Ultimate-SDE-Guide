function dummyPromise(delay) {

    return new Promise((res, rej) => {

        const isHead = Math.random() > 0.5;

        if (isHead)
            setTimeout(() => {
                res("It's a head");
            }, delay);

        else
            rej("It's a tail");
    })
}

const toss = dummyPromise(2000)

function doFlipES5() {

    console.log("A");

    toss.then(res => {
        console.log(res);
    }).catch(err => {
        console.log(err);
    })

    console.log("B");
}
// doFlipES5();

async function doFlipES6() {

    console.log("A");

    try {
        const r1 = await toss;
        console.log(r1);
    } catch (err) {
        console.log(err);
    }

    console.log("B");
}
doFlipES6();