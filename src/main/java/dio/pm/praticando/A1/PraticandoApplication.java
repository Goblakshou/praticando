package dio.pm.praticando.A1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandoApplication {

	public static void main(String[] args) {
		
		PraticandoService service = new PraticandoService();
		
		Person male = service.consultPerson("João", 2006);
		Person female = service.consultPerson("Maria", 2007);

		System.out.println("Name: " + male.getName() + " and Age: " + male.getAge());
		System.out.println("Name: " + female.getName() + " and Age: " + female.getAge());

	}

}
