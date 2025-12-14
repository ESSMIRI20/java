public class Employe {
    private String matricule;
    private String nom;
    private float   indice_salarial;
    private static float   valeur_indice;

    public Employe(String matricule, String nom, int indice_salarial, int valeur_indice){
        this.matricule = matricule;
        this.nom = nom;
        this.indice_salarial = indice_salarial;
        this.valeur_indice = valeur_indice;
    }
    public float calc_salaire()
    {
        return (this.indice_salarial * this.valeur_indice);
    }

    public String affiche()
    {
        return ("matricule : " + this.matricule + " \nnom " + this.nom + "\nindice_salarial :" + this.indice_salarial + "\nvaleur_indice :" + this.valeur_indice);
    }
}
