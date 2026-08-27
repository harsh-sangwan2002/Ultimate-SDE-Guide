# Section 01 — HTML & CSS Fundamentals

> Quick catch notes from **Build Modern Responsive Websites with HTML & CSS**

---

## 1. Welcome To The Course

- Course focuses on building **modern, responsive websites**.
- Main technologies:
  - **HTML** → Structure
  - **CSS** → Styling & Layout
  - **JavaScript** → Behaviour & Interactivity

- Focus is on learning through **modules, mini-projects, and complete websites**.

---

## 2. How The Web Works

### Basic Flow

```text
User
  ↓
Browser
  ↓
HTTP Request
  ↓
Web Server
  ↓
HTTP Response
  ↓
Browser
  ↓
HTML + CSS + JS
```

### Key Points

- **Browser** requests resources from a server.
- **Server** processes the request and sends a response.
- **HTTP/HTTPS** is used for communication between client and server.
- The browser interprets:
  - HTML → Structure
  - CSS → Presentation
  - JavaScript → Behaviour

### Important Terms

- **Client** → Usually the browser.
- **Server** → Computer/system that provides resources.
- **URL** → Address of a resource on the web.
- **HTTP** → Protocol used for web communication.
- **HTTPS** → Secure version of HTTP.
- **DNS** → Converts domain names into IP addresses.

---

## 3. Roles of HTML, CSS & JavaScript

### HTML — Structure

HTML defines **what exists on the webpage**.

```html
<h1>Hello World</h1>
<p>This is a paragraph.</p>
<button>Click Me</button>
```

Think:

> **HTML = Skeleton**

---

### CSS — Presentation

CSS defines **how the webpage looks**.

```css
h1 {
  color: blue;
  font-size: 32px;
}
```

CSS controls:

- Colors
- Fonts
- Spacing
- Layout
- Positioning
- Responsive design
- Animations

Think:

> **CSS = Appearance**

---

### JavaScript — Behaviour

JavaScript makes webpages **interactive and dynamic**.

```javascript
button.addEventListener("click", () => {
  console.log("Clicked!");
});
```

JavaScript can handle:

- User interactions
- DOM manipulation
- API requests
- Dynamic content
- Application logic

Think:

> **JavaScript = Behaviour**

### Easy Analogy

```text
HTML        → Skeleton
CSS         → Clothes / Appearance
JavaScript  → Brain / Behaviour
```

---

## 4. VS Code Editor & Environment

### VS Code

**Visual Studio Code** is the code editor used for development.

Useful features:

- Syntax highlighting
- IntelliSense
- Extensions
- Integrated terminal
- Git integration
- Debugging

### Basic Web Project

```text
project/
│
├── index.html
├── style.css
└── script.js
```

### Connecting Files

**HTML → CSS**

```html
<link rel="stylesheet" href="style.css" />
```

**HTML → JavaScript**

```html
<script src="script.js"></script>
```

### Important

`index.html` is commonly used as the **main/entry HTML page** of a website.

---

## 5. Course Code

This section contains the **code/resources provided with the course**.

Use the course code to:

- Follow along with lectures
- Compare implementations
- Experiment with examples
- Debug your own code
- Revise concepts

> **Don't just copy the code — type it, understand it, and modify it.**

---

## ⚡ Quick Revision

```text
HTML       → Structure
CSS        → Styling
JavaScript → Behaviour

Browser    → Client
Server     → Provides resources
HTTP       → Communication protocol
DNS        → Domain → IP
VS Code    → Code editor

index.html → Common entry page
```

### Core Principle

> **HTML builds the structure → CSS makes it beautiful → JavaScript makes it interactive.**
