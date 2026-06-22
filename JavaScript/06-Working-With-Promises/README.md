# 📌 Introduction to Promises

Before Promises, JavaScript relied heavily on callbacks for handling asynchronous operations.

This often led to:

❌ Callback Hell  
❌ Difficult Error Handling  
❌ Poor Readability  

Promises were introduced to solve these problems.

---

# 📖 What is a Promise?

A Promise is:

> An object representing the eventual completion or failure of an asynchronous operation.

Think of a Promise as an agreement:

- "I will give you the result later."
- The result may succeed or fail.

---

# ☕ Real-Life Analogy

Imagine ordering food online.

### Current State

```text
Order Placed
```

The restaurant hasn't prepared the food yet.

➡️ Promise = Pending

---

### Successful Delivery

```text
Food Delivered
```

➡️ Promise = Fulfilled

---

### Delivery Failed

```text
Order Cancelled
```

➡️ Promise = Rejected

---

# 🔄 States of a Promise

Every Promise can be in one of these states:

```text
Pending
   ↓
Fulfilled (Resolved)
OR
Rejected
```

---

# 1️⃣ Pending

The initial state.

The asynchronous operation is still running.

```js
let promise = new Promise(() => {});
```

Current State:

```text
Pending
```

---

# 2️⃣ Fulfilled (Resolved)

The operation completed successfully.

```js
resolve("Success");
```

State:

```text
Fulfilled
```

---

# 3️⃣ Rejected

The operation failed.

```js
reject("Error");
```

State:

```text
Rejected
```

---

# 4️⃣ Settled

A Promise is considered settled when it is:

✅ Fulfilled

OR

✅ Rejected

---

# 🏗 Creating a Promise

Promises are created using the `Promise` constructor.

---

## Syntax

```js
let promise = new Promise((resolve, reject) => {

});
```

---

# ⚙️ Promise Constructor

The constructor receives an executor function.

```js
new Promise((resolve, reject) => {

});
```

---

# Parameters

| Parameter | Purpose |
|------------|----------|
| resolve | Success |
| reject | Failure |

---

# 🎲 Example: Coin Toss Promise

```js
let coinTossPromise = new Promise((resolve, reject) => {

    setTimeout(() => {

        const isHeads = Math.random() > 0.5;

        if(isHeads) {
            resolve("Heads");
        } else {
            reject("Tails");
        }

    }, 1000);

});
```

---

# 🔍 What Happens?

1. Promise starts
2. Waits 1 second
3. Generates random result
4. Calls:
   - `resolve()` if Heads
   - `reject()` if Tails

---

# 📥 Consuming a Promise

Promises are consumed using:

- `.then()`
- `.catch()`
- `.finally()`

---

# 🟢 .then()

Runs when Promise is fulfilled.

```js
promise.then((result) => {
    console.log(result);
});
```

---

# 🔴 .catch()

Runs when Promise is rejected.

```js
promise.catch((error) => {
    console.log(error);
});
```

---

# ⚪ .finally()

Runs regardless of outcome.

```js
promise.finally(() => {
    console.log("Completed");
});
```

---

# 🎯 Complete Example

```js
coinTossPromise
    .then((result) => {
        console.log(result);
    })
    .catch((error) => {
        console.log(error);
    })
    .finally(() => {
        console.log("Coin Toss Completed");
    });
```

---

# 🔗 Promise Chaining

Promises can be chained together.

Each `.then()` returns a new Promise.

---

# 📖 Why?

To perform tasks sequentially.

---

# 🧠 Example

```js
cleanRoom()
    .then((result) => {
        console.log(result);

        return removeGarbage();
    })
    .then((result) => {
        console.log(result);

        return winIceCream();
    })
    .then((result) => {
        console.log(result);
    })
    .catch((error) => {
        console.log(error);
    });
```

---

# 📊 Flow

```text
Clean Room
     ↓
Remove Garbage
     ↓
Win Ice Cream
```

---

# 🔥 Error Handling in Chains

If any Promise fails:

```js
.catch()
```

handles the error.

---

# Example

