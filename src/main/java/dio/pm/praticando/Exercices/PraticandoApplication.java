package dio.pm.praticando.Exercices;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandoApplication {

	public static void main(String[] args) {
		
	var scanner = new Scanner(System.in);

	System.out.print("Insert a side from the area: ");
	var sideA = Double.parseDouble(scanner.nextLine());

	System.out.print("Insert the other side from your area: ");
	var sideB = Double.parseDouble(scanner.nextLine());

	var service = new PersonService();

	service.validator(sideA, sideB);
	
	var result = service.calculateArea(sideA, sideB);

	System.out.println("The area value is: " + result + "m²");

	}

}
