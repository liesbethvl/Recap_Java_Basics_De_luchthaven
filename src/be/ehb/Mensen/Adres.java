package be.ehb.Mensen;

public class Adres {

    private String straatnaam;
    private String huisnummer;
    private int postcode;
    private String plaats;

    public Adres(String straatnaam, String huisnummer, int postcode, String plaats) {
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}
