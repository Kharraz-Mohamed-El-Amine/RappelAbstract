public class Administratif extends Personnel {
    private double primeDeplacement;

    public Administratif(String nom, String bureau, double salaire, double primeDeplacement) {
        super(nom, bureau, salaire);
        this.primeDeplacement = primeDeplacement;
    }

    public double getPrimeDeplacement() {
        return primeDeplacement;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire() + primeDeplacement;
    }

    public void afficher() {
        System.out.println("Salaire administratif (" + getNom() + ") = " + calculerSalaire() + " dhs");
    }
}
