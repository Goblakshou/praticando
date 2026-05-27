package dio.pm.praticando.Exercices;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandoApplication {

	public static void main(String[] args) {
		
		var service = new PersonService();	

		var scanner = new Scanner(System.in);

		System.out.print("Insert the first people NAME: ");
		var nameA = scanner.nextLine();
		System.out.print("Insert the first people AGE: ");
		var ageA = Integer.parseInt(scanner.nextLine());

		System.out.print("Insert the second people NAME: ");
		var nameB = scanner.nextLine();
		System.out.print("Insert the second people AGE: ");
		var ageB = Integer.parseInt(scanner.nextLine());

		var personA = new Person();
		personA.setName(nameA);
		personA.setAge(ageA);

		var personB = new Person();
		personB.setName(nameB);
		personB.setAge(ageB);

		var difference = service.treatData(personA, personB);

		System.out.println("Person A - Name: " + personA.getName() + " Age: " + personA.getAge());
		System.out.println("Person B - Name: " + personB.getName() + " Age: " + personB.getAge());
		System.out.println("======================================");
		System.out.println("The difference between the ages is: " + difference + " year(s).");

		scanner.close();

	}

}
