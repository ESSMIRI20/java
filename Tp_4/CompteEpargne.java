public class CompteEpargne extends Compte{
    private double tauxinteret;
    public CompteEpargne(String numero_du_compte, double solde, Clien client, double tauxinteret) {
        super(numero_du_compte, solde, client);
        this.tauxinteret = tauxinteret;
    }
    @Override
    public void retirer(double montant)
    {
        if (montant <= getSolde())
            super.retirer(montant);
    }
    public void calculerInteret()
    {
        double s = getSolde();
        super.retirer(s + tauxinteret);
    }
    public void afficher()
    {
        super.afficher();
        System.out.println("tauxinteret : " + tauxinteret);
    }
}