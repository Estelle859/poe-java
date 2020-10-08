package org.eclipse.model;

import java.util.Date;

public class Commande {
	
	private int id;
	private Date dateComande;
	private Client client;	

	public Commande(int id, Date dateComande, Client client) {
		super();
		this.id = id;
		this.dateComande = dateComande;
		this.client = client;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateComande() {
		return dateComande;
	}
	public void setDateComande(Date dateComande) {
		this.dateComande = dateComande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	public String toString() {
		return "Commande [id=" + id + ", dateComande=" + dateComande + ", client=" + client + "]";
	}
	
}
