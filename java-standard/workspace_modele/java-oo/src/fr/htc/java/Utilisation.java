package fr.htc.java;

public class Utilisation {

	public static void main(String[] args) {
		
		Personne qui ;
		qui = new Personne();
		qui.nom = "Pierre";
		qui.anneeNaissance = 1983;
		System.out.println(qui.age());
	}

}
