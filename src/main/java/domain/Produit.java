
package domain;

public class Produit {
	
	Commande commande;
	int typeProduit;

	public Produit(int typeProduit) {
		super();
		this.typeProduit = typeProduit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(int typeProduit) {
		this.typeProduit = typeProduit;
	}
	
	

}