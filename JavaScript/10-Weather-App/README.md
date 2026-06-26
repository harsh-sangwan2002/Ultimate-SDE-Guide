# 📌 Introduction

Modern web applications constantly exchange data between:

- 🌐 Client (Browser)
- 🖥 Server

This communication is made possible using two important concepts:

- 📦 JSON
- 🔗 APIs

Examples:
- Weather Apps
- Instagram
- WhatsApp
- Amazon
- Netflix
- Google Maps

All rely heavily on JSON and APIs.

---

# 📦 JSON (JavaScript Object Notation)

---

# 📖 What is JSON?

JSON stands for:

> **JavaScript Object Notation**

It is a lightweight **text-based format** used to store and exchange data between applications.

Although inspired by JavaScript object syntax, JSON is language-independent and supported by almost every programming language.

---

# 🌍 Why JSON?

JSON is used because it is:

✅ Lightweight

✅ Human Readable

✅ Easy to Write

✅ Easy to Parse

✅ Language Independent

---

# 🏗 JSON Structure

JSON stores data as **Key-Value Pairs**.

---

## Example

```json
{
    "name": "Harsh",
    "age": 23,
    "city": "Delhi"
}
```

---

# 📌 JSON Rules

- Keys must always be inside double quotes (`""`)
- Values can be:
  - String
  - Number
  - Boolean
  - Array
  - Object
  - null

---

# 📊 Supported Data Types

| Data Type | Example |
|------------|----------|
| String | `"Harsh"` |
| Number | `23` |
| Boolean | `true` |
| Array | `[1,2,3]` |
| Object | `{}` |
| Null | `null` |

---

# 🧠 Example JSON

```json
{
    "name": "Harsh",
    "age": 23,
    "skills": [
        "JavaScript",
        "React",
        "Node.js"
    ],
    "isStudent": false,
    "address": {
        "city": "Delhi",
        "country": "India"
    }
}
```

---

# 🔄 JavaScript Object vs JSON

## JavaScript Object

```js
const user = {
    name: "Harsh",
    age: 23
};
```

---

## JSON

```json
{
    "name": "Harsh",
    "age": 23
}
```

---

# ⚠️ Difference

| JavaScript Object | JSON |
|--------------------|------|
| Keys can omit quotes | Keys require double quotes |
| Used inside JavaScript | Used for data exchange |
| Can contain functions | Cannot contain functions |

---

# 🔁 JSON.stringify()

---

## 📖 Purpose

Converts a JavaScript object into a JSON string.

Used when sending data from the client to the server.

---

## Example

```js
const user = {
    name: "Harsh",
    age: 23
};

const jsonData =
JSON.stringify(user);

console.log(jsonData);
```

---

## Output

```json
{"name":"Harsh","age":23}
```

---

# 📦 Think of stringify()

```text
JavaScript Object
        ↓
Pack Data
        ↓
JSON String
```

---

# 🔁 JSON.parse()

---

## 📖 Purpose

Converts a JSON string into a JavaScript object.

Used when receiving data from the server.

---

## Example

```js
const jsonData =
'{"name":"Harsh","age":23}';

const user =
JSON.parse(jsonData);

console.log(user);
```

---

## Output

```js
{
    name: "Harsh",
    age: 23
}
```

---

# 📦 Think of parse()

```text
JSON String
      ↓
Unpack Data
      ↓
JavaScript Object
```

---

# 🔄 Complete Flow

```text
JavaScript Object
        ↓
JSON.stringify()
        ↓
JSON String
        ↓
Internet
        ↓
JSON.parse()
        ↓
JavaScript Object
```

---

# 🌐 APIs (Application Programming Interfaces)

---

# 📖 What is an API?

API stands for:

> **Application Programming Interface**

An API is a set of rules that allows two software applications to communicate with each other.

---

# 🍽 Restaurant Analogy

Imagine a restaurant.

```text
Customer
      ↓
Waiter (API)
      ↓
Kitchen (Server)
      ↓
Food
```

---

### Mapping

