var arr = ["Kartik", "Namrata", "Saransh", "John", "Pankaj"];

console.log(arr[0]);
console.log(arr);
console.log(arr.length);
console.log("----------------------------------------------------");

// pushes the element at the end and returns the new array length
console.log(arr.push("Harsha")); // 6
console.log(arr);
console.log("----------------------------------------------------");

// removes the element from the end and returns the removed element
console.log(arr.pop()); // Harsha
console.log(arr);
console.log("----------------------------------------------------");

// pushes the element at the start and returns the new array length
console.log(arr.unshift("Komal")); // 6
console.log(arr);
console.log("----------------------------------------------------");

// removes the element from the start and returns the removed element
console.log(arr.shift()); // Komal
console.log(arr);
console.log("----------------------------------------------------");

// splice(startIdx,count,elements...)
console.log(arr.splice(1, 3, "Sridhar"));
console.log(arr);
console.log("----------------------------------------------------");

// slice(startIdx,endIdx) => elements from startIdx to endIdx-1
console.log(arr.slice(1, 3));
console.log(arr);
console.log("----------------------------------------------------");