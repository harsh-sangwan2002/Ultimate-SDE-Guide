var obj = {
    0: "0",
    "0": "zero"
}
console.log(obj);

obj = {
    "0": "zero",
    0: "0"
}
console.log(obj);

var city = "Banaglore";
obj[city] = "Metropolitan City";
console.log(obj);

var arr1 = [1, 2];
var arr2 = [1, 3];
var obj2 = {
    firstName: "Harsh",
    lastName: "Sangwan"
};

obj[arr1] = "Array";
obj[arr2] = "Array2";
obj[obj] = "Object";
obj[obj] = "Object2";
console.log(obj);