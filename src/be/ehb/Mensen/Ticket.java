package be.ehb.Mensen;

public class Ticket {

    private String startplaats;
    private String bestemming;
    private int plaatsnummer;
    boolean economy = true;

    public Ticket(String startplaats, String bestemming, int plaatsnummer, boolean economy) {
        this.startplaats = startplaats;
        this.bestemming = bestemming;
        this.plaatsnummer = plaatsnummer;
        this.economy = economy;
    }

    public String getStartplaats() {
        return startplaats;
    }

    public void setStartplaats(String startplaats) {
        this.startplaats = startplaats;
    }

    public String getBestemming() {
        return bestemming;
    }

    public void setBestemming(String bestemming) {
        this.bestemming = bestemming;
    }

    public int getPlaatsnummer() {
        return plaatsnummer;
    }

    public void setPlaatsnummer(int plaatsnummer) {
        this.plaatsnummer = plaatsnummer;
    }

    public boolean isEconomy() {
        return economy;
    }

    public void setEconomy(boolean economy) {
        this.economy = economy;
    }
}
