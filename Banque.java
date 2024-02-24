import java.util.ArrayList;
import java.util.List;
class Banque {
    private String nom;
    private List<Compte> listCompte;

    public Banque(String nom) {
        this.nom = nom;
        this.listCompte = new ArrayList<>();
    }

    public void ajoutCompte(Compte compte) {
        listCompte.add(compte);
    }

    public List<Compte> getListCompte() {
        return listCompte;
    }

    @Override
    public String toString() {
        return "Banque [nom=" + nom + ", listCompte=" + listCompte + "]";
    }
}
