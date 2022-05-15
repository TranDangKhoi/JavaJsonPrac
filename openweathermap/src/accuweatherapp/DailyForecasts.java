package accuweatherapp;

public class DailyForecasts {
    private String Date;
    private long EpochDate;
    private Sun sun;
    private Moon moon;
    private Temperature temperature;
    private RealFeelTemperature RealFeelTemperature;
    private RealFeelTemepratureShade RealFeelTemperatureShade;
    private float HoursOfSun;
    private DegreeDaySummary degreeDaySummary;
    private AirAndPollen airAndPollen;
    private Day day;
    private Night night;

    public DailyForecasts(String date, long epochDate, Sun sun, Moon moon, Temperature temperature,
            RealFeelTemperature realFeelTemperature, RealFeelTemepratureShade realFeelTemperatureShade,
            float hoursOfSun, DegreeDaySummary degreeDaySummary, AirAndPollen airAndPollen, Day day, Night night) {
        Date = date;
        EpochDate = epochDate;
        this.sun = sun;
        this.moon = moon;
        this.temperature = temperature;
        this.RealFeelTemperature = realFeelTemperature;
        this.RealFeelTemperatureShade = realFeelTemperatureShade;
        HoursOfSun = hoursOfSun;
        this.degreeDaySummary = degreeDaySummary;
        this.airAndPollen = airAndPollen;
        this.day = day;
        this.night = night;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public long getEpochDate() {
        return this.EpochDate;
    }

    public void setEpochDate(long EpochDate) {
        this.EpochDate = EpochDate;
    }

    public Sun getSun() {
        return this.sun;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }

    public Moon getMoon() {
        return this.moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public Temperature getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public RealFeelTemperature getRealFeelTemperature() {
        return this.RealFeelTemperature;
    }

    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.RealFeelTemperature = realFeelTemperature;
    }

    public RealFeelTemepratureShade getRealFeelTemperatureShade() {
        return this.RealFeelTemperatureShade;
    }

    public void setRealFeelTemperatureShade(RealFeelTemepratureShade realFeelTemperatureShade) {
        this.RealFeelTemperatureShade = realFeelTemperatureShade;
    }

    public float getHoursOfSun() {
        return this.HoursOfSun;
    }

    public void setHoursOfSun(float HoursOfSun) {
        this.HoursOfSun = HoursOfSun;
    }

    public DegreeDaySummary getDegreeDaySummary() {
        return this.degreeDaySummary;
    }

    public void setDegreeDaySummary(DegreeDaySummary degreeDaySummary) {
        this.degreeDaySummary = degreeDaySummary;
    }

    public AirAndPollen getAirAndPollen() {
        return this.airAndPollen;
    }

    public void setAirAndPollen(AirAndPollen airAndPollen) {
        this.airAndPollen = airAndPollen;
    }

    public Day getDay() {
        return this.day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Night getNight() {
        return this.night;
    }

    public void setNight(Night night) {
        this.night = night;
    }
    // private Sources[] sources;
}
