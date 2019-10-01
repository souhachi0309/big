package fr.htc.java.oo;

import java.util.Random;

public class Personne {
	public static int nbPerson = 100;
	
	public int id;
	public String nom;
	public int anneNaissance;
	
	/**
	 * @param nom
	 * @param anneNaissance
	 */
	public Personne(String nom, int anneNaissance) {
		this.id = nbPerson++;
		this.nom = nom;
		this.anneNaissance = anneNaissance;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", anneNaissance=" + anneNaissance + "]";
	}
	
	public static int getNBPersone() {
		return nbPerson;
	}

	

}
