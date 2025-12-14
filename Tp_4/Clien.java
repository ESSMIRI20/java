public class Clien {
    private String nom;
    private String prenom;
    private String adresse;
    private int id;
    public Clien(String nom, String prenom, String adresse, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public int getId() {
        return id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void afficher(){
        System.out.println("nom " + nom);
        System.out.println("prenom " + prenom);
        System.out.println("adresse " + adresse);
        System.out.println("id " + id);
    }
}