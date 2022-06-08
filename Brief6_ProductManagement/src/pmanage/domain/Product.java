package pmanage.domain;

import java.util.Locale.Category;

public class Product {
	private int idProduit;
	private String nom;
	private Category categorie;
	private double prix;
	private int stock;
	
	/*
	 * Constructeur par defaut
	 */
	public Product() {
		this.idProduit = -1;
		this.nom = "";
		this.categorie = Category.DISPLAY;
		
		this.prix = 0.0;
		this.stock = 0;
		
	}
	
	/*
	 * Constructeur de confort
	 * @param nom
	 * @param categorie
	 * @param prix
	 * @param stock
	 */
	public Product(String nom, Category categorie, double prix, int stock) {
		this.idProduit = -1;
		this.nom = nom;
		this.categorie = categorie;
		this.prix = prix;
		this.stock = stock;
	}
	
	/*
	 * Contructeur de recopie
	 * @param produit l'objet a copier
	 */
	public Product(Product produit) {
		this.idProduit = produit.idProduit;
		this.nom = produit.nom;
		this.categorie = produit.categorie;
		this.prix = produit.prix;
		this.stock = produit.stock;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Category getCategorie() {
		return categorie;
	}

	public void setCategorie(Category categorie) {
		this.categorie = categorie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [idProduit=" + idProduit + ", nom=" + nom + ", categorie=" + categorie + ", prix=" + prix
				+ ", stock=" + stock + "]";
	}
	
	
	
	
}
