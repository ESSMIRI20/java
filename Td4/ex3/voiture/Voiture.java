package voiture;
import vehicule.Vehicule;

public class Voiture extends Vehicule{
    private int nbPortes;
    public Voiture(String marque, int annee, int nbPortes){
        super(marque, annee);
        this.nbPortes = nbPortes;
    }
    public void afficherType(){
        System.out.println("C'est une voiture de marque " + marque + ", année " + annee + " avec " + nbPortes + " portes");
    }
}
