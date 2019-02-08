package be.ehb;

import be.ehb.Luchthaven.Controletoren;
import be.ehb.Mensen.*;
import be.ehb.Vliegtuig.Vliegtuig;

public class Main {

    public static void main(String[] args) {

        //aanmaak passagiers
        Adres adresJan = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Ticket ticketJan = new Ticket ("Brussel", "Ibiza", 1, true);
        Passagier jan = new Passagier("Jan", 38, adresJan, 77.3);


        Adres adresPiet = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Ticket ticketPiet = new Ticket ("Brussel", "Ibiza", 2, true);
        Passagier piet = new Passagier("Piet", 38, adresPiet, 10.3);

        Adres adresJoris = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Ticket ticketJoris = new Ticket ("Brussel", "Ibiza", 3, true);
        Passagier joris = new Passagier("Joris", 38, adresJoris, 10.3);

        Adres adresKorneel = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Ticket ticketKorneel = new Ticket ("Brussel", "Ibiza", 4, true);
        Passagier korneel = new Passagier("Korneel", 38, adresKorneel, 10.3);


        //aanmaak personeel
        Adres adresKim = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Piloot kim = new Piloot("Kim", 38, adresKim);

        Adres adresMarina = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Steward marina = new Steward ("Marina", 38, adresMarina);

        Adres adresJohnny = new Adres("Gelukstraat", "78", 3160, "Betekom");
        Steward johnny = new Steward ("Marina", 38, adresJohnny);

        //ticketbalie
        jan.setPassagiersTicket(ticketJan, jan);
        piet.setPassagiersTicket(ticketPiet, piet);
        joris.setPassagiersTicket(ticketJoris, joris);
        korneel.setPassagiersTicket(ticketKorneel, korneel);

        boolean bijbetalen = true;
        jan.setPassagiersTicket(bijbetalen, ticketJan, jan);

        //aanmaak vliegtuig
        int maxAantalPassagiersEconomy = 1;
        int maxAantalPassagiersBusiness = 4;
        Persoon[] passagiersLijstEconomyTest = new Persoon [maxAantalPassagiersEconomy];
        Persoon[] passagiersLijstBusinessTest = new Persoon [maxAantalPassagiersBusiness];
        Persoon[] personeelslijstTest = new Persoon [5];
        Vliegtuig vengaAirways = new Vliegtuig("Brussel", "Ibiza", passagiersLijstEconomyTest,
                passagiersLijstBusinessTest, personeelslijstTest, maxAantalPassagiersEconomy, 0,maxAantalPassagiersBusiness,0);

        //boarding
        vengaAirways.voegPassagierToe(jan);
        vengaAirways.voegPassagierToe(piet);
        vengaAirways.voegPassagierToe(joris);
        vengaAirways.voegPassagierToe(korneel);

        vengaAirways.voegPersoneelToe(kim);
        vengaAirways.voegPersoneelToe(marina);
        vengaAirways.voegPersoneelToe(johnny);

        //piloot doet flightcheck
        boolean flightCheck = kim.flightCheck(vengaAirways);

        //toestemming controletoren
        Controletoren.toestemming (flightCheck);

        //opstijgen en landen
        if (flightCheck) {
            kim.opstijgen(vengaAirways);

            kim.landing(vengaAirways);
        }

        //System.out.println(Passagier.getAANTALPASSAGIERS());
        //System.out.println(vengaAirways);
    }
}
