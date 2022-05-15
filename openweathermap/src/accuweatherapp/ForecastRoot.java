package accuweatherapp;

public class ForecastRoot {
    private Headline headline;
    private DailyForecasts[] DailyForecasts;

    public Headline getHeadline() {
        return this.headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public DailyForecasts[] getDailyForcasts() {
        return this.DailyForecasts;
    }

    public void setDailyForcasts(DailyForecasts[] dailyForcasts) {
        this.DailyForecasts = dailyForcasts;
    }
}
