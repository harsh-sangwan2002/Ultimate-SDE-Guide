const arr = ["Namrata", "John", "Sumeet", "Pankaj"];

// pushes the element at the end and returns the new array length
console.log(arr.push("Josh"));
console.log(arr);
console.log("--------------------------------------------");

// removes the element from the end and returns the removed element
console.log(arr.pop());
console.log(arr);
console.log("--------------------------------------------");

// pushes the element at the start and returns the new array length
console.log(arr.unshift("Jack"));
console.log(arr);
console.log("--------------------------------------------");

// removed the element from the start and returns the removed element
console.log(arr.shift());
console.log(arr);
console.log("--------------------------------------------");

// removes the element from the startIdx
// splice(startIdx,count, ...item1)
console.log(arr.splice(1, 2));
console.log(arr);
console.log("--------------------------------------------");

// returns the array element from startIdx to endIdx-1
console.log(arr.slice(1, 3));
console.log(arr);
console.log("--------------------------------------------");
