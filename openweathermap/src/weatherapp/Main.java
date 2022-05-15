package weatherapp;

public class Main {
    private float temp;
    private float feels_like;
    private float temp_min;
    private float temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;

    public Main(float temp, float feels_like, float temp_min, float temp_max, int pressure, int humidity, int sea_level,
            int grnd_level) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public float getTemp() {
        return this.temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getFeels_like() {
        return this.feels_like;
    }

    public void setFeels_like(float feels_like) {
        this.feels_like = feels_like;
    }

    public float getTemp_min() {
        return this.temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getTemp_max() {
        return this.temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return this.pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSea_level() {
        return this.sea_level;
    }

    public void setSea_level(int sea_level) {
        this.sea_level = sea_level;
    }

    public int getGrnd_level() {
        return this.grnd_level;
    }

    public void setGrnd_level(int grnd_level) {
        this.grnd_level = grnd_level;
    }
}
