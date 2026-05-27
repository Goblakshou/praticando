package dio.pm.praticando.Exercices;

import java.util.Scanner;

public class PraticandoApplication {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		var person = new Person();
		var calculate = new CalculateIMC();

		System.out.print("Insert the height: ");
		var height = Double.parseDouble(scanner.nextLine());

		System.out.print("Insert the weight: ");
		var weight = Double.parseDouble(scanner.nextLine());

		person.setHeight(height);
		person.setWeight(weight);

		calculate.calculateIMC(height, weight);

	}

}
