package dio.pm.praticando.exercices;

import java.util.Scanner;

import dio.pm.praticando.exercices.service.AccountService;

public class PraticandoApplication {

	private static AccountService service = new AccountService();
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		var opcao = "";

		do {
			System.out.println("");
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Depositar Dinheiro");
			System.out.println("3 - Sacar Dinheiro");
			System.out.println("4 - Pagar um Boleto");
			System.out.println("5 - Abrir uma Conta");
			System.out.print("Insira a opção desejada: ");
			opcao = scanner.nextLine();
			
			switch(opcao){
				case "1" -> service.consultaSaldo(scanner);
				case "2" -> service.deposito(scanner);
				case "3" -> service.saque(scanner);
				case "4" -> service.pagaBoleto(scanner);
				case "5" -> service.abrirConta(scanner);
				case "q" -> System.out.println("Saindo do Sistema...");
				default -> System.out.println("Opção Incorreta");
			}

		} while (!(opcao.equals("q")));
		
		
	}

}
