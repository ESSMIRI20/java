package velo;
import vehicule.Vehicule;

public class Velo extends Vehicule{
    private boolean avecPorteBagages;
    public Velo(String marque, int annee, boolean avecPorteBagages)
    {
        super(marque, annee);
        this.avecPorteBagages = avecPorteBagages;
    }
    public void afficherType()
    {
        System.out.println("marque" + marque + "annee" + annee + "Porte Bagages" + avecPorteBagages);
    }
}
