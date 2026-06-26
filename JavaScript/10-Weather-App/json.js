const obj = {
    name: "Harsh", // string
    age: 12, // number
    friends: ["Prakhar", "Himanshu"], // array
    address: {
        country: "India"
    }, // object
    married: false, // boolean,
    a: null, // null
    b: undefined,
    fn: function () {
        console.log("Hi");
    }
}

const stringifiedRes = JSON.stringify(obj);
console.log(stringifiedRes);

const parsedObj = JSON.parse(stringifiedRes);
console.log(parsedObj);