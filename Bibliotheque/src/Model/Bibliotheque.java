package Model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public List<Livre> getAllLivres() {
        return new ArrayList<>(livres);
    }

    public Livre getLivreById(int id) {
        for (Livre livre : livres) {
            if (livre.getId() == id) {
                return livre;
            }
        }
        throw new IllegalArgumentException("Aucun livre avec cet ID trouvé.");
    }
    
    public void supprimerLivre(int id) {
        livres.removeIf(livre -> livre.getId() == id);
    }

    public void modifierLivre(Livre livreModifie) {
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getId() == livreModifie.getId()) {
                livres.set(i, livreModifie);
                return;
            }
        }
        throw new IllegalArgumentException("Aucun livre avec cet ID trouvé.");
    }
}