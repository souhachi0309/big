package fr.htc.java.operations.core;

import fr.htc.java.operations.types.Addition;
import fr.htc.java.operations.types.Division;
import fr.htc.java.operations.types.EquationSecondDegree;
import fr.htc.java.operations.types.Factoriel;
import fr.htc.java.operations.types.ValeurMax;
import fr.htc.java.operations.types.Moyenne_EcartType;
import fr.htc.java.operations.types.Multiplication;
import fr.htc.java.operations.types.Operation;
import fr.htc.java.operations.types.PGCD;
import fr.htc.java.operations.types.Soustraction;
import fr.htc.java.operations.utils.OperationType;

public class OperationSwitcher {

	public static void switchTo(OperationType opType) {
		Operation op = null;
		switch (opType) {
		case ADDITION:
			op = new Addition();
			break;
		case SOUSTRACTION:
			op = new Soustraction();
			break;
		case PRODUIT:
			op = new Multiplication();
			break;
		case QOTIENT:
			op = new Division();
			break;
		case EQUATION_SECOND_DEGRE:
			op = new EquationSecondDegree();
			break;
		case FACTORIEL:
			op = new Factoriel();
			break;
		case PGCD:
			op = new PGCD();
			break;
		case MAX_TABLEAU:
			op = new ValeurMax();
			break;
		case MOYENNE_ECART_TYPE:
			op = new Moyenne_EcartType();
			break;
		case QUITTER:
			break;
		default:
			System.out.println("Valeur incorrect");
			return;
		}

		op.process(opType.getTitle());
	}

}
