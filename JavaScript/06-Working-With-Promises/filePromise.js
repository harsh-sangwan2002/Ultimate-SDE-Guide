const fs = require('fs');

const filePromise = fs.promises.readFile('promise.js');
filePromise.then(data => {
    console.log(data.toString());
}).catch(err => {
    console.log(err);
})