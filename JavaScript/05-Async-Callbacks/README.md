# 📌 Introduction

JavaScript is a **single-threaded language**, but it can still handle asynchronous tasks efficiently using:

- ⚡ Event Loop
- 📚 Callback Queue
- 🧠 Call Stack
- 🌐 Web APIs / Node APIs

These mechanisms allow JavaScript to perform:

- Timers
- API Calls
- File Handling
- Database Queries
- Network Requests

without blocking the main thread.

---

# 🔄 Synchronous vs Asynchronous Programming

---

# 🟢 Synchronous Programming

In synchronous programming:

> Code executes line by line.

Each task must complete before the next task begins.

---

# ☕ Real-Life Analogy

Imagine standing in a coffee shop line:

1. Order coffee
2. Wait for coffee
3. Receive coffee
4. Then place another order

Everything happens sequentially.

---

# 🧠 Example

```js
console.log("Task 1");
console.log("Task 2");
console.log("Task 3");
```

---

# ✅ Output

```js
Task 1
Task 2
Task 3
```

---

# 🔵 Asynchronous Programming

In asynchronous programming:

> Tasks can start now and finish later without blocking other operations.

JavaScript continues executing other code while waiting.

---

# ☕ Real-Life Analogy

At a coffee shop:

1. Order coffee
2. Receive token
3. Sit and do other work
4. Get notified when coffee is ready

You don't block your time waiting.

---

# ⚡ Benefits of Asynchronous Programming

✅ Faster Applications  
✅ Non-blocking Execution  
✅ Better User Experience  
✅ Efficient I/O Operations  
✅ Handles Multiple Tasks Concurrently

---

# 📞 Callback Functions

---

# 📖 Definition

A callback is:

> A function passed as an argument to another function and executed later.

---

# 🧠 Example

```js
function greet(name, callback) {
  console.log("Hello " + name);

  callback();
}

function sayBye() {
  console.log("Goodbye!");
}

greet("Harsh", sayBye);
```

---

# ✅ Output

```js
Hello Harsh
Goodbye!
```

---

# ⏰ setTimeout()

Used to execute code after a delay.

---

# 🧠 Example

```js
console.log("Start");

setTimeout(function () {
  console.log("Hello");
}, 2000);

console.log("End");
```

---

# ✅ Output

```js
Start;
End;
Hello;
```

(Hello appears after 2 seconds)

---

# 🔍 Why?

Because `setTimeout()` is asynchronous.

JavaScript:

1. Sends timer to Web APIs
2. Continues execution
3. Executes callback later

---

# 🔄 JavaScript Event Loop

The Event Loop is the heart of JavaScript's asynchronous behavior.

---

# 🧩 Components of Event Loop System

---

# 1️⃣ Call Stack

The Call Stack stores:

- Function calls
- Execution contexts

Functions are executed using:
👉 LIFO (Last In First Out)

---

# 🧠 Example

```js
function one() {
  two();
}

function two() {
  console.log("Inside Two");
}

one();
```

---

# 📊 Stack Flow

```text
Global()
  ↓
one()
  ↓
two()
```

---

# 2️⃣ Web APIs / Node APIs

These APIs handle asynchronous tasks like:

- Timers
- DOM Events
- File Reading
- Fetch Requests

Examples:

- `setTimeout`
- `fetch`
- `fs.readFile`

---

# 3️⃣ Callback Queue

After asynchronous tasks complete:

✅ Their callbacks move into the Callback Queue.

---

# 📦 Queue Example

```text
[ callback1 ]
[ callback2 ]
[ callback3 ]
```

---

# 4️⃣ Event Loop

The Event Loop continuously checks:

```text
Is Call Stack Empty?
```

If YES:
👉 Move callback from queue → call stack

---

# 🔁 Event Loop Flow

```text
Call Stack Empty?
        ↓
YES → Move Callback to Stack
        ↓
Execute Callback
```

