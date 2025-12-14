public class Compte{
    private String numero_du_compte;
    private double solde;
    private Clien client;
    public Compte(String numero_du_compte, double solde, Clien client) {
        this.numero_du_compte = numero_du_compte;
        this.solde = solde;
        this.client = client;
    }
    public String getNumero_du_compte() {
        return numero_du_compte;
    }
    public double getSolde() {
        return solde;
    }
    public Clien getClient() {
        return client;
    }
    public void  deposer(double montant){
        solde += montant;
    }
    public void  retirer(double montant){
        System.out.println("retrait de: " + montant);
        solde -= montant;
    }
    public void afficher()
    {
        System.out.println("numero_du_compte : " + numero_du_compte);
        System.out.println("solde : " + solde);
    }
}
