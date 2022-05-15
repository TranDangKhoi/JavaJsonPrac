package weatherapp;

public class Wind {
    private float speed;
    private float deg;
    private float gust;

    public Wind(float speed, float deg, float gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return this.deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public float getGust() {
        return this.gust;
    }

    public void setGust(float gust) {
        this.gust = gust;
    }

}
