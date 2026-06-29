const temp = document.querySelector('.temp');
const city = document.querySelector('.location');
const condition = document.querySelector('.condition');

const input = document.querySelector('input');
const button = document.querySelector('.search');
const reset = document.querySelector('.reset');

button.addEventListener('click', async (e) => {
    const city = input.value;
    await fetchWeatherData(city);
})

input.addEventListener('keypress', async (e) => {
    if (e.key == 'Enter') {
        const city = input.value;
        await fetchWeatherData(city);
    }
})

const fetchWeatherData = async (city) => {
    let url = `https://api.weatherapi.com/v1/current.json?key=fb0b9d625d354cb684e50017251701&q=${city}&aqi=no`;
    const data = await fetch(url);
    const res = await data.json();
    updateDOM(res);
}

const updateDOM = (res) => {
    temp.innerText = res.current.temp_c + " °C";
    city.innerText = res.location.name;
    condition.innerText = res.current.condition.text;
}