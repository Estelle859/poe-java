package org.eclipse.model;

import java.util.ArrayList;
import java.util.List;

public class Vendeur extends Utilisateur{
	
	private List<Produit> produits = new ArrayList<>();
	
	public Vendeur(int id, String nom, String prenom, String userNom, String motDePasse, List<Adresse> adresses,
			List<Produit> produits) {
		super(id, nom, prenom, userNom, motDePasse, adresses);
		this.produits = produits;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Vendeur [produits=" + produits + ", getId()=" + getId() + ", getUserNom()=" + getUserNom()
				+ ", getMotDePasse()=" + getMotDePasse() + ", getAdresses()=" + getAdresses() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
}
