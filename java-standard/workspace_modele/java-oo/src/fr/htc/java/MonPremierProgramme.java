package fr.htc.java;

public class MonPremierProgramme {

	public static void main(String[] args) {
		Circle c; // C est une r�f�rence sur un objet de type Circle, par encore un objet
		c = new Circle(5.0); // c référence maintenant un objet alloué en mémoire
		c.x = c.y = 10.0; // ces valeurs sont stocké dans le corps de l'objet
		System.out.println("Aire du circle est : " + c.area());

	}

}
