package vehicule;

public class Vehicule {
    protected String marque;
    protected int annee;

    public Vehicule(String marque, int annee){
        this.marque = marque;
        this.annee = annee;
        // System.out.println("i'm Vehicule\n");
    }
    public void afficherType(){
        System.out.println("C'est un véhicule.");
    }
}
