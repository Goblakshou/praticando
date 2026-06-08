package dio.pm.praticando.exercices.service;

import java.util.Scanner;

import dio.pm.praticando.exercices.models.Account;
import dio.pm.praticando.exercices.repository.AccountRepository;

public class AccountService {


    AccountRepository repository = new AccountRepository();
    
    public void consultaSaldo(Scanner scanner){
        var id = questionarId(scanner);

        if(!(repository.buscarConta(id) != null)){
            System.out.println("Conta não encontrada!");
            return;
        }

        var saldo = repository.buscarConta(id).getSaldo();
        var chequeEspecial = repository.buscarConta(id).getChequeEspecial();
        var nome = repository.buscarConta(id).getNome();

        System.out.println("Nome: " + nome + "\nSaldo: R$" + saldo + "\nCheque Especial: R$" + chequeEspecial);
    }

    public void deposito(Scanner scanner){
        var id = questionarId(scanner);

        if(!(repository.buscarConta(id) != null)){
            System.out.println("Conta não encontrada!");
            return;
        }        

        var conta = repository.buscarConta(id);

        System.out.print("Valor do Depósito: ");
        var depositoString = scanner.nextLine();

        if(!(depositoString != null || depositoString.matches("-?\\d+(\\.\\d+)?"))){
            System.out.println("O valor do boleto deve ser um Double.");
            return;
        }            

        var deposito = Double.parseDouble(depositoString);

        if(deposito <= 0){
            System.out.println("O valor do depósito deve ser maior que 0.");
            return;
        }

        conta.setSaldo(conta.getSaldo() + deposito);

        System.out.println("Depósito Realizado!\n+ R$" + deposito);

    }
    
    public void saque(Scanner scanner){
        var id = questionarId(scanner);

        if(!(repository.buscarConta(id) != null)){
            System.out.println("Conta não encontrada!");
            return;
        }        

        var conta = repository.buscarConta(id);

        System.out.print("Valor do Saque: ");
        var saqueString = scanner.nextLine();

        if(!(saqueString != null || saqueString.matches("-?\\d+(\\.\\d+)?"))){
            System.out.println("O valor do saque deve ser um Double.");
            return;
        }

        var saque = Double.parseDouble(saqueString);

        if(saque <= 0){
            System.out.println("O valor do saque deve ser maior que 0.");
            return;
        }

        if(saque > conta.getSaldo()){
            if(conta.getSaldo() + conta.getChequeEspecial() > saque){
                var opcao = "";

                System.out.println("Saldo insuficiente!");
                System.out.println("Saldo: R$" + conta.getSaldo() + "\nCheque Especial: R$" + conta.getChequeEspecial());
                do {

                    System.out.print("Deseja utilizar o Cheque Especial (O valor de 20% será cobrado)?\n(S/N): ");
                    opcao = scanner.nextLine();
                    
                } while (!(opcao.equals("s")||opcao.equals("n")));

                if(opcao.equals("s")){
                    var resto = conta.getSaldo() - saque;
                    utilizarChequeEspecial(resto, conta);
                    conta.setSaldo(0.0);
                }
            }
            return;
        }

        conta.setSaldo(conta.getSaldo() - saque);

        System.out.println("Saque Realizado!\n- R$" + saque);
        
    }
    
    public void pagaBoleto(Scanner scanner){
        var id = questionarId(scanner);

        if(!(repository.buscarConta(id) != null)){
            System.out.println("Conta não encontrada!");
            return;
        }

        var conta = repository.buscarConta(id);

        System.out.print("Valor do Boleto: ");
        var boletoString = scanner.nextLine();

        if(!(boletoString != null || boletoString.matches("-?\\d+(\\.\\d+)?"))){
            System.out.println("O valor do boleto deve ser um Double.");
            return;
        }

        var boleto = Double.parseDouble(boletoString);

        if(boleto <= 0){
            System.out.println("O valor do boleto deve ser maior que 0.");
            return;
        }

        if(boleto > conta.getSaldo()){
            if(conta.getSaldo() + conta.getChequeEspecial() > boleto){
                var opcao = "";

                System.out.println("Saldo insuficiente!");
                System.out.println("Saldo: R$" + conta.getSaldo() + "\nCheque Especial: R$" + conta.getChequeEspecial());
                do {

                    System.out.print("Deseja utilizar o Cheque Especial (O valor de 20% será cobrado)?\n(S/N): ");
                    opcao = scanner.nextLine();
                    
                } while (!(opcao.equals("s")||opcao.equals("n")));

                if(opcao.equals("s")){
                    var resto = conta.getSaldo() - boleto;
                    utilizarChequeEspecial(resto, conta);
                    conta.setSaldo(0.0);
                }
            }
            return;

        }
        

        conta.setSaldo(conta.getSaldo() - boleto);

        System.out.println("Pagamento Realizado!\n- R$" + boleto);

    }

    public void abrirConta(Scanner scanner){
        System.out.print("\nNome do Títular: ");
        var nome = scanner.nextLine();

        System.out.print("Saldo da conta: ");
        var saldo = Double.parseDouble(scanner.nextLine());

        var conta = new Account();
        conta.setNome(nome);
        
        repository.salvarConta(conta, saldo);

        conta.setChequeEspecial(calcularChequeEspecial(conta));

        System.out.println("Conta Registrada com Sucesso!\nNome: " + conta.getNome() + "\nID: " + conta.getId());
    }

    private Double calcularChequeEspecial(Account conta){

        if(conta.getSaldo() > 500){
            return conta.getSaldo()/2; 
        }

        return 50.0;

    }

    private void utilizarChequeEspecial(Double valor, Account conta){
        valor = valor + (valor * 20) / 100;
        
        conta.setChequeEspecial(conta.getChequeEspecial() + valor);
    }

    private Long questionarId(Scanner scanner){
        System.out.print("\nID da Conta: ");
        return Long.valueOf(scanner.nextLine());
    }

}
