public class Enseignant extends Personnel {
    private Grade grade;
    private int heuresSupp;

    public Enseignant(String nom, String bureau, double salaire, Grade grade, int heuresSupp) {
        super(nom, bureau, salaire);
        this.grade = grade;
        this.heuresSupp = heuresSupp;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getHeuresSupp() {
        return heuresSupp;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire() + (heuresSupp * grade.getMontantHeureSupp());
    }

    public void afficher() {
        System.out.println("Salaire enseignant (" +getNom() + ") = " + calculerSalaire() + " dhs");
    }
}