| Restaurant | Web Development |
|-------------|----------------|
| Customer | Client (Browser) |
| Waiter | API |
| Kitchen | Server |
| Food | Response |

The waiter takes your order, delivers it to the kitchen, and brings back your food—just like an API handles requests and responses.

---

# 🌐 API Communication Flow

```text
Browser
     ↓
API Request
     ↓
Server
     ↓
Database
     ↓
Server
     ↓
JSON Response
     ↓
Browser
```

---

# 📦 JSON & APIs Together

Most APIs exchange data in JSON format.

---

## Client Request

```text
GET /users
```

---

## Server Response

```json
[
    {
        "id": 1,
        "name": "Harsh"
    },
    {
        "id": 2,
        "name": "Rahul"
    }
]
```

---

# 🎯 Why APIs Use JSON?

✅ Lightweight

✅ Fast

✅ Easy to Parse

✅ Cross-Platform

✅ Widely Supported

---

# 🌦 Weather App Example

A Weather App works like this:

```text
User Enters City
        ↓
API Request
        ↓
Weather Server
        ↓
JSON Response
        ↓
Display Temperature
```

---

# 🧠 Example Response

```json
{
    "city": "Delhi",
    "temperature": 35,
    "condition": "Sunny"
}
```

---

# 🔍 Parsing the Response

```js
const weather = JSON.parse(response);

console.log(weather.city);
```

---

# 📡 API Endpoints

An API contains multiple **endpoints**.

Each endpoint performs a specific task.

---

## Example

```text
GET /users
```

Returns users.

---

```text
GET /movies
```

Returns movies.

---

```text
POST /login
```

Authenticates users.

---

# 🌍 Popular APIs

- Weather API
- GitHub API
- Google Maps API
- Spotify API
- OpenAI API
- TMDB (Movie) API

---

# 📥 Sending Requests

Modern JavaScript uses the **Fetch API**.

---

## Example

```js
fetch("https://api.example.com/users")
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.log(error);
    });
```

---

# 🔄 Request–Response Cycle

```text
Client
   │
   │ Request
   ▼
Server
   │
   │ Process
   ▼
Database
   │
   │ JSON Response
   ▼
Client
```

---

# ⚙️ Asynchronous APIs

API requests take time.

Therefore, JavaScript handles them asynchronously using:

- Promises
- Async/Await
- Fetch API

---

# 📋 Practical Implementation

During the session, we learned to:

- Convert JavaScript objects into JSON
- Convert JSON back into JavaScript objects
- Consume APIs
- Display API data
- Build a Weather Application

---

# 📊 JSON Methods Summary

| Method | Purpose |
|----------|----------|
| `JSON.stringify()` | Object → JSON String |
| `JSON.parse()` | JSON String → Object |

---

# 📊 API Workflow Summary

```text
User Action
      ↓
API Request
      ↓
Server
      ↓
Database
      ↓
JSON Response
      ↓
JavaScript
      ↓
Display Data
```

---

# 🧠 Quick Revision Table

| Concept | Description |
|----------|-------------|
| JSON | Lightweight data exchange format |
| API | Communication bridge between applications |
| JSON.stringify() | Object → JSON |
| JSON.parse() | JSON → Object |
| Endpoint | URL providing specific functionality |
| Request | Data sent to server |
| Response | Data returned by server |
| Fetch API | Used to make HTTP requests |

---

# 🎯 Key Takeaways

✅ JSON is the standard format for exchanging data

✅ APIs allow applications to communicate

✅ `JSON.stringify()` converts objects into JSON strings

✅ `JSON.parse()` converts JSON strings into JavaScript objects

✅ Most REST APIs send and receive JSON

✅ API calls are asynchronous

✅ Weather apps, social media apps, and e-commerce platforms all rely heavily on APIs and JSON

---

# 🚀 Conclusion

JSON and APIs form the foundation of modern web development.

Mastering these concepts enables you to build:

- Weather Apps
- Social Media Platforms
- E-commerce Websites
- Dashboards
- Full-Stack Applications
- Mobile Apps

They are essential skills for every JavaScript developer and are heavily used in React, Node.js, Express, and modern backend development.