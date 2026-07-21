package main.java.dio.pm.praticando.aula3;

import main.java.dio.pm.praticando.aula3.interfaces.GeometricCalculator;
import main.java.dio.pm.praticando.aula3.models.Square;
import main.java.dio.pm.praticando.aula3.models.Circle;
import main.java.dio.pm.praticando.aula3.models.Triangle;

import java.util.Scanner;

public class PraticandoApplication {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String option;

		do{
			System.out.println("1 - CALCULATE SQUARE'S AREA");
			System.out.println("2 - CALCULATE TRIANGLE'S AREA");
			System.out.println("3 - CALCULATE CIRCLE'S AREA");
			System.out.print("INSERT THE CALCULE:");
			option = scanner.nextLine();

			GeometricCalculator geometricCalculator = switch (option){
				case "1" -> new Square();
				case "2" -> new Triangle();
				case "3" -> new Circle();
				case "q" -> null;
				default -> {
					System.out.println("INVALID OPTION.");
					yield null;
				}
			};

			if(geometricCalculator != null) {
				geometricCalculator.AreaCalculator(scanner);
			}

		} while (!(option.equals("q")));


	}

}
