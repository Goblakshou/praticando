package dio.pm.praticando.exercices;

import java.util.Scanner;

import dio.pm.praticando.exercices.service.AccountService;

public class PraticandoApplication {

	private static AccountService service = new AccountService();
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		var opcao = "";

		do {
			System.out.println("BANK SYSTEM");
			System.out.println("1 - Consult Balance");
			System.out.println("2 - Deposit Money");
			System.out.println("3 - Withdraw Money");
			System.out.println("4 - Pay Bill");
			System.out.println("5 - Open Account");
			System.out.print("Enter the desired option: ");
			opcao = scanner.nextLine();
			
			switch(opcao){
				case "1" -> service.consultBalance(scanner);
				case "2" -> service.deposit(scanner);
				case "3" -> service.withdrawal(scanner);
				case "4" -> service.payBill(scanner);
				case "5" -> service.openAccount(scanner);
				case "q" -> System.out.println("Exiting the system...");
				default -> System.out.println("Invalid option");
			}

		} while (!(opcao.equals("q")));
		
		
	}

}
