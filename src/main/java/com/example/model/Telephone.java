package com.example.model;

public class Telephone {
    private int id;
    private String marque;
    private String modele;
    private double prix;
    private String description;
    private String urlImage;

    // Constructors, getters, and setters
    public Telephone() {}

    public Telephone(int id, String marque, String modele, double prix, String description, String urlImage) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.description = description;
        this.urlImage = urlImage;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
}
