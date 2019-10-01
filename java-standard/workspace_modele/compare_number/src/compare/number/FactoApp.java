package compare.number;

import java.util.Scanner;

public class FactoApp {
	public static void main(String[] args) {
		// facorielle

		Scanner scanner = new Scanner(System.in);
		int n, i, fact;
		System.out.println("entrer un nombre");
		n = scanner.nextInt();
		fact = 1;
		i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;

		}
		System.out.println("le produit factoriel =" +fact);
		scanner.close();
	}
}
