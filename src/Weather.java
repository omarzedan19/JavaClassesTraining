public class Weather {
    public double temperature; // in Celsius
    public double humidity; // percentage between 0 and 100
    public boolean cloudy;
    public double chanceOfRain; // percentage between 0 and 100

    // Constructor
    public Weather(double temperature, double humidity, boolean cloudy, double chanceOfRain) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.cloudy = cloudy;
        this.chanceOfRain = chanceOfRain;
    }

    // toString method
    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                "°C, humidity=" + humidity +
                "%, cloudy=" + cloudy +
                ", chanceOfRain=" + chanceOfRain +
                "%}";
    }

    // Function to change chanceOfRain
    public void changeChanceOfRain(double newChanceOfRain) {
        // Ensure that the new chanceOfRain is within the valid range
        if (newChanceOfRain >= 0 && newChanceOfRain <= 100) {
            this.chanceOfRain = newChanceOfRain;
        } else {
            System.out.println("Invalid chanceOfRain value. It should be between 0 and 100.");
        }
    }

    // Function to print temperature in Fahrenheit
    public void printTempFahrenheit() {
        double tempFahrenheit = temperature * 1.8 + 32;
        System.out.println("Temperature in Fahrenheit: " + tempFahrenheit + "°F");
    }
}
