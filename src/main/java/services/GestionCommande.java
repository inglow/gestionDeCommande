
package services;

import java.util.ArrayList;

import domain.Commande;
import domain.Produit;

public class GestionCommande {
	
	public void creerCommande(int typeProduit, int nombreProduits){
		
		ArrayList<Produit> produits = new ArrayList<Produit>();
		
		Commande commande = new Commande();
		
		for(int i=0; i<nombreProduits; i++){
			Produit produit = new Produit(typeProduit); 
			produits.add(produit);
			commande.setProduits(produits);
			produit.setCommande(commande);
		}
	}

}