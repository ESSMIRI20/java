class CompteCourant extends Compte{
    private double decouvertautorise;
    public CompteCourant(String numero_du_compte, double solde, Clien client, double decouvertautorise) {
        super(numero_du_compte, solde, client);
        this.decouvertautorise = decouvertautorise;
    }
    @Override
    public void retirer(double montant)
    {
        if (montant <= (getSolde() + decouvertautorise))
            super.retirer(montant);
        else
            System.out.println("depasse le decouvert autorise.");
    }
    public void afficher()
    {
        super.afficher();
        System.out.println("decouvertautorise : " + decouvertautorise);
    }
}
