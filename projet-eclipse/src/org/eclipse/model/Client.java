package org.eclipse.model;

import java.util.List;

public class Client extends Utilisateur{

	public Client(int id, String nom, String prenom, String userNom, String motDePasse, List<Adresse> adresses) {
		super(id, nom, prenom, userNom, motDePasse, adresses);
		
	}

	@Override
	public String toString() {
		return "Client [getId()=" + getId() + ", getUserNom()=" + getUserNom() + ", getMotDePasse()=" + getMotDePasse()
				+ ", getAdresses()=" + getAdresses() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}



}
