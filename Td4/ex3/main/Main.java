package main;
import vehicule.Vehicule;
import voiture.Voiture;
import velo.Velo;


public class Main {
    public static void main(String[] args){
        Velo v = new Velo("lamborghini", 1963, true);
        v.afficherType();
    }
}
