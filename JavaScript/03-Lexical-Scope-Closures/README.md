# 📌 Introduction

In this session, we explored some of the most important JavaScript concepts:

- 🌍 Lexical Scope
- 🔗 Scope Chain
- 🔒 Closures
- ⚙️ Execution Context
- ⏳ Temporal Dead Zone (TDZ)

These concepts are extremely important because they define:

- How variables are accessed
- How functions remember data
- How JavaScript executes code internally

---

# 🌍 Lexical Scope

---

# 📖 Definition

Lexical Scope means:

> A function can access variables from its parent scope based on where the function is written in the code.

JavaScript determines scope during the **writing phase**, not during execution.

---

# 🏗 Parent-Child Hierarchy

In JavaScript:

✅ Child functions can access parent variables  
❌ Parent functions cannot access child variables

This creates a hierarchy called the **Scope Chain**.

---

# 🧠 Example

```js
var a = 20;

function parent() {
  console.log(a);

  function child() {
    console.log(a);

    function child2() {
      console.log(a);
    }

    child2();
  }

  child();
}

parent();
```

---

# ✅ Output

```js
20;
20;
20;
```

---

# 🔍 Explanation

- `a` is declared in the global scope
- `parent()` can access it
- `child()` can access it
- `child2()` can also access it

Because each function searches upward through its parent scopes.

---

# 🔗 Scope Chain

The chain connecting child scopes to parent scopes is called the **Scope Chain**.

---

# 📊 Scope Flow

```text
Global Scope
   ↓
Parent Function
   ↓
Child Function
   ↓
Nested Child Function
```

JavaScript keeps searching upward until:

- Variable is found ✅
- Global scope ends ❌

---

# ⚠️ Important Rule

## Child → Parent ✅

## Parent → Child ❌

---

# ❌ Example

```js
function parent() {
  function child() {
    let secret = "Hidden";
  }

  console.log(secret);
}

parent();
```

---

# 🚨 Output

```js
ReferenceError;
```

Because the parent cannot access child variables.

---

# 🔒 Closures

---

# 📖 Definition

A Closure is:

> A function bundled together with its lexical scope.

OR

> A function remembers variables from its parent scope even after the parent function has finished execution.

---

# 🧠 Core Idea

When a function is returned from another function:

✅ It remembers its original scope  
✅ It still has access to parent variables

This behavior creates a **Closure**.

---

# 🔥 Example

```js
function parent() {
  var a = 10;

  function child() {
    console.log(a);
  }

  return child;
}

let functionReceived = parent();

functionReceived();
```

---

# ✅ Output

```js
10;
```

---

# 🤔 Why Does This Work?

Even though `parent()` has finished execution:

- `child()` still remembers variable `a`
- JavaScript preserves the lexical environment

This preserved environment is called a **Closure**.

---

# 🎯 Real-Life Analogy

Imagine:

🏠 Parent House = Parent Scope  
👦 Child = Inner Function

The child can always access things from the parent house.

But the parent cannot access the child's future house.

---

# ⚙️ Execution Context

---

# 📖 Definition

Execution Context is the environment in which JavaScript code runs.

It contains:

- Variables
- Functions
- Value of `this`

---

# 🧩 Types of Execution Context

| Type                       | Description                          |
| -------------------------- | ------------------------------------ |
| Global Execution Context   | Created when JS starts               |
| Function Execution Context | Created whenever a function executes |

---

# ⏳ Temporal Dead Zone (TDZ)

---

# 📖 Definition

Variables declared using:

- `let`
- `const`

cannot be accessed before initialization.

This period is called the **Temporal Dead Zone**.

---

# ❌ Example

```js
console.log(a);

let a = 10;
```

---

# 🚨 Output

```js
ReferenceError;
```

---

# 🔍 Why?

Because `a` exists in memory but remains inaccessible until initialization.

---

# ♻️ Garbage Collection

JavaScript automatically removes unused memory.

---

# 🧠 Important Point

Variables used inside closures are NOT immediately removed because:

- The inner function still references them

---

# 📦 Example

```js
function outer() {
  let count = 0;

  return function inner() {
    count++;
    console.log(count);
  };
}

const counter = outer();

counter();
counter();
counter();
```

---

# ✅ Output

```js
1;
2;
3;
```

---

# 🔍 Explanation

The inner function remembers `count`.

This is possible because of:
✅ Closure

---

# 🚀 Closures in Real Applications

Closures are heavily used in:

- Event Listeners
- Timers (`setTimeout`)
- Data Hiding
- Memoization
- React Hooks
- Callbacks

---

# 🧠 Memoization Example

Closures help remember previous calculations.

---

## Example

```js
function memoizedAdd() {
  let cache = {};

  return function (num) {
    if (cache[num]) {
      return cache[num];
    }

    let result = num + 10;

    cache[num] = result;

    return result;
  };
}

const add = memoizedAdd();

console.log(add(5));
console.log(add(5));
```

---

# 🎯 Benefits of Closures

✅ Data Privacy  
✅ State Preservation  
✅ Better Memory Management  
✅ Functional Programming  
✅ Cleaner Code
