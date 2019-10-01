package compare.number;

import java.util.Scanner;

public class OpMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("		Menu Opérations Mathématiques\n");
		System.out.println("	- Addition	 	Tapez 1");
		System.out.println("	- Soustraction		Tapez 2");
		System.out.println("	- Multiplication 	Tapez 3");
		System.out.println("	- Division 		Tapez 4");
		System.out.println("	- Equation 2 Deg.	Tapez 5");
		System.out.println("	- Factoriel		Tapez 6");
		System.out.println("	- Quitter 		Tapez 0\n");

		Scanner scanner = new Scanner(System.in);

		int nb1, nb2, nombreMenu, a, b, c;
		System.out.println("quelle opération voulez vous exécuter?");
		nombreMenu = scanner.nextInt();
		if (nombreMenu == 0) {
			System.out.println("vous avez choisi de quitter, au revoir");
		} else if (nombreMenu == 5) {
			System.out.println("entrer a, b et c");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			System.out.println("votre équation est:" + a + "x²+" + b + "x" + "+" + c);

		} else if (nombreMenu == 6) {
			Scanner scanner1 = new Scanner(System.in);
			int n, i, fact;
			System.out.println("entrer un nombre");
			n = scanner1.nextInt();
			fact = 1;
			i = 1;
			while (i <= n) {
				fact = fact * i;
				i++;

			}
			System.out.println("le produit factoriel =" + fact);
			scanner1.close();

		} else {
			System.out.println("entrer deux nombres");
			nb1 = scanner.nextInt();
			nb2 = scanner.nextInt();
			
			while (nombreMenu != 0) {
				switch (nombreMenu) {
				case 0:
					System.out.println("vous quitter");
					break;
				case 1:
					System.out.println("le somme est =" + (nb1 + nb2));
					break;
				case 2:
					System.out.println("la différence est =" + (nb1 - nb2));
					break;
				case 3:
					System.out.println("le produit est =" + (nb1 * nb2));
					break;
				case 4:
					if (nb2 == 0) {
						System.out.println("la division par 0 est impossible");
					} else {
						System.out.println("le quotient =" + nb1 / nb2);
					}
					break;
				default:
					System.out.println("choisissez un nombre du menu proposé!! ");
					break;
				}
			}
		}
		scanner.close();

	}

}
