package fr.htc.java.oo;

public class Utilisation2 {
	
	public static void main(String[] args) {
		Personne p1  = new Personne("Masten_100", 1983);
		Personne p2  = new Personne("Masten_101", 1988);
		Personne p3  = new Personne("Masten_102", 1993);
		Personne p4  = new Personne("Masten_103", 1998);
		Personne p5  = new Personne("Masten_104", 2003);
		Personne p6  = new Personne("Masten_105", 2008);
		Personne p7  = new Personne("Masten_106", 2013);
		Personne p8  = new Personne("Masten_107", 2018);
		Personne p9  = new Personne("Masten_108", 2023);
		
		System.out.println(Personne.nbPerson);
		System.out.println(p1 + " " + p1.nbPerson); // 100
		System.out.println(p2 + " " + p2.nbPerson);//100
		System.out.println(p3 + " " + p3.nbPerson);
		System.out.println(p4 + " " + p4.nbPerson);//100
		System.out.println(Personne.nbPerson);
		p4.nbPerson = 999;
		System.out.println(p5 + " " + p5.nbPerson);//
		System.out.println(p6 + " " + p6.nbPerson);//
		System.out.println(p7 + " " + p7.nbPerson);
		System.out.println(p8 + " " + p8.nbPerson);
		System.out.println(p9 + " " + p9.nbPerson);
		System.out.println(Personne.nbPerson);
	
	}

}
