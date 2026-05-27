package dio.pm.praticando.Exercices;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandoApplication {

	public static void main(String[] args) {
		
	var scanner = new Scanner(System.in);

	System.out.print("Insert the base from the triangle: ");
	var base = Double.parseDouble(scanner.nextLine());

	System.out.print("Insert the height from the triangle: ");
	var height = Double.parseDouble(scanner.nextLine());

	var service = new PersonService();

	service.validator(base, height);
	
	var result = service.calculateArea(base, height);

	System.out.println("The triangle's area value is: " + result + "m²");

	}

}
