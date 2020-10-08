package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Utilisateur;

public class UtilisateurService {
	
	List<Utilisateur> users = new ArrayList<>();
	
	public void saveUser(Utilisateur user) {			
		users.add(user);
		
	}	
	public void removeUser(Utilisateur user) {
		users.remove(user);
	}
	public void updateUser(Utilisateur user) {		
		for(Utilisateur us : users) {		
			if(user.getId() == us.getId()) {
				System.out.println("UPDATING..." );
				us.setNom(user.getNom());	
				us.setPrenom(user.getPrenom());
				us.setUserNom(user.getUserNom());
				us.setMotDePasse(us.getMotDePasse());
				us.setAdresses(us.getAdresses());
			}
		}		
	}
	public List<Utilisateur> getAllUsers() {
        return users;
    }
	public Utilisateur findByIdUser(int userId) {
		for(Utilisateur us : users) {
			if(userId == us.getId()) return us;
		}		
		return null;
	}	
	public Utilisateur findByUserName(String userName) {
		for(Utilisateur us : users) {
			if(userName == us.getUserNom()) return us;
		}		
		return null;
	}	
	public Utilisateur findByPassword(String password) {
		for(Utilisateur us : users) {
			if(password == us.getMotDePasse()) return us;
		}		
		return null;
	}	

}
