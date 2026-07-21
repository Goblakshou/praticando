package main.java.dio.pm.praticando.aula3;

import main.java.dio.pm.praticando.aula3.interfaces.Message;
import main.java.dio.pm.praticando.aula3.models.Email;
import main.java.dio.pm.praticando.aula3.models.RedesSociais;
import main.java.dio.pm.praticando.aula3.models.SMS;
import main.java.dio.pm.praticando.aula3.models.WhatsApp;

import java.util.Scanner;

public class PraticandoApplication {

	static Scanner scanner = new Scanner(System.in);

	static void main(String[] args) {

		System.out.print("INSERT YOUR MESSAGE:");
		String message = scanner.nextLine();
		String option;

		do{
			System.out.println("1 - SMS");
			System.out.println("2 - WhatsApp");
			System.out.println("3 - Social Media");
			System.out.println("4 - E-mail");
			System.out.println("Q - Exit");
			System.out.print("INSERT YOUR OPTION:");
			option = scanner.nextLine();

			Message service = switch (option) {
				case "1" -> new SMS();
				case "2" -> new WhatsApp();
				case "3" -> new RedesSociais();
				case "4" -> new Email();
				case "q" -> null;
				default -> {
					System.out.println("Invalid option.");
					yield null;
				}
			};

			if(service != null){
				service.printMessage(message);
			}
		} while (!(option.equals("q")));


	}

}
