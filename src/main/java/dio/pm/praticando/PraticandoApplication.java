package main.java.dio.pm.praticando;

import main.java.dio.pm.praticando.domain.*;

import java.util.Scanner;

public class PraticandoApplication {

	static Scanner scanner = new Scanner(System.in);
	static String option = "";
	static Selling selling = new Selling();

	public static void main(String[] args) {

		Employee manager = new Manager("Robert", "robert@email", "54321");
		Employee salesMan = new SalesMan("Willian", "wil@email", "74185");
		Employee attendant = new Attendant("Ana", "ana@email", "12345");

		do {
			System.out.println("1 - Manager");
			System.out.println("2 - Attendant");
			System.out.println("3 - Sales Man");
			System.out.println("Q - Exit ");
			System.out.print("Select the user: ");
			option = scanner.nextLine();
			switch (option){
				case "1" -> defaultInterface(manager);
			 	case "2" -> defaultInterface(attendant);
			 	case "3" -> defaultInterface(salesMan);
			 	case "q" -> System.out.println("Exiting System...");
				default -> System.out.println("Invalid option");
			}
		} while (!(option.equals("q")));

	}

	private static void userInterface(Employee employee){
		do {
			System.out.println(employee.printInterface());
			System.out.print("Select a option: ");
			option = scanner.nextLine();

			switch (option){
				case "1" -> employee.printFirstOption(selling);
				case "2" -> employee.printSecondOption(selling);
				case "3" -> employee.editEmail();
				case "4" -> employee.editPassword();
				case "0" -> employee.logoff();
			}
		} while (!(option.equals("0")));
	}

	private static void defaultInterface(Employee employee){
		do {
			if(employee.getIsLogged()){
				userInterface(employee);
			}
			System.out.println("====" + employee.getClass().getSimpleName() + "====");
			System.out.println("1 - Login");
			System.out.println("0 - Exit");
			System.out.print("Select a option: ");
			option = scanner.nextLine();

			switch (option){
				case "1" -> employee.login();
				case "0" -> System.out.println("Exiting system...");
				default -> System.out.println("Undefined option");
			}
		} while (!(option.equals("0")));
	}

}
