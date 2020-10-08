package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Commande;


public class CommandeService {
	
List<Commande> commandes = new ArrayList<>();
	
	public void saveCommande(Commande commande) {	
		commandes.add(commande);
		
	}	
	public void removeCommande(Commande produit) {
		commandes.remove(produit);
	}
	public void updateCommande(Commande commande) {		
		for(Commande c : commandes) {		
			if(c.getId() == commande.getId()) {
				System.out.println("UPDATING..." );	
				c.setClient(commande.getClient());				
			}
		}
		
	}
	public List<Commande> getAllCommandes() {
        return commandes;
    }
	public Commande findByIdCommande(int commandeId) {
		for(Commande c : commandes) {
			if(commandeId == c.getId()) return c;
		}
		return null;
	}	


}
