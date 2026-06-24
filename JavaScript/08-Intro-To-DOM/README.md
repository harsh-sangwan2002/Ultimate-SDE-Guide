# 📌 Introduction

Modern websites are interactive because JavaScript can dynamically manipulate HTML elements.

This is possible through the:

# 🌐 DOM (Document Object Model)

The DOM acts as a bridge between:
- HTML
- CSS
- JavaScript

It allows JavaScript to:
- Read content
- Update content
- Change styles
- Create elements
- Delete elements
- Respond to user interactions

---

# 🌳 Understanding the DOM

## 📖 What is the DOM?

DOM stands for:

**Document Object Model**

It is a programming interface that represents an HTML document as a tree-like structure.

---

# 🏗 DOM Tree Structure

Example HTML:

```html
<html>
  <body>
    <h1>Hello World</h1>
    <p>Welcome to DOM</p>
  </body>
</html>
```

DOM Representation:

```text
Document
│
└── html
    │
    └── body
        │
        ├── h1
        │   └── "Hello World"
        │
        └── p
            └── "Welcome to DOM"
```

---

# 📦 Nodes and Elements

Everything in the DOM is represented as a **Node**.

---

## Types of Nodes

| Node Type | Example |
|------------|----------|
| Element Node | `<div>` |
| Text Node | `"Hello"` |
| Comment Node | `<!-- Comment -->` |

---

# 🎯 Accessing DOM Elements

Before modifying elements, we need to select them.

---

# 1️⃣ getElementById()

Selects a single element using its unique ID.

---

## HTML

```html
<h1 id="heading">Hello</h1>
```

---

## JavaScript

```js
const heading = document.getElementById("heading");

console.log(heading);
```

---

## ✅ Returns

```html
<h1 id="heading">Hello</h1>
```

---

# ⚠️ Important

IDs must always be unique.

```html
<div id="box"></div>
```

Good ✅

```html
<div id="box"></div>
<div id="box"></div>
```

Bad ❌

---

# 2️⃣ getElementsByClassName()

Selects all elements with a specific class.

---

## HTML

```html
<p class="item">One</p>
<p class="item">Two</p>
<p class="item">Three</p>
```

---

## JavaScript

```js
const items =
document.getElementsByClassName("item");

console.log(items);
```

---

## Returns

```js
HTMLCollection(3)
```

---

# ⚠️ Note

Returns:

```js
HTMLCollection
```

NOT an Array.

---

# 3️⃣ getElementsByTagName()

Selects elements using tag names.

---

## Example

```js
const paragraphs =
document.getElementsByTagName("p");
```

---

## Returns

```js
HTMLCollection
```

containing all `<p>` elements.

---

# 🔍 Modern Selectors (Important)

Although not discussed extensively, these are commonly used.

---

# querySelector()

Returns first matching element.

```js
document.querySelector(".item");
```

---

# querySelectorAll()

Returns all matching elements.

```js
document.querySelectorAll(".item");
```

---

# ✍️ Manipulating DOM Elements

---

# 📄 textContent

Used to get or set text inside an element.

---

## HTML

```html
<h1 id="title">Hello</h1>
```

---

## JavaScript

```js
const title =
document.getElementById("title");

console.log(title.textContent);
```

---

## Output

```js
Hello
```

---

## Updating Text

```js
title.textContent = "Welcome";
```

---

## Result

```html
<h1>Welcome</h1>
```

---

# 🏗 innerHTML

Used to get or update HTML content.

---

## Example

```js
title.innerHTML =
"<span>Welcome</span>";
```

---

## Result

```html
<h1>
  <span>Welcome</span>
</h1>
```

---

# ⚠️ Difference

| Property | Supports HTML |
|-----------|-------------|
| textContent | ❌ No |
| innerHTML | ✅ Yes |

---

# 🆕 Creating Elements

JavaScript can create new elements dynamically.

---

## Example

```js
const li =
document.createElement("li");
```

---

## Result

```html
<li></li>
```

---

# ✍️ Adding Content

```js
li.textContent = "New Item";
```

---

## Final Element

```html
<li>New Item</li>
```

---

# ➕ Adding Elements to DOM

---

# appendChild()

Adds a child at the end.

---

## Example

```js
const ul =
document.getElementById("list");

ul.appendChild(li);
```

---

## Before

