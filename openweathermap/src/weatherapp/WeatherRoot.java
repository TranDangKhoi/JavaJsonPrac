package weatherapp;

public class WeatherRoot {
    private Coord coord;
    private Weather[] weather;
    private Clouds clouds;
    private Wind wind;
    private Main main;
    private String base;
    private int visibility;
    private long dt;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    public WeatherRoot(Coord coord, Weather[] weather, String base, int visibility, long dt) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.visibility = visibility;
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Coord getCoord() {
        return this.coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather[] getWeather() {
        return this.weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public Clouds getClouds() {
        return this.clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return this.wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

}
