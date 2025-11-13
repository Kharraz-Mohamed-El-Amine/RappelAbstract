public class Main {
    public static void main(String[] args) {
        GestionRH grh = new GestionRH();

        Enseignant ens = new Enseignant("Driss", "B-204", 8000.0, Grade.MCH, 10);
        Administratif adm = new Administratif("Salma", "A-101", 6000.0, 1200.0);
        Enseignant ens2 = new Enseignant("Hanae", "C-310", 9000.0, Grade.PES, 5);

        grh.Ajouter(ens);
        grh.Ajouter(adm);
        grh.Ajouter(ens2);

        grh.Afficher();

        System.out.println("_____________________________________________________");
        grh.Afficher_Enseignant();
    }
}
