package weatherapp;

public class Coord {
    float lon;
    float lat;

    public Coord(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public float getLon() {
        return this.lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return this.lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

}
