package fr.htc.java;

public class Personne {
	private static int nbPerson=100;

	public int id;
	public String nom;
	public int anneeNaissance;

	public int age() {
		return 2019 - anneeNaissance;
	}

	public Personne(String nom, int anneeNaissance) {
		super();
		this.id=nbPerson++;
		this.nom = nom;
		this.anneeNaissance = anneeNaissance;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", anneeNaissance=" + anneeNaissance + "]";
	}

}
