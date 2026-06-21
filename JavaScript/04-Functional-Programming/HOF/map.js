const transactions = [1000, 2000, 3000, 4000, 5000];
const INRtoUSD = 88;

// Convert the Indian rupees into USD
const dollars = transactions.map((amount) => amount / INRtoUSD);
console.log(dollars);
