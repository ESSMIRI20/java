public class Responsable extends Employe{
    public Responsable(String matricule, String nom, int indice_salarial, int valeur_indice)
    {
        super(matricule, nom, indice_salarial, valeur_indice);
    }

    // public float calc_salaire()
    // {
    //     return (super.calc_salaire());
    // }
    @Override
    public String affiche()
    {
        float s = super.calc_salaire() + ((30 * super.calc_salaire()) / 100);
        return (super.affiche() + "\nResponsable salaire : " + s);
    }
}
