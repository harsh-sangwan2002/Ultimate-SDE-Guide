# 📌 Introduction

In this session, we built a mini **BookMyShow Clone** focusing on:

✅ Create Movies  
✅ Read Movies  
✅ Update UI Dynamically  
✅ Delete Movies  
✅ Filter Movies by Genre  
✅ Scroll Navigation  
✅ Event Handling  
✅ DOM Manipulation  

This project helped us understand how real-world web applications update the UI dynamically without refreshing the page.

---

# 🎬 What is CRUD?

CRUD stands for:

| Operation | Meaning |
|------------|----------|
| Create | Add Data |
| Read | Display Data |
| Update | Modify Data |
| Delete | Remove Data |

---

# 🏗 Example: Movie Application

```text
Movie App
   ↓
Create Movie
Read Movie List
Filter Movies
Delete Movie
```

---

# 🎨 CSS Positioning

Before implementing delete functionality, we learned positioning.

---

# 📍 position: relative

Creates a reference point for child elements.

```css
.movie-card {
    position: relative;
}
```

---

# 📍 position: absolute

Positions an element relative to its nearest positioned ancestor.

```css
.delete-btn {
    position: absolute;
    top: 10px;
    right: 10px;
}
```

---

# 🧠 Visualization

```text
Movie Card
┌────────────────────┐
│                ❌  │
│                    │
│  Movie Poster      │
│                    │
└────────────────────┘
```

---

# 🎯 Why Use Relative + Absolute?

Without relative:

```css
position: absolute;
```

Element positions relative to the page.

With relative:

```css
parent → relative
child → absolute
```

Element positions relative to the card.

---

# 🖱 Event Handling

JavaScript becomes interactive through events.

---

# 📖 What is an Event?

An event is any user action.

Examples:

- Click
- Hover
- Scroll
- Key Press
- Form Submission

---

# addEventListener()

Used to listen for events.

---

## Example

```js
button.addEventListener(
    "click",
    function() {
        console.log("Clicked");
    }
);
```

---

# ❌ Delete Movie Functionality

Each movie card contains a delete button.

---

## HTML

```html
<div class="movie-card">
    <button class="delete-btn">
        ❌
    </button>
</div>
```

---

## JavaScript

```js
const buttons =
document.querySelectorAll(
    ".delete-btn"
);

buttons.forEach(button => {

    button.addEventListener(
        "click",
        function() {

            this.closest(".movie-card")
                .remove();
        }
    );

});
```

---

# 🎯 Result

When user clicks:

```text
❌ Delete
```

Movie card disappears instantly.

---

# 🧠 Why Use closest()?

DOM structures often become nested.

Example:

```html
<div class="movie-card">
    <div>
        <button>
            ❌
        </button>
    </div>
</div>
```

Instead of:

```js
parentElement.parentElement
```

Use:

```js
closest(".movie-card")
```

Cleaner and safer.

---

# 📦 DOM Manipulation

DOM manipulation allows us to:

- Create Elements
- Read Elements
- Update Elements
- Delete Elements

---

# CRUD Operations in DOM

| CRUD | DOM Method |
|--------|------------|
| Create | createElement() |
| Read | querySelector() |
| Update | textContent / innerHTML |
| Delete | remove() |

---

# 🎬 Movie Filtering by Genre

One of the major features implemented was:

```text
Action
Comedy
Drama
Sci-Fi
```

Filtering movies dynamically.

---

# 🏷 Using Custom Data Attributes

HTML supports custom attributes.

---

## Example

```html
<div
class="movie-card"
data-genre="action"
>
    Movie 1
</div>
```

---

# Why Use data-*?

Allows storing metadata directly inside HTML.

---

# Accessing Data Attribute

```js
const genre =
movie.dataset.genre;
```

---

# 🎯 Filtering Logic

---

## HTML

```html
<select id="genre-filter">

    <option value="all">
        All
    </option>

    <option value="action">
        Action
    </option>

</select>
```

---

## JavaScript

```js
filter.addEventListener(
    "change",
    function() {

        const selectedGenre =
        this.value;

        movies.forEach(movie => {

            if(
                selectedGenre === "all"
            ) {

                movie.style.display =
                "block";

            } else if(
                movie.dataset.genre ===
                selectedGenre
            ) {

                movie.style.display =
                "block";

            } else {

                movie.style.display =
                "none";

            }

        });

    }
);
```

