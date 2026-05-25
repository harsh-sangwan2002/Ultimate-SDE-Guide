console.log({} + {}); // [object Object] [object Object]
console.log([] + {}); // [object Object]
console.log([] == []); // false
console.log([] == {}); // false
console.log([] + 1 + 2); // 12
console.log({} + 1 + 2); // [object Object]12