public abstract class Personnel {
    private String nom;
    private String bureau;
    private double salaire;

    public Personnel(String nom, String bureau, double salaire) {
        this.nom = nom;
        this.bureau = bureau;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getBureau() {
        return bureau;
    }

    public double getSalaire() {
        return salaire;
    }

    public abstract double calculerSalaire();

    public void afficher() {

    }
}
