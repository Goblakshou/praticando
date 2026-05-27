package dio.pm.praticando.A2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import dio.pm.praticando.A2.Person;

@SpringBootApplication
public class PraticandoApplication {

	public static void main(String[] args) {
		
		var person = new Person("Jonas");

		System.out.println(person);

	}

}