```js
cleanRoom()
    .then(removeGarbage)
    .then(winIceCream)
    .catch(() => {
        console.log("Something Failed");
    });
```

---

# ⏰ Delayed Promises

Promises often use `setTimeout()`.

---

# Example

```js
let delayedPromise = new Promise((resolve) => {

    setTimeout(() => {
        resolve("Resolved After 2 Seconds");
    }, 2000);

});
```

---

# 🚀 Multiple Promises

JavaScript provides utility methods for handling multiple promises.

---

# 1️⃣ Promise.all()

Waits for ALL promises to resolve.

---

## Example

```js
Promise.all([
    promise1,
    promise2,
    promise3
])
.then((values) => {
    console.log(values);
});
```

---

# 📊 Behavior

```text
Promise1 ✅
Promise2 ✅
Promise3 ✅
```

Result:

```js
[Result1, Result2, Result3]
```

---

# ⚠️ Important

If ANY promise fails:

```text
Promise.all() fails immediately
```

---

# 2️⃣ Promise.allSettled()

Waits for ALL promises.

Even failed ones.

---

## Example

```js
Promise.allSettled([
    promise1,
    promise2,
    promise3
])
.then((results) => {
    console.log(results);
});
```

---

# Example Output

```js
[
  { status: "fulfilled", value: 10 },
  { status: "rejected", reason: "Error" }
]
```

---

# 🔄 Event Loop & Promises

Promises have a special place in JavaScript's Event Loop.

---

# 📦 Queues in JavaScript

There are two major queues:

### Callback Queue

```text
setTimeout
setInterval
DOM Events
```

---

### Microtask Queue

```text
Promises
MutationObserver
queueMicrotask
```

---

# ⚠️ Priority Rule

```text
Microtask Queue
      ↑
Higher Priority
      ↑
Callback Queue
```

---

# 🧠 Example

```js
console.log("Start");

setTimeout(() => {
    console.log("Timer");
}, 0);

Promise.resolve()
    .then(() => {
        console.log("Promise");
    });

console.log("End");
```

---

# ✅ Output

```js
Start
End
Promise
Timer
```

---

# 🔍 Why?

After synchronous code:

1. Microtasks execute first
2. Then callback queue tasks execute

---

# 📂 Promises in Node.js File Reading

Node.js supports promise-based file operations.

---

# Example

```js
const fs = require("fs").promises;

fs.readFile("file.txt")
    .then((data) => {
        console.log(data.toString());
    })
    .catch((error) => {
        console.log(error);
    });
```

---

# 🎯 Benefits

✅ Cleaner Code  
✅ No Callback Hell  
✅ Better Error Handling  
✅ Easy Chaining  
✅ More Readable

---

# 😵 Callback Hell vs Promise

---

## Callback Hell

```js
login(() => {

    getProfile(() => {

        getOrders(() => {

            makePayment(() => {

            });

        });

    });

});
```

---

## Promise Version

```js
login()
    .then(getProfile)
    .then(getOrders)
    .then(makePayment)
    .catch(console.error);
```

---

# 🚀 Advantages of Promises

✅ Better Readability

✅ Easier Error Handling

✅ Chaining Support

✅ Avoid Callback Hell

✅ Works Perfectly with Async/Await

---

# 📊 Quick Summary Table

| Concept | Meaning |
|----------|----------|
| Promise | Future value |
| Pending | Initial state |
| Fulfilled | Success |
| Rejected | Failure |
| Settled | Fulfilled or Rejected |
| then() | Handle success |
| catch() | Handle failure |
| finally() | Runs always |
| Promise.all() | Wait for all |
| Promise.allSettled() | Wait for all outcomes |
| Microtask Queue | Promise callbacks |
| Callback Queue | Timer callbacks |

---

# 🎯 Key Takeaways

✅ Promises solve callback hell

✅ Promises represent future values

✅ Every Promise has states

✅ `.then()` handles success

✅ `.catch()` handles errors

✅ `.finally()` runs always

✅ Promise callbacks run in the Microtask Queue

✅ Microtasks execute before callbacks