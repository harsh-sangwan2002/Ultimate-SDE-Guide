# 🚀 Revision Notes: JavaScript & Node.js

> A quick and beautiful revision guide covering the fundamentals of JavaScript and Node.js.

---

# 📌 Introduction to JavaScript

## 💡 What is JavaScript?

JavaScript is a **high-level scripting language** used to create **dynamic and interactive web applications**.

It allows websites to:

- Respond to user actions
- Update content dynamically
- Create animations
- Handle forms and APIs
- Build complete web applications

---

## 🌐 How JavaScript Works in a Browser

JavaScript runs directly inside the browser using the browser's **JavaScript Engine**.

### Steps:

1. Open Chrome
2. Right Click → **Inspect**
3. Go to **Console**
4. Write JavaScript code

```js
console.log("Hello JavaScript!");
```

---

# ⚙️ JavaScript Engine

A JavaScript engine interprets and executes JavaScript code.

| Browser | JavaScript Engine |
| ------- | ----------------- |
| Chrome  | V8 Engine         |
| Firefox | SpiderMonkey      |
| Safari  | JavaScriptCore    |

---

# 📂 External JavaScript Files

JavaScript code can be written in separate `.js` files.

## Example

### HTML File

```html
<script src="app.js"></script>
```

### JavaScript File (`app.js`)

```js
console.log("External JS Connected!");
```

✅ Benefits:

- Cleaner code
- Reusability
- Better maintainability

---

# 🟢 Node.js

## 📖 What is Node.js?

Node.js is an:

- Open-source
- Cross-platform
- JavaScript runtime environment

It allows JavaScript to run **outside the browser**.

---

## 🔥 Uses of Node.js

- Backend Development
- APIs
- Real-time Applications
- Chat Applications
- File Handling
- Servers

---

# 📦 JavaScript Variables

Variables store data values.

## ✨ Declaring Variables

```js
var name = "Harsh";
let age = 22;
const country = "India";
```

---

## 🆚 Difference Between var, let, and const

| Keyword | Re-declare | Re-assign | Scope    |
| ------- | ---------- | --------- | -------- |
| var     | ✅ Yes     | ✅ Yes    | Function |
| let     | ❌ No      | ✅ Yes    | Block    |
| const   | ❌ No      | ❌ No     | Block    |

---

# 🔄 Dynamic Typing

JavaScript is **dynamically typed**.

A variable can store different data types at different times.

```js
let value = 10;
value = "Hello";
value = true;
```

---

# 🧩 Data Types in JavaScript

JavaScript has two major categories of data types.

---

# 🔹 Primitive Data Types

## 1️⃣ Number

```js
let age = 21;
let price = 99.99;
```

## 2️⃣ String

```js
let name = "Harsh";
```

## 3️⃣ Boolean

```js
let isLoggedIn = true;
```

## 4️⃣ Undefined

```js
let value;
```

## 5️⃣ Null

```js
let data = null;
```

## 6️⃣ Symbol (ES6)

```js
let id = Symbol("unique");
```

---

# 🔸 Reference Data Types

## 📦 Objects

```js
let user = {
  name: "Harsh",
  age: 22,
};
```

## 📚 Arrays

```js
let fruits = ["Apple", "Mango", "Banana"];
```

⚠️ Reference types store memory references.

---

# 🛠 Functions in JavaScript

Functions are reusable blocks of code.

## Example

```js
function greet(name) {
  return "Hello " + name;
}

console.log(greet("Harsh"));
```

✅ Benefits:

- Code Reusability
- Better Structure
- Modularity

---

# 📚 Arrays in JavaScript

Arrays store multiple values in a single variable.

## Example

```js
let arr = [10, 20, 30];
```

---

# 🔧 Array Operations

## Access Elements

```js
arr[0];
```

---

## Modify Elements

```js
arr[1] = 100;
```

---

# 🚀 Important Array Methods

## ➕ push()

Adds element at the end.

```js
arr.push(40);
```

---

## ➖ pop()

Removes last element.

```js
arr.pop();
```

---

## ⬅️ shift()

Removes first element.

```js
arr.shift();
```

---

## ➡️ unshift()

Adds element at beginning.

```js
arr.unshift(5);
```

---

# 🏗 JavaScript Objects

Objects store data in **key-value pairs**.

---

# ✨ Creating Objects

## Using Constructor

```js
let user = new Object();
```

## Using Object Literal

```js
let user = {
  name: "Harsh",
  age: 22,
};
```

---

# 🔍 Accessing Object Data

## Dot Notation

```js
user.name;
```

## Bracket Notation

```js
user["age"];
```

---

# 🔄 Dynamic Properties

JavaScript converts object keys into strings automatically.

```js
let obj = {
  1: "One",
};

console.log(obj["1"]);
```

---

# ✅ Best Practices in JavaScript

## 📌 Learn Programming Fundamentals First

Before development:

- Understand variables
- Learn functions
- Practice loops
- Master conditions
- Learn data structures

---

# 🧠 DSA in JavaScript

For web developers, understanding DSA in JavaScript is very important because browser logic runs using JavaScript.

## Why Learn DSA?

✅ Better problem solving  
✅ Crack coding interviews  
✅ Optimize applications  
✅ Easier language switching

---

# 🎯 Final Summary

JavaScript is the foundation of modern web development.

With JavaScript + Node.js you can build:

- Frontend Applications
- Backend Servers
- Full Stack Projects
- APIs
- Real-time Apps

---

# 📖 Quick Revision Table

| Topic      | Key Point                    |
| ---------- | ---------------------------- |
| JavaScript | Dynamic scripting language   |
| Node.js    | Run JS outside browser       |
| Variables  | var, let, const              |
| Data Types | Primitive & Reference        |
| Functions  | Reusable code blocks         |
| Arrays     | Store multiple values        |
| Objects    | Key-value storage            |
| DSA        | Important for logic building |

---

# 🚀 Happy Coding!

```js
console.log("Keep Learning 🚀");
```