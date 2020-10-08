package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Produit;


public class ProduitService {
	
	List<Produit> produits = new ArrayList<>();
	
	public void saveProduct(Produit produit) {	
		produits.add(produit);
		
	}	
	public void removeProduct(Produit produit) {
		produits.remove(produit);
	}
	public void updateProduct(Produit produit) {		
		for(Produit p : produits) {		
			if(produit.getId() == p.getId()) {
				System.out.println("UPDATING..." );
				p.setDesignation(produit.getDesignation());
				p.setPrixUnitaire(produit.getPrixUnitaire());
				p.setQuantiteEnStock(produit.getQuantiteEnStock());
				p.setUrlImage(produit.getUrlImage());
				
			}
		}
		
	}
	public List<Produit> getAllProducts() {
        return produits;
    }
	public Produit findByIdProduct(int produitId) {
		for(Produit p : produits) {
			if(produitId == p.getId()) return p;
		}
		//System.out.println(produits.get(produitId));
		//return produits.get(produitId);
		return null;
	}	

}
