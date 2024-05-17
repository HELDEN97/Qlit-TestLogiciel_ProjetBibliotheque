package Model;

public class Livre {
	
	private int id;
    private String titre;
    private String auteur;
    private String isbn;
    private String statut;
    
    // Constructeur
    public Livre(int id, String titre, String auteur, String isbn, String statut) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.statut = statut;
    }
    
    public void emprunter() {
        if (statut.equals("disponible")) {
            statut = "emprunté";
            // Autres actions, par exemple enregistrer la date d'emprunt dans la base de données
        } else {
            throw new IllegalStateException("Le livre n'est pas disponible pour l'emprunt.");
        }
    }
    public void retourner(String etat) {
        if (statut.equals("emprunté")) {
            statut = "disponible";
            // Autres actions, par exemple enregistrer la date de retour et l'état du livre dans la base de données
        } else {
            throw new IllegalStateException("Le livre n'a pas été emprunté.");
        }
    }
    public void reserver() {
        if (statut.equals("disponible")) {
            statut = "réservé";
            // Autres actions, par exemple enregistrer la réservation dans la base de données
        } else {
            throw new IllegalStateException("Le livre n'est pas disponible pour la réservation.");
        }
    }

    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
    
   

}
