package compare.number;

import java.util.Scanner;

public class ComNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre");
		int n, m;
		n = sc.nextInt();
		
		System.out.println("Entrer un deuxième nombre");
		m = sc.nextInt();
		
		if (n > m) {
			System.out.println("Le nombre " + n + "est à superieur à " + m);
		} else if (n == m) {
			System.out.println("le nombre " + n + " est eagl à " + m);
		} else {
			System.out.println("le nombre " + n + " est inferieur à " + m);
		}
		sc.close();
	}

}
