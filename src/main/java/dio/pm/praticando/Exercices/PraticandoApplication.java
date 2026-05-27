package dio.pm.praticando.Exercices;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandoApplication {

	public static void main(String[] args) {
		
	var scanner = new Scanner(System.in);

	System.out.print("Insert your name: ");
	var name = scanner.nextLine();

	System.out.print("Insert your birth age: ");
	var birth = Integer.parseInt(scanner.nextLine());

	var service = new PersonService();

	service.validator(name, birth);

	var age = service.calculateAge(birth);

	System.out.println("Hello " + name + "! You have " + age + " years.");

	}

}
