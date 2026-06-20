// Every key in an object is converted into a string
var obj = {
  0: "0",
  0: "zero",
};
console.log(obj);

obj = {
  0: "zero",
  0: "0",
};
console.log(obj);

var obj2 = {
  name: "Harsh",
};

var c = "city";

obj["1"] = "number";
obj["[1, 2]"] = "array";
obj[[1, 2]] = "array2";
obj[c] = "Bangalore";
obj[obj] = "object";
obj[obj2] = "object2"

console.log(obj);
