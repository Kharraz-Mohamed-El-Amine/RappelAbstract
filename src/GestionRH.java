import java.util.ArrayList;
import java.util.List;

public class GestionRH {
    private final List<Personnel> List_Pers;

    public GestionRH() {
        this.List_Pers = new ArrayList<>();
    }

    public void Ajouter(Personnel p) {
        if (p != null) {
            List_Pers.add(p);
        }
    }

    public void Afficher() {
        if (List_Pers.isEmpty()) {
            System.out.println("khawya");
            return;
        }
        for (Personnel p : List_Pers) {
            p.afficher();
        }
    }

    public void Afficher_Enseignant() {
        boolean found = false;
        System.out.println("tous les enseignants :");
        for (Personnel p : List_Pers) {
            if (p instanceof Enseignant) {
                p.afficher();
                found = true;
            }
        }
        if (!found) {
            System.out.println("makaynxi");
        }
    }
}
