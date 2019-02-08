package be.ehb.Luchthaven;

public class Controletoren {

    public static void toestemming (boolean flightCheck) {

        if (flightCheck ==  true) {
            System.out.println("Permission to take off.\n");

        } else {
            System.out.println("Er is een probleem bij de flight check.");

        }
    }


}