---

# 📊 Filtering Workflow

```text
User Selects Genre
          ↓
Read Dropdown Value
          ↓
Loop Through Movies
          ↓
Match Genre
          ↓
Show / Hide Movies
```

---

# 🎨 Better Approach: CSS Classes

Instead of:

```js
element.style.display =
"none";
```

Use CSS classes.

---

## CSS

```css
.hide {
    display: none;
}
```

---

## JavaScript

```js
movie.classList.add("hide");
```

or

```js
movie.classList.remove("hide");
```

---

# 🚀 Benefits

✅ Cleaner Code

✅ Reusable Styles

✅ Better Maintainability

---

# ⌨ Scroll Navigation

Implemented keyboard-based navigation.

---

# Examples

Press:

```text
1 → Section 1
2 → Section 2
3 → Section 3
t → Top
b → Bottom
```

---

# JavaScript

```js
document.addEventListener(
    "keydown",
    function(event) {

        if(event.key === "1") {

            section1.scrollIntoView();

        }

    }
);
```

---

# scrollIntoView()

Automatically scrolls to an element.

---

## Example

```js
section.scrollIntoView();
```

---

# Scroll to Top

```js
window.scrollTo({
    top: 0
});
```

---

# Scroll to Bottom

```js
window.scrollTo({
    top:
    document.body.scrollHeight
});
```

---

# ⚠️ JavaScript Rendering Issues

A common issue:

```js
document.getElementById("btn");
```

returns:

```js
null
```

---

# Why?

JavaScript executes before HTML loads.

---

# ❌ Wrong

```html
<script src="app.js"></script>

<body>
   ...
</body>
```

---

# ✅ Correct

```html
<body>

   ...

   <script src="app.js"></script>

</body>
```

---

# OR

Use:

```js
DOMContentLoaded
```

---

## Example

```js
document.addEventListener(
    "DOMContentLoaded",
    function() {

    }
);
```

---

# 🐞 Debugging Philosophy

Always test features separately.

---

# Example

Instead of testing:

```text
Add Movie
Delete Movie
Filter Movie
Scroll
```

All together,

Test:

```text
Step 1 → Add
Step 2 → Delete
Step 3 → Filter
```

One feature at a time.

---

# 📊 Project Features Summary

| Feature | Concepts Used |
|----------|--------------|
| Add Movie | DOM Creation |
| Delete Movie | Event Handling |
| Filter Movies | Data Attributes |
| Hide/Show Movies | CSS Classes |
| Scroll Navigation | Keyboard Events |
| Dynamic UI | DOM Manipulation |
| Delete Icon Positioning | Relative + Absolute |

---

# 🎯 Mini Architecture

```text
Movie App
     │
     ├── Add Movie
     │
     ├── Delete Movie
     │
     ├── Filter Genre
     │
     ├── Scroll Navigation
     │
     └── Dynamic Rendering
```

---

# 🧠 Quick Revision Table

| Topic | Key Concept |
|----------|------------|
| position: relative | Parent reference |
| position: absolute | Child positioning |
| addEventListener() | Event Handling |
| remove() | Delete Node |
| data-* | Custom Attributes |
| dataset | Access Data Attributes |
| classList | Add/Remove Classes |
| scrollIntoView() | Scroll Navigation |
| closest() | Find Parent Element |
| DOMContentLoaded | Wait for HTML Load |

---

# 🎯 Key Takeaways

✅ CRUD operations are the foundation of web applications

✅ Event listeners make pages interactive

✅ DOM manipulation updates UI dynamically

✅ Custom data attributes help store metadata

✅ CSS classes are better than inline styling

✅ `closest()` is useful for nested structures

✅ Proper script placement prevents DOM access issues

---

# 🚀 Conclusion

This BookMyShow-style CRUD project combines multiple frontend concepts into one practical application.

By completing this project, you've learned:

- DOM Manipulation
- Event Handling
- Dynamic Rendering
- Filtering
- CSS Positioning
- Scroll Navigation
- Debugging Strategies

These are the exact skills required to build modern applications using:

- JavaScript
- React
- Vue
- Angular