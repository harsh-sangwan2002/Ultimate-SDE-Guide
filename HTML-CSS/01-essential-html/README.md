# Section 2 — Essential HTML

> Quick catch notes for revision.

## 6. Section Intro

- Introduction to the fundamentals of **HTML**.
- Focus: creating structured web pages using HTML elements.

## 7. Create & Open HTML Files

- Create files with `.html` extension.
- Main page is commonly `index.html`.
- Open HTML directly in a browser to view the page.

## 8. HTML Tags & Attributes

- **Tag** defines an HTML element.
- **Attribute** provides additional information.

```html
<a href="https://example.com">Visit</a>
```

- `a` → tag
- `href` → attribute

## 9. Document Structure

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page</title>
  </head>
  <body>
    <h1>Hello</h1>
  </body>
</html>
```

- `<!DOCTYPE html>` → HTML5 document
- `<html>` → Root element
- `<head>` → Metadata/resources
- `<body>` → Visible content

## 10. Live Server & Prettier

- **Live Server** → Automatically refreshes browser when code changes.
- **Prettier** → Automatically formats code consistently.

## 11. Sandbox Files Setup

- Sandbox files are useful for **small experiments and testing**.
- Keep practice code separate from project code.

## 12. Meta Tags & Search

Meta tags provide information about the webpage.

```html
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="My website" />
```

- `charset` → Character encoding
- `viewport` → Responsive behaviour
- `description` → Search-engine/page description

## 13. Headings, Paragraphs & Emphasis

```html
<h1>Main Heading</h1>
<h2>Subheading</h2>
<p>Paragraph text.</p>
<strong>Important</strong>
<em>Emphasized</em>
```

- Use headings in a logical hierarchy.
- `<strong>` → Strong importance
- `<em>` → Emphasis

## 14. Browser DevTools

- Open with **F12** or `Cmd + Option + I` on Mac.
- Useful for:
  - Inspecting HTML
  - Testing CSS
  - Debugging
  - Checking console errors
  - Understanding page structure

## 15. Lists

### Unordered List

```html
<ul>
  <li>HTML</li>
  <li>CSS</li>
</ul>
```

### Ordered List

```html
<ol>
  <li>Learn</li>
  <li>Practice</li>
</ol>
```

## 16. Anchor Tags

```html
<a href="https://example.com">Visit</a>
```

- `href` → Destination
- `target="_blank"` → Opens in a new tab

## 17. Images

```html
<img src="image.jpg" alt="Description" />
```

- `src` → Image location
- `alt` → Alternative text
- `<img>` is a **void element**.

## 18. Block vs Inline Elements

**Block elements**

- Start on a new line.
- Usually take available width.
- Examples: `<div>`, `<p>`, `<h1>`

**Inline elements**

- Stay within the same line.
- Examples: `<span>`, `<a>`, `<strong>`

## 19. Line Breaks, Rules & Entities

```html
<br />
<hr />
&nbsp; &lt; &gt; &amp;
```

- `<br>` → Line break
- `<hr>` → Horizontal rule
- Entities → Display reserved/special characters.

## 20. Divs & Spans

- `<div>` → Generic **block-level container**
- `<span>` → Generic **inline container**

```html
<div>Block container</div>
<span>Inline content</span>
```

## 21. Classes & IDs

```html
<div class="card" id="main-card"></div>
```

- `class` → Reusable across multiple elements.
- `id` → Unique identifier.
- Classes are commonly used for **CSS styling**.
- IDs can be used for **specific targeting**.

## 22. Semantic Elements

Semantic HTML gives meaning to page structure.

```html
<header>
  <nav>
    <main>
      <section>
        <article>
          <aside>
            <footer></footer>
          </aside>
        </article>
      </section>
    </main>
  </nav>
</header>
```

> Prefer semantic elements over unnecessary `<div>` elements.

## 23. Emmet Crash Course

Emmet helps write HTML quickly.

```text
!
```

→ Generates HTML boilerplate.

```text
ul>li*3
```

→ Creates a `<ul>` containing 3 `<li>` elements.

## 24. Keyboard Shortcuts

Useful shortcuts improve development speed.

- `Cmd + S` → Save
- `Cmd + P` → Quick file search
- `Cmd + /` → Comment/uncomment
- `Cmd + D` → Select next occurrence
- `Shift + Option + F` → Format document

## 25. Pricing Grid Challenge

### Practice Goal

Build a pricing grid using the HTML concepts learned in this section.

Focus on:

- Semantic structure
- Headings
- Paragraphs
- Lists
- Links
- Images
- Classes
- Proper document structure

---

## ⚡ Quick Revision

```text
HTML
├── Tags        → Define elements
├── Attributes  → Add information
├── Head        → Metadata/resources
├── Body        → Visible content
├── Semantic    → Meaningful structure
├── Class       → Reusable identifier
├── ID          → Unique identifier
├── Block       → New line
└── Inline      → Same line
```

> **HTML = Structure + Meaning + Content**
