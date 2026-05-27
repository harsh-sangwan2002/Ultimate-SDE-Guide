const transactions = [1000, 2000, 3000, 4000];
const inrToUsd = 88;

const conversionToDollars = transactions.map(amount => Math.round(amount / inrToUsd));
console.log(conversionToDollars);