package be.ehb.Mensen;

public class Passagier extends Persoon {

    private Ticket passagiersTicket;
    private double bagage;
    private static int AANTALPASSAGIERS;

    public Passagier(String naam, int leeftijd, Adres adres, Ticket passagiersTicket, double bagage) {
        super(naam, leeftijd, adres);
        this.passagiersTicket = passagiersTicket;
        this.bagage = bagage;
    }

    public Passagier(String naam, int leeftijd, Adres adres, double bagage) {
        super(naam, leeftijd, adres);
        this.bagage = bagage;
    }

    public double getBagage() {
        return bagage;
    }

    public void setBagage(double bagage) {
        this.bagage = bagage;
    }

    public Ticket getPassagiersTicket() {
        return passagiersTicket;
    }

    public static int getAANTALPASSAGIERS() {
        return AANTALPASSAGIERS;
    }

    public static void setAANTALPASSAGIERS(int AANTALPASSAGIERS) {
        Passagier.AANTALPASSAGIERS = AANTALPASSAGIERS;
    }

    public void setPassagiersTicket(Ticket passagiersTicket, Passagier testPassagier) {
        if (testPassagier.getBagage()<=20){
            this.passagiersTicket = passagiersTicket;
            AANTALPASSAGIERS++;
        } else {
            System.out.println("De bagage van " + testPassagier.getNaam() + " is te zwaar, bijbetalen aub.");
            double bijbetalen = (testPassagier.bagage-20) * 20;
            System.out.format("Dat is dan %.2f extra aub. \n", bijbetalen);
            testPassagier.bagage = 10;
        }

    }

    public void setPassagiersTicket (boolean bijbetalen, Ticket passagiersTicket, Passagier testPassagier) {
        if (bijbetalen == true && testPassagier.getBagage()<=20){
            this.passagiersTicket = passagiersTicket;
            AANTALPASSAGIERS++;
            System.out.println("Bijbetaald, ticket is ok. \n");
        } else {
            System.out.println(testPassagier.getNaam() + ", je bent gierig");

        }
    }


}
