package fr.htc.java.operations.utils;

public enum OperationType {
	QUITTER(0, "Quitter"), ADDITION(1, "Addition"), SOUSTRACTION(2, "Soustraction"), PRODUIT(3, "Multiplcation"),
	QOTIENT(4, "Division"), EQUATION_SECOND_DEGRE(5, "Equation de second degre"), FACTORIEL(6, "Factoriel"),
	 PGCD(7, "Plus grand commun diviseur"),UNKNOWN(99, "Unknown");

	private int id;
	private String title;

	private OperationType(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int IdOf() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public static OperationType valueOf(int id) {
		if (id < 0 || id > 7) {
			return OperationType.values()[8];
		}
		return OperationType.values()[id];
	}

}
