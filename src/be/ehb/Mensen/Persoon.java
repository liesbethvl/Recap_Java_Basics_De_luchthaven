package be.ehb.Mensen;

public class Persoon {

    private String naam;
    private int leeftijd;
    private Adres adres;

    public Persoon(String naam, int leeftijd, Adres adres) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }


}
