package org.eclipse.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.model.Adresse;
import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;
import org.eclipse.model.Vendeur;
import org.eclipse.model.Client;
import org.eclipse.service.ProduitService;
import org.eclipse.service.UtilisateurService;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Tapez 1.si vous êtes Vendeur 2.si vous êtes Client 3.Quit");
		ProduitService ps = new ProduitService();
		Produit p1 = new Produit(1, "Acer Aspire 5 Slim Laptop" , 359, 5, "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg");
		Produit p2 = new Produit(2, "Toshiba TF-55A810U21 55-inch ",260,8,"https://images-na.ssl-images-amazon.com/images/I/61xU%2BHbHJyL._AC_SL1000_.jpg");
		Produit p3 = new Produit(3,"Canon PowerShot SX530 Digital Camera ",200,4,"https://images-na.ssl-images-amazon.com/images/I/61xeTmAQDNL._AC_SL1500_.jpg");								
		Produit p4 = new Produit(4,"Samsung Galaxy S20 FE 5G",599,6,"https://images-na.ssl-images-amazon.com/images/I/712PXMEDp4L._AC_SL1500_.jpg");	
		ps.saveProduct(p1);
		ps.saveProduct(p2);
		ps.saveProduct(p3);
		ps.saveProduct(p4);	
		
		try (Scanner sc = new Scanner(System.in)) {
			int userChoice1 = sc.nextInt();
			switch (userChoice1) {
				case 1:
					System.out.println("Menu Vendeur");
					System.out.println("Tapez 1.addProduit 2.deleteProduit 3.updateProduit 4.getAllProduits 5.getProduitById 6.Quit");					
					int userChoice2 = sc.nextInt();
					switch (userChoice2) {
					case 1:
						{
							System.out.println("Ajouter un produit");						
							Produit p = new Produit();
							Scanner sc1 = new Scanner(System.in);
							System.out.print("Enter product id");
							int id = sc1.nextInt();
							
							System.out.print("Enter product designation");
							Scanner sc2 = new Scanner(System.in);
							String designation = sc2.nextLine();
					
							
							System.out.print("Enter product price");
							Scanner sc3 = new Scanner(System.in);							
							float prixUnitaire = sc3.nextFloat();
							
							System.out.print("Enter product quantity en stock");
							Scanner sc4 = new Scanner(System.in);							
							int quantiteEnStock = sc.nextInt();
							
							System.out.print("Enter product url image");
							Scanner sc5 = new Scanner(System.in);
							String urlImage = sc5.next();
							
							p.setId(id);
							p.setDesignation(designation);							
							p.setPrixUnitaire(prixUnitaire);						
							p.setQuantiteEnStock(quantiteEnStock);							
							p.setUrlImage(urlImage);								
							ps.saveProduct(p);						
							System.out.println("sauvgarder dans le liste produits...");
							for(Produit produit : ps.getAllProducts()) {		
								System.out.println(produit);			
							}
							break;
						}
					case 2:
						{
							System.out.println("supprimer un produit");	
							System.out.println("im removing a product");							
							ps.removeProduct(p4);		
							for(Produit produit : ps.getAllProducts()) {			
								System.out.println(produit);
										
							}
							break;
						}
					case 3:
						{
							System.out.println("modifier un produit");	
							System.out.println("im updating product");
							Produit p5 = new Produit(4, "Samsung Galaxy S20 FE 5G",620,5,"https://images-na.ssl-images-amazon.com/images/I/712PXMEDp4L._AC_SL1500_.jpg");	
							ps.updateProduct(p5);		
							System.out.println(ps.findByIdProduct(4));	
							break;
						}
					case 4:
						{
							System.out.println("consulter les produits");	
							for(Produit produit : ps.getAllProducts()) {		
								System.out.println(produit);			
							}		
							break;
						}
					case 5:
						{
							System.out.println("chercher un produit ");	
							System.out.println("finding a product by id");		
							System.out.println(ps.findByIdProduct(3));	
							break;
						}

					default:
						break;
					}
					break;
				case 2:
					System.out.println("Menu Client");
					System.out.println("Tapez 1.ConsultProduits 2.CommandeProduit 3.ConsultPanier");		
					break;

				default:
					break;
			}
		}	
		
		//tester les methodes de service utilisateur 
		UtilisateurService userService = new UtilisateurService();
		
		Adresse ad1 = new Adresse(1, "ruea", "10000", "ville1");
		Adresse ad2 = new Adresse(2, "rueb", "10001", "ville2");
		List<Adresse> adresses1 = new ArrayList<>();
		List<Adresse> adresses2 = new ArrayList<>();
		adresses1.add(ad1);
		adresses1.add(ad2);		
		Adresse ad3 = new Adresse(3, "ruec", "10002", "ville3");
		Adresse ad4 = new Adresse(4, "rued", "10003", "ville4");
		adresses2.add(ad3);
		adresses2.add(ad4);		
		Utilisateur user1 = new Utilisateur(1,"nom1", "prenom1", "userNom1", "mdp1", adresses1);
		Utilisateur user2 = new Utilisateur(2,"nom2", "prenom2", "userNom2", "mdp2", adresses2);	
		Client cli1 = new Client(3, "clinom1", "cliprenom1", "cliuserNom1", "climotDePasse1", adresses1);
		Client cli2 = new Client(4, "clinom2", "cliprenom2", "cliuserNom2", "climotDePasse2", adresses2);
		Vendeur v1 = new Vendeur(5, "vendnom1", "vendprenom1", "venduserNom1", "vendmotDePasse1", adresses1,ps.getAllProducts());
		Vendeur v2 = new Vendeur(6, "vennom2", "vendprenom2", "venduserNom2", "vendmotDePasse2", adresses2,ps.getAllProducts());
		userService.saveUser(user1);
		userService.saveUser(user2);
		userService.saveUser(cli1);
		userService.saveUser(cli2);
		userService.saveUser(v1);
		userService.saveUser(v2);
		System.out.println("consulter les user list");	
		for(Utilisateur user : userService.getAllUsers()) {		
			System.out.println(user);			
		}	
		System.out.println("deleting an user");
		userService.removeUser(cli1);
		System.out.println("adding deleted client");
		userService.saveUser(cli1);
		System.out.println("updating the user");
		Utilisateur newUser = new Utilisateur(1, "newnom", "newprenom", "newuserNom", "newmotDePasse", adresses1);
		userService.updateUser(newUser );
		System.out.println("finding a user by id");	
		System.out.println(userService.findByIdUser(1));	
			
			
		
	}

}
