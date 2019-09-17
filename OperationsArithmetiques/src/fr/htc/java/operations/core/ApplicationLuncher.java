package fr.htc.java.operations.core;

import java.util.Scanner;

import fr.htc.java.operations.utils.OperationType;

public class ApplicationLuncher {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 0;
		do {
			 choice = printMenuAndCatchUserChoice();
			 OperationSwitcher.switchTo(OperationType.valueOf(choice));
			
		} while (choice != 0);
		scanner.close();
		
	}

	/**
	 * 
	 * @return
	 */
	private static int printMenuAndCatchUserChoice() {
		System.out.println("\n\n\n\n");
		System.out.println("*****************************************************************");
		System.out.println("Bienvenue à l’application : ‘’ Opérations Mathématiques ‘’");
		System.out.println("");
		System.out.println("\t- Addition       \tTapez 1");
		System.out.println("\t- Soustraction   \tTapez 2");
		System.out.println("\t- Multiplication \tTapez 3");
		System.out.println("\t- Division       \tTapez 4");
		System.out.println("\t- Equation 2 Deg.\tTapez 5");
		System.out.println("\t- Factoriel      \tTapez 6");
		System.out.println("\t- PGCD           \tTapez 7");
		System.out.println("\t- Quitter        \tTapez 0");
		System.out.print("\t\t\tFaites votre choix : ");
		
		int choice = scanner.nextInt();
		System.out.println("*****************************************************************");
		return choice;
	}

}
