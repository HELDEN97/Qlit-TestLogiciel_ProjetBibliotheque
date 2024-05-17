package Model;

public class Gestionnaire {
	
		
		private int id;
	    private String email;
	    private String motDePasse;
	    
	    public void creerCompte() {
	        // Valider les informations de l'utilisateur
	        if (email != null && !email.isEmpty() && motDePasse != null && !motDePasse.isEmpty()) {
	            // Logique pour créer un nouveau compte utilisateur
	            // Par exemple, enregistrer les informations dans la base de données
	        } else {
	            throw new IllegalArgumentException("Les informations de l'utilisateur sont incomplètes.");
	        }
	    }
	    public void modifierCompte() {
	        // Valider les informations de l'utilisateur
	        if (id > 0 && email != null && !email.isEmpty() && motDePasse != null && !motDePasse.isEmpty()) {
	            // Logique pour modifier les informations du compte utilisateur
	            // Par exemple, mettre à jour les informations dans la base de données
	        } else {
	            throw new IllegalArgumentException("Les informations de l'utilisateur sont invalides.");
	        }
	    }
	    public void réserverLivre(Livre livre) {
	        // Vérifier si le livre est disponible pour la réservation
	        if (livre.getStatut().equals("disponible")) {
	            // Logique pour réserver le livre
	            livre.reserver();
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMotDePasse() {
			return motDePasse;
		}
		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}


}
