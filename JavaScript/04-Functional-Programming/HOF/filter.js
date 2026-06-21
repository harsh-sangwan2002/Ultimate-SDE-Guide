const transactions = [1000, -2000, 3000, -4000, 5000];
const INRtoUSD = 88;

// Filter out the positive values
const positiveTransactions = transactions.filter((amount) => amount > 0);
console.log(positiveTransactions);
