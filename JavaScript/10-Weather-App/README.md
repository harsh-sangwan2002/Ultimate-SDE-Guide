# SkyCast — Weather App

A minimal weather app that fetches real-time weather data for any city using the [WeatherAPI](https://www.weatherapi.com/).

## Live Demo

[skycast.vercel.app](https://skycast.vercel.app)

## Features

- Search weather by city name
- Displays temperature (°C), location, and current condition
- Press `Enter` or click **Search** to fetch data
- Reset button to clear the view

## Tech Stack

- HTML, CSS, JavaScript (Vanilla)
- [WeatherAPI](https://www.weatherapi.com/) — free REST API for weather data
- Deployed on [Vercel](https://vercel.com)

## Getting Started

```bash
# Clone the repo
git clone https://github.com/harsh-sangwan2002/weather-app.git
cd weather-app
```

Open `index.html` directly in your browser — no build step required.

## API Key Setup

The API key is currently hardcoded in [script.js](script.js). Before deploying to production, replace it with your own key from [weatherapi.com](https://www.weatherapi.com/) and store it securely (e.g., via Vercel environment variables with a serverless proxy).

## Project Structure

```
├── index.html   # Markup and layout
├── style.css    # Styles
├── script.js    # Fetch logic and DOM updates
└── json.js      # JSON / API concept notes
```

## Deployment

This project is a static site and deploys to Vercel with zero configuration:

1. Push the repo to GitHub
2. Import the repo on [vercel.com](https://vercel.com)
3. Click **Deploy** — done

To add a custom domain like `skycast.app`, go to **Project Settings → Domains** on Vercel.

## License

MIT
