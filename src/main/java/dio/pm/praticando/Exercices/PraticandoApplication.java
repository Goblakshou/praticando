package dio.pm.praticando.Exercices;

import java.util.Scanner;

public class PraticandoApplication {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		var service = new PraticandoService();
		var option = ""; 

		System.out.print("Insert a number: ");
		var minNum = Integer.parseInt(scanner.nextLine());

		System.out.print("Insert another larger number: ");
		var maxNum = Integer.parseInt(scanner.nextLine());

		do {

			System.out.println("1 - Odd");
			System.out.println("2 - Even");
			System.out.print("Chose a option:");

			option = scanner.nextLine();
			
		} while (!((option.equals("1")) || (option.equals("2"))));

		System.out.println(option);
		service.calculateNumber(minNum, maxNum, option);

	}

}
