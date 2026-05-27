const transactions = [1000, -2000, -3000, 4000];
const inrToUsd = 88;

const positiveTransactions = transactions.filter(amount => amount > 0);
console.log(positiveTransactions);