```html
<ul>
  <li>Item 1</li>
</ul>
```

---

## After

```html
<ul>
  <li>Item 1</li>
  <li>New Item</li>
</ul>
```

---

# insertBefore()

Inserts a node before another node.

---

## Example

```js
parent.insertBefore(
    newNode,
    existingNode
);
```

---

# ❌ Removing Elements

---

# removeChild()

Removes a child node.

---

## Example

```js
parent.removeChild(child);
```

---

## Before

```html
<ul>
  <li>One</li>
  <li>Two</li>
</ul>
```

---

## After

```html
<ul>
  <li>One</li>
</ul>
```

---

# 🎯 Event Handling

DOM becomes powerful when combined with events.

---

# 📖 What is an Event?

An event is an action performed by the user.

Examples:

- Click
- Double Click
- Mouse Hover
- Key Press
- Form Submission

---

# 🖱 addEventListener()

Used to listen for events.

---

## Example

```js
const btn =
document.getElementById("btn");

btn.addEventListener(
    "click",
    function() {
        console.log("Button Clicked");
    }
);
```

---

# 📦 Event Object

JavaScript automatically passes an event object.

---

## Example

```js
btn.addEventListener(
    "click",
    function(event) {

        console.log(event);
    }
);
```

---

# 🎯 event.target

Returns the element that triggered the event.

---

## Example

```js
btn.addEventListener(
    "click",
    function(event) {

        console.log(
            event.target
        );
    }
);
```

---

# Output

```html
<button>Click Me</button>
```

---

# 🎨 Changing Styles Dynamically

JavaScript can modify CSS.

---

## Example

```js
const heading =
document.getElementById("heading");

heading.style.color = "red";

heading.style.fontSize =
"40px";
```

---

## Result

Text becomes:

🔴 Red

📏 40px

---

# 🏆 Best Practices

---

# ✅ Use IDs Carefully

```html
<div id="header"></div>
```

One ID = One Element

---

# ✅ Use Classes for Reusability

```html
<div class="card"></div>
<div class="card"></div>
```

Multiple elements can share classes.

---

# ✅ Prefer Modern Selectors

```js
querySelector()
querySelectorAll()
```

More flexible than older methods.

---

# ⚠️ Avoid Deep Nesting

Bad Example:

```js
parent
.children[0]
.children[1]
.children[0];
```

Problems:

❌ Hard to Read

❌ Fragile Code

❌ Difficult Maintenance

---

# 📊 CRUD Operations in DOM

| Operation | Method |
|------------|---------|
| Create | createElement() |
| Read | getElementById() |
| Update | textContent / innerHTML |
| Delete | removeChild() |

---

# 💡 Real-World DOM Workflow

```text
User Clicks Button
        ↓
Event Triggered
        ↓
JavaScript Executes
        ↓
DOM Updates
        ↓
Browser Repaints UI
```

---

# 🎯 Mini Example

## HTML

```html
<button id="btn">
  Change Text
</button>

<h1 id="title">
  Hello
</h1>
```

---

## JavaScript

```js
const btn =
document.getElementById("btn");

const title =
document.getElementById("title");

btn.addEventListener(
    "click",
    function() {

        title.textContent =
        "DOM Updated!";
    }
);
```

---

# 🧠 Quick Summary Table

| Concept | Purpose |
|----------|----------|
| DOM | Represents HTML document |
| getElementById() | Select by ID |
| getElementsByClassName() | Select by Class |
| getElementsByTagName() | Select by Tag |
| textContent | Read/Write Text |
| innerHTML | Read/Write HTML |
| createElement() | Create Node |
| appendChild() | Add Node |
| removeChild() | Remove Node |
| addEventListener() | Handle Events |
| event.target | Clicked Element |

---

# 🎯 Key Takeaways

✅ DOM represents HTML as a tree

✅ JavaScript can dynamically modify DOM

✅ Elements can be selected using IDs, Classes, and Tags

✅ Events make web pages interactive

✅ CRUD operations are possible on DOM nodes

✅ DOM manipulation is the foundation of modern frontend development

---

# 🚀 Conclusion

DOM Manipulation is one of the most important JavaScript skills because it enables developers to create dynamic, interactive, and responsive web applications.

Mastering the DOM prepares you for:

- React
- Angular
- Vue
- Browser APIs
- Frontend Interviews