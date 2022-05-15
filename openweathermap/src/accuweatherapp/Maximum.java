package accuweatherapp;

public class Maximum {
    private float Value;
    private String Unit;
    private int UnitType;
    String Phrase;

    public Maximum(float value, String unit, int unitType, String phrase) {
        Value = value;
        Unit = unit;
        UnitType = unitType;
        Phrase = phrase;
    }

    public float getValue() {
        return this.Value;
    }

    public void setValue(float Value) {
        this.Value = Value;
    }

    public String getUnit() {
        return this.Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public int getUnitType() {
        return this.UnitType;
    }

    public void setUnitType(int UnitType) {
        this.UnitType = UnitType;
    }

    public String getPhrase() {
        return this.Phrase;
    }

    public void setPhrase(String Phrase) {
        this.Phrase = Phrase;
    }
}