---

# ⚙️ Complete Execution Flow Example

```js
console.log("Start");

setTimeout(() => {
  console.log("Timer Done");
}, 2000);

console.log("End");
```

---

# 🧠 Step-by-Step Flow

## Step 1

```js
console.log("Start");
```

Output:

```js
Start;
```

---

## Step 2

`setTimeout()` goes to Web APIs.

Timer starts.

---

## Step 3

```js
console.log("End");
```

Output:

```js
End;
```

---

## Step 4

After 2 seconds:

- Callback enters Callback Queue

---

## Step 5

Event Loop checks:
✅ Stack Empty

Moves callback to stack.

---

## Final Output

```js
Start
End
Timer Done
```

---

# 🟢 Asynchronous Programming in Node.js

Node.js uses asynchronous programming heavily for:

- File Handling
- APIs
- Database Queries
- Networking

---

# 📂 File System Module (`fs`)

Used for handling files in Node.js.

---

# 📖 Importing fs

```js
const fs = require("fs");
```

---

# 📥 Asynchronous File Reading

```js
const fs = require("fs");

console.log("Before");

fs.readFile("f1.txt", (err, data) => {
  if (err) {
    console.log(err);
    return;
  }

  console.log(data.toString());
});

console.log("After");
```

---

# ✅ Output

```js
Before
After
(File Data Appears Later)
```

---

# 🔍 Explanation

`fs.readFile()` is asynchronous.

Node.js:

1. Sends file task to Node APIs
2. Continues execution
3. Executes callback after file reading completes

---

# 🚀 Non-Blocking I/O

Node.js uses:
✅ Non-blocking I/O

Meaning:

- The thread is NOT blocked
- Multiple operations can run efficiently

---

# 🔄 Concurrent Operations

Concurrency means:

> Multiple tasks are initiated together without waiting for each one to finish sequentially.

---

# 🧠 Example

```js
fs.readFile("a.txt", callback1);
fs.readFile("b.txt", callback2);
fs.readFile("c.txt", callback3);
```

All file reads start simultaneously.

---

# ⚠️ Important Point

JavaScript is:
✅ Single-threaded

But asynchronous APIs make it appear concurrent.

---

# 📌 Serial Operations

Sometimes order matters.

Example:

1. Login
2. Fetch User Data
3. Fetch Orders

These tasks must run sequentially.

---

# 🧠 Example

```js
fs.readFile("a.txt", () => {
  fs.readFile("b.txt", () => {
    fs.readFile("c.txt", () => {
      console.log("Done");
    });
  });
});
```

---

# ⚠️ Callback Hell

Deep nesting of callbacks creates unreadable code.

---

# 😵 Example

```js
doTask1(() => {
  doTask2(() => {
    doTask3(() => {
      doTask4(() => {});
    });
  });
});
```

---

# ❌ Problems

- Hard to read
- Hard to debug
- Difficult maintenance

---

# 🚀 Solution

Modern JavaScript uses:

- Promises
- Async/Await

to avoid callback hell.

---

# 📊 Quick Summary Table

| Concept          | Meaning                    |
| ---------------- | -------------------------- |
| Synchronous      | Executes line by line      |
| Asynchronous     | Non-blocking execution     |
| Callback         | Function executed later    |
| setTimeout       | Delayed execution          |
| Call Stack       | Executes functions         |
| Web APIs         | Handle async tasks         |
| Callback Queue   | Stores completed callbacks |
| Event Loop       | Moves callbacks to stack   |
| Concurrency      | Multiple tasks together    |
| Non-blocking I/O | Efficient async operations |

---

# 🎯 Key Takeaways

✅ JavaScript is single-threaded  
✅ Async programming prevents blocking  
✅ Event Loop manages asynchronous execution  
✅ Call Stack executes functions  
✅ Callback Queue stores completed async tasks  
✅ Node.js heavily relies on async behavior
