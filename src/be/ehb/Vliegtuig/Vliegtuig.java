package be.ehb.Vliegtuig;

import be.ehb.Mensen.Passagier;
import be.ehb.Mensen.Personeel;
import be.ehb.Mensen.Persoon;

import java.util.Arrays;

public class Vliegtuig {

    private String Startplaats;
    private String Bestemming;
    private Persoon[] passagierslijstEconomy;
    private Persoon[] passagierslijstBusiness;
    private Persoon[] personeelslijst;
    private int maxAantalEconomy;
    private int aantalEconomy;
    private int maxAantalBusiness;
    private int aantalBusiness;
    private int aantalPersoneelsleden;

    public Vliegtuig(String startplaats, String bestemming, Persoon[] passagierslijstEconomy, Persoon[] passagierslijstBusiness,
                     Persoon[] personeelslijst, int maxAantalEconomy, int aantalEconomy, int maxAantalBusiness, int aantalBusiness) {
        Startplaats = startplaats;
        Bestemming = bestemming;
        this.passagierslijstEconomy = passagierslijstEconomy;
        this.passagierslijstBusiness = passagierslijstBusiness;
        this.personeelslijst = personeelslijst;
        this.maxAantalEconomy = maxAantalEconomy;
        this.aantalEconomy = aantalEconomy;
        this.maxAantalBusiness = maxAantalBusiness;
        this.aantalBusiness = aantalBusiness;
    }

    //getters and setters

    public String getStartplaats() {
        return Startplaats;
    }

    public void setStartplaats(String startplaats) {
        Startplaats = startplaats;
    }

    public String getBestemming() {
        return Bestemming;
    }

    public void setBestemming(String bestemming) {
        Bestemming = bestemming;
    }

    public Persoon[] getPassagierslijstEconomy() {
        return passagierslijstEconomy;
    }

    public void setPassagierslijstEconomy(Persoon[] passagierslijstEconomy) {
        this.passagierslijstEconomy = passagierslijstEconomy;
    }

    public Persoon[] getPassagierslijstBusiness() {
        return passagierslijstBusiness;
    }

    public void setPassagierslijstBusiness(Persoon[] passagierslijstBusiness) {
        this.passagierslijstBusiness = passagierslijstBusiness;
    }

    public Persoon[] getPersoneelslijst() {
        return personeelslijst;
    }

    public void setPersoneelslijst(Persoon[] personeelslijst) {
        this.personeelslijst = personeelslijst;
    }

    public int getMaxAantalEconomy() {
        return maxAantalEconomy;
    }

    public void setMaxAantalEconomy(int maxAantalEconomy) {
        this.maxAantalEconomy = maxAantalEconomy;
    }

    public int getAantalEconomy() {
        return aantalEconomy;
    }

    public void setAantalEconomy(int aantalEconomy) {
        this.aantalEconomy = aantalEconomy;
    }

    public int getMaxAantalBusiness() {
        return maxAantalBusiness;
    }

    public void setMaxAantalBusiness(int maxAantalBusiness) {
        this.maxAantalBusiness = maxAantalBusiness;
    }

    public int getAantalBusiness() {
        return aantalBusiness;
    }

    public void setAantalBusiness(int aantalBusiness) {
        this.aantalBusiness = aantalBusiness;
    }

    public int getAantalPersoneelsleden() {
        return aantalPersoneelsleden;
    }

    public void setAantalPersoneelsleden(int aantalPersoneelsleden) {
        this.aantalPersoneelsleden = aantalPersoneelsleden;
    }

    //methods

    public void voegPassagierToe (Passagier boardingPassenger) {

        if (boardingPassenger.getPassagiersTicket() == null  ){
            System.out.println(boardingPassenger.getNaam() + " kan niet boarden, want heeft geen ticket.");
        }else if (boardingPassenger.getPassagiersTicket().getStartplaats().equals(this.Startplaats)
                && boardingPassenger.getPassagiersTicket().getBestemming().equals(this.Bestemming)
                && (boardingPassenger.getPassagiersTicket().isEconomy() == true)
                && (this.aantalEconomy < this.maxAantalEconomy)) {
            passagierslijstEconomy[(boardingPassenger.getPassagiersTicket().getPlaatsnummer())-1] = boardingPassenger;
            aantalEconomy++;
        } else if (boardingPassenger.getPassagiersTicket().getStartplaats().equals(this.Startplaats)
                && boardingPassenger.getPassagiersTicket().getBestemming().equals(this.Bestemming)
                && (boardingPassenger.getPassagiersTicket().isEconomy() == false)
                && (this.aantalBusiness < this.maxAantalBusiness)) {
            passagierslijstBusiness[boardingPassenger.getPassagiersTicket().getPlaatsnummer()-1] = boardingPassenger;
            aantalBusiness++;
        } else if (boardingPassenger.getPassagiersTicket().isEconomy() == true && this.aantalEconomy == this.maxAantalEconomy) {
            System.out.println("Economyklasse zit vol!");
        } else if (boardingPassenger.getPassagiersTicket().isEconomy() == false && this.aantalBusiness == this.maxAantalBusiness) {
            System.out.println("Businessklasse zit vol!");
        } else {
            System.out.println(boardingPassenger.getNaam() + " heeft een ongeldig ticket");
        }

    }

    public void voegPersoneelToe (Personeel boardingPersoneel) {
        personeelslijst[aantalPersoneelsleden] = boardingPersoneel;
        aantalPersoneelsleden++;
    }


    @Override
    public String toString() {
        return "Vliegtuig{" +
                "Startplaats='" + Startplaats + '\'' +
                ", Bestemming='" + Bestemming + '\'' +
                ", passagierslijstEconomy=" + Arrays.toString(passagierslijstEconomy) +
                ", passagierslijstBusiness=" + Arrays.toString(passagierslijstBusiness) +
                ", personeelslijst=" + Arrays.toString(personeelslijst) +
                ", maxAantalEconomy=" + maxAantalEconomy +
                ", aantalEconomy=" + aantalEconomy +
                ", maxAantalBusiness=" + maxAantalBusiness +
                ", aantalBusiness=" + aantalBusiness +
                ", aantalPersoneelsleden=" + aantalPersoneelsleden +
                '}';
    }
}
