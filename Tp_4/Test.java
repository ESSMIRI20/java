public class Test{
    public static void main(String[] args) {
        Clien c1 =new Clien("OSSAMA", "ESSMIRI", "FES", 1);
        CompteCourant cc = new CompteCourant("compt01", 10000, c1, 3000);
        CompteEpargne ce = new CompteEpargne("comp02", 2000, c1, 50);
        c1.afficher();
        cc.retirer(100);
        cc.afficher();
    }
}