package main.java.dio.pm.praticando.aula3;

import main.java.dio.pm.praticando.aula3.interfaces.TaxCalculator;
import main.java.dio.pm.praticando.aula3.models.Cloth;
import main.java.dio.pm.praticando.aula3.models.Culture;
import main.java.dio.pm.praticando.aula3.models.Food;
import main.java.dio.pm.praticando.aula3.models.Health;

import java.util.Scanner;

public class PraticandoApplication {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("INSERT THE VALUES");
		System.out.print("QUANTITY:");
		Integer quantity = Integer.parseInt(scanner.nextLine());
		System.out.print("PRICE:");
		Double price = Double.parseDouble(scanner.nextLine());
		String option;

		do{
			System.out.println("1 - Food");
			System.out.println("2 - Health");
			System.out.println("3 - Cloth");
			System.out.println("4 - Culture");
			System.out.println("Q - Exit");
			System.out.print("INSERT THE PRODUCT TYPE:");
			option = scanner.nextLine();

			TaxCalculator taxCalculator = switch (option){
				case "1" -> new Food();
				case "2" -> new Health();
				case "3" -> new Cloth();
				case "4" -> new Culture();
				case "q" -> null;
				default -> {
					System.out.println("Invalid option.");
					yield null;
				}
			};
			if(taxCalculator != null) {
				System.out.println(taxCalculator.calculateTax(price, quantity));
			}

		} while (!(option.equals("q")));


	}

}
