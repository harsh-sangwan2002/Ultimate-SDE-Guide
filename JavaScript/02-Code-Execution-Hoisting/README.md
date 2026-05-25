# 📌 Introduction

In this session, we explored two of the most important concepts in JavaScript:

- ⚡ Operators
- 🛠 Functions

These concepts form the **foundation of programming logic** and are heavily used in:

- Web Development
- Backend Development
- APIs
- React Applications
- Node.js Projects

---

# ⚡ JavaScript Operators

Operators are symbols used to perform operations on values and variables.

---

# 🧮 Types of Operators

---

# 1️⃣ Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning             | Example  |
| -------- | ------------------- | -------- |
| `+`      | Addition            | `5 + 2`  |
| `-`      | Subtraction         | `5 - 2`  |
| `*`      | Multiplication      | `5 * 2`  |
| `/`      | Division            | `10 / 2` |
| `%`      | Modulus (Remainder) | `5 % 2`  |
| `++`     | Increment           | `a++`    |
| `--`     | Decrement           | `a--`    |

---

## Example

```js
let a = 10;
let b = 5;

console.log(a + b); // 15
console.log(a - b); // 5
console.log(a * b); // 50
console.log(a / b); // 2
console.log(a % b); // 0
```

---

# 🛒 Real-Life Example

### E-commerce Cart

```js
let price = 1000;
let quantity = 2;

let total = price * quantity;

console.log(total);
```

✅ Used in:

- Shopping carts
- Billing systems
- Discounts
- Taxes

---

# 2️⃣ Assignment Operators

Used to assign values to variables.

| Operator | Example  | Meaning           |
| -------- | -------- | ----------------- |
| `=`      | `a = 5`  | Assign            |
| `+=`     | `a += 2` | Add & assign      |
| `-=`     | `a -= 2` | Subtract & assign |
| `*=`     | `a *= 2` | Multiply & assign |
| `/=`     | `a /= 2` | Divide & assign   |
| `%=`     | `a %= 2` | Modulus & assign  |

---

## Example

```js
let score = 10;

score += 5;

console.log(score); // 15
```

---

# 3️⃣ Comparison Operators

Used to compare values.

| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | Loose Equality        |
| `===`    | Strict Equality       |
| `!=`     | Loose Inequality      |
| `!==`    | Strict Inequality     |
| `>`      | Greater Than          |
| `<`      | Less Than             |
| `>=`     | Greater Than or Equal |
| `<=`     | Less Than or Equal    |

---

# 🔥 Strict vs Loose Equality

## Loose Equality (`==`)

Performs **type coercion**.

```js
console.log(5 == "5"); // true
```

---

## Strict Equality (`===`)

Checks:

- Value
- Data Type

```js
console.log(5 === "5"); // false
```

✅ Best Practice:
Always prefer `===`

---

# 4️⃣ Logical Operators

Used for logical conditions.

| Operator | Meaning |
| -------- | ------- | --- | --- |
| `&&`     | AND     |
| `        |         | `   | OR  |
| `!`      | NOT     |

---

## Example

```js
let age = 20;
let hasID = true;

console.log(age > 18 && hasID);
```

---

# 5️⃣ Bitwise Operators

Operate directly on binary numbers (bits).

Examples:

```js
&
|
^
~
<<
>>
```

⚠️ Mostly used in:

- Low-level programming
- Optimizations
- System operations

---

# 6️⃣ Type Operators

## `typeof`

Returns the data type of a variable.

---

## Example

```js
let name = "Harsh";

console.log(typeof name);
```

### Output:

```js
string;
```

---

# 🛠 Functions in JavaScript

Functions are reusable blocks of code used to perform tasks.

---

# 📌 Function Declaration

Functions are created using the `function` keyword.

---

## Example

```js
function add(a, b) {
  return a + b;
}

console.log(add(2, 3));
```

---

# 🧠 Why Use Functions?

✅ Reusability  
✅ Cleaner code  
✅ Better structure  
✅ Modularity

---

# 🏷 Named vs Anonymous Functions

---

# 🔹 Named Function

A function with a name.

```js
function greet() {
  console.log("Hello");
}
```

---

# 🔸 Anonymous Function

A function without a name.

```js
const greet = function () {
  console.log("Hello");
};
```

Often used in:

- Callbacks
- Event listeners
- Higher-order functions

---

# ⚡ Arrow Functions

Shorter syntax introduced in ES6.

---

## Syntax

```js
const add = (a, b) => a + b;
```

---

## Example

```js
const square = (num) => num * num;

console.log(square(5));
```

---

# 📦 Function Expressions

Functions stored inside variables.

---

## Example

```js
const multiply = function (a, b) {
  return a * b;
};
```

---

# 🚀 Higher-Order Functions

Functions that:

- Accept another function as an argument
- Return another function

---

## Example

```js
function greet(name) {
  return function (message) {
    console.log(message + " " + name);
  };
}

greet("Harsh")("Welcome");
```

---

# 🎯 Callback Functions

Functions passed as arguments to another function.

---

## Example

```js
function processUser(callback) {
  callback();
}

processUser(function () {
  console.log("User Processed");
});
```

---

# 🌍 Execution Context

The environment where JavaScript code runs.

---

# Types of Context

| Context          | Description                          |
| ---------------- | ------------------------------------ |
| Global Context   | Default execution context            |
| Function Context | Created whenever a function executes |

---

# ⬆️ Hoisting

JavaScript moves declarations to the top before execution.

---

## Example

```js
console.log(a);

var a = 10;
```

### Output:

```js
undefined;
```

---

# ⚠️ Temporary Dead Zone (TDZ)

Applies to:

- `let`
- `const`

Variables cannot be accessed before initialization.

---

## Example

```js
console.log(a);

let a = 10;
```

❌ ReferenceError

---

# ✂️ Array Manipulation

---

# 🔹 slice()

Returns a portion of an array without changing the original array.

```js
let arr = [1, 2, 3, 4];

console.log(arr.slice(1, 3));
```

---

# 🔸 splice()

Adds/removes elements from the original array.

```js
let arr = [1, 2, 3, 4];

arr.splice(1, 2);

console.log(arr);
```

---

# ☕ Function Analogy

Functions are like recipes.

## Tea Example

Different functions = Different tea recipes.

```js
function makeTea(type) {
  return type + " Tea Ready!";
}
```