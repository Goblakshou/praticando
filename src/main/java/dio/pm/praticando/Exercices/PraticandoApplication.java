package dio.pm.praticando.Exercices;

import java.util.Scanner;

public class PraticandoApplication {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);

		System.out.print("Inser a number to calculate: ");
		var number = Integer.parseInt(scanner.nextLine());

		var calculator = new CalculateTable();

		calculator.calculateTable(number);

		scanner.close();
	}

}
