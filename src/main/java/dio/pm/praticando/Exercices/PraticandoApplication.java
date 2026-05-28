package dio.pm.praticando.Exercices;

import java.util.Scanner;

public class PraticandoApplication {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		var service = new PraticandoService();

		System.out.println("Calculator of the rest");
		System.out.print("Insert a number: ");
		var numberA = Integer.parseInt(scanner.nextLine());
		Integer numberB;

		do {


		System.out.print("Insert another number: ");
		numberB = Integer.parseInt(scanner.nextLine());

		} while (!(service.calculateNumber(numberA, numberB)));

		System.out.println("Result: " + numberB / numberA);

	} 

}
