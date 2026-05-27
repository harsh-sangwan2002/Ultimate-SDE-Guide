const transactions = [1000, 2000, 3000, 4000];
const inrToUsd = 88;

const totalAmount = transactions.reduce((acc, amount) => acc + amount, 0);
console.log(totalAmount);