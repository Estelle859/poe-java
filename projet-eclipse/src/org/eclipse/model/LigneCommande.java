package org.eclipse.model;

public class LigneCommande {
	
	private int id;
	private int quantiteCommande;
	private Produit produit;
	private Commande commande;
	
	public LigneCommande(int id, int quantiteCommande, Produit produit, Commande commande) {
		super();
		this.id = id;
		this.quantiteCommande = quantiteCommande;
		this.produit = produit;
		this.commande = commande;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantiteCommande() {
		return quantiteCommande;
	}
	public void setQuantiteCommande(int quantiteCommande) {
		this.quantiteCommande = quantiteCommande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", quantiteCommande=" + quantiteCommande + ", produit=" + produit
				+ ", commande=" + commande + "]";
	}
		

}
