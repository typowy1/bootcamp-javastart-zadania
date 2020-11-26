package lekcja16_zadanie2_konwerterczasu.mojerozwiazanie.pierwszerozwiązanie;

public enum ZonesId {

    LONDON("Europe/London"),
    LOS_ANGELES("America/Los_Angeles"),
    SYDNEY("Australia/Sydney");

    private String zoneId;

    ZonesId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }
}
