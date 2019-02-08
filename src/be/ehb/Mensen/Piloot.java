package be.ehb.Mensen;

import be.ehb.Vliegtuig.Vliegtuig;

import be.ehb.Mensen.Passagier;

public class Piloot extends Personeel {

    public Piloot(String naam, int leeftijd, Adres adres) {
        super(naam, leeftijd, adres);
    }

    public boolean flightCheck (Vliegtuig testVliegtuig) {
        boolean personeelCheck = false;
        boolean passagierCheck = false;

        if (testVliegtuig.getAantalPersoneelsleden() >= 3) {
            personeelCheck = true;
        } else {
            System.out.println("Er zijn te weinig personeelsleden aanwezig.\nHet vliegtuig kan niet vertrekken.");
            return false;
        }

        if ((testVliegtuig.getPassagierslijstEconomy().length+testVliegtuig.getPassagierslijstBusiness().length) == (testVliegtuig.getAantalEconomy() + testVliegtuig.getAantalBusiness())) {
            passagierCheck = true;
        } else {
            System.out.println("Er ontbreken passagiers.\nHet vliegtuig kan niet vertrekken.");
            return false;
        }

        if (passagierCheck == true && personeelCheck == true ) {
            return true;
        } else {
            System.out.println("Het vliegtuig kan niet vertrekken.");
            return false;
        }

    }


    public void opstijgen (Vliegtuig opstijgendVliegtuig) {
        System.out.println("Hello party people\n" +
                "This is captain Kim speaking\n" +
                "Welcome aboard Venga Airways\n" +
                "After take off will pump up the soundsystem\n" +
                "Cause we're going to Ibiza");
    }

    public void landing (Vliegtuig landendVliegtuig) {
        System.out.println("\nThank you for flying Venga Airways\n" +
                "We are now approaching Ibiza Airport\n" +
                "As you can see the sky is blue\n" +
                "And the beach is waiting for you");
    }

}
