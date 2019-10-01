package compare.number;

import java.util.Scanner;

public class CaseClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();

		String evaluation;

		switch (nb) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			evaluation = "nul";
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			evaluation = "mauvais";
			break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			evaluation = "bien";
			break;
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			evaluation = "très bien";
			break;
		default:
			evaluation = "génie";
			break;
		}
		System.out.println(evaluation);
		scanner.close();

	}

}
