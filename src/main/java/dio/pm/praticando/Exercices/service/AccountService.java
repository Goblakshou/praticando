package dio.pm.praticando.exercices.service;

import java.util.Scanner;

import dio.pm.praticando.exercices.models.Account;
import dio.pm.praticando.exercices.repository.AccountRepository;

public class AccountService {


    AccountRepository repository = new AccountRepository();
    
    public void consultBalance(Scanner scanner){
        var id = questionId(scanner);

        if(!(repository.searchAccount(id) != null)){
            System.out.println("Account not found.");
            return;
        }

        var balance = repository.searchAccount(id).getBalance();
        var specialCheck = repository.searchAccount(id).getSpecialCheck();
        var name = repository.searchAccount(id).getName();

        System.out.println("Name: " + name + "\nBalance: $" + balance + "\nOverdraft: $" + specialCheck);
    }

    public void deposit(Scanner scanner){
        var id = questionId(scanner);

        if(!(repository.searchAccount(id) != null)){
            System.out.println("Account not found.");
            return;
        }        

        var account = repository.searchAccount(id);

        System.out.print("Deposit value: $");
        var depositString = scanner.nextLine();

        if(!(depositString != null || depositString.matches("-?\\d+(\\.\\d+)?"))){
            System.out.println("The deposit value must be a valid number.");
            return;
        }            

        var deposit = Double.parseDouble(depositString);

        if(deposit <= 0){
            System.out.println("The deposit value must be greater than 0.");
            return;
        }

        account.setBalance(account.getBalance() + deposit);

        System.out.println("Deposit successfully completed!\n+ $" + deposit);

    }
    
    public void withdrawal(Scanner scanner){
        var id = questionId(scanner);

        if(!(repository.searchAccount(id) != null)){
            System.out.println("Account not found.");
            return;
        }        

        var account = repository.searchAccount(id);

        System.out.print("Withdrawal amount: $");
        var withdrawalString = scanner.nextLine();

        if(!(withdrawalString != null || withdrawalString.matches("-?\\d+(\\.\\d+)?"))){
            System.out.println("The withdrawal amount must be a valid number.");
            return;
        }

        var withdrawal = Double.parseDouble(withdrawalString);

        if(withdrawal <= 0){
            System.out.println("The withdrawal amount must be greater than 0.");
            return;
        }

        if(withdrawal > account.getBalance()){
            if(account.getBalance() + account.getSpecialCheck() > withdrawal){
                var option = "";

                System.out.println("Insufficient balance!");
                System.out.println("Balance: $" + account.getBalance() + "\nOverdraft: $" + account.getSpecialCheck());
                do {

                    System.out.print("Do you want to use the overdraft? A 20% fee will be charged.\n(Y/N): ");
                    option = scanner.nextLine();
                    
                } while (!(option.equals("y")||option.equals("n")));

                if(option.equals("y")){
                    var rest = account.getBalance() - withdrawal;
                    useSpecialCheck(rest, account);
                    account.setBalance(0.0);
                }
            }
            return;
        }

        account.setBalance(account.getBalance() - withdrawal);

        System.out.println("Withdrawal completed!\n- $" + withdrawal);
        
    }
    
    public void payBill(Scanner scanner){
        var id = questionId(scanner);

        if(!(repository.searchAccount(id) != null)){
            System.out.println("Account not found.");
            return;
        }

        var account = repository.searchAccount(id);

        System.out.print("Bill value: $");
        var billString = scanner.nextLine();

        if(!(billString != null || billString.matches("-?\\d+(\\.\\d+)?"))){
            System.out.println("The bill value must be a valid number.");
            return;
        }

        var bill = Double.parseDouble(billString);

        if(bill <= 0){
            System.out.println("The bill value must be greater than 0.");
            return;
        }

        if(bill > account.getBalance()){
            if(account.getBalance() + account.getSpecialCheck() > bill){
                var option = "";

                System.out.println("Insufficient balance.");
                System.out.println("Balance: $" + account.getBalance() + "\nOverdraft: $" + account.getSpecialCheck());
                do {

                    System.out.print("Do you want to use the overdraft? A 20% fee will be charged.\n(Y/N): ");
                    option = scanner.nextLine();
                    
                } while (!(option.equals("y")||option.equals("n")));

                if(option.equals("y")){
                    var rest = account.getBalance() - bill;
                    useSpecialCheck(rest, account);
                    account.setBalance(0.0);
                }
            }
            return;

        }
        

        account.setBalance(account.getBalance() - bill);

        System.out.println("Payment completed!\n- $" + bill);

    }

    public void openAccount(Scanner scanner){
        System.out.print("\nAccount holder's name: ");
        var name = scanner.nextLine();

        System.out.print("Initial deposit: ");
        var plunder = Double.parseDouble(scanner.nextLine());

        var account = new Account();
        account.setName(name);
        
        repository.saveAccount(account, plunder);

        account.setSpecialCheck(calculateSpecialCheck(account));

        System.out.println("Account registered successfully!\nName: " + account.getName() + "\nID: " + account.getId());
    }

    private Double calculateSpecialCheck(Account account){

        if(account.getBalance() > 500){
            return account.getBalance()/2; 
        }

        return 50.0;

    }

    private void useSpecialCheck(Double value, Account account){
        value = value + (value * 20) / 100;
        
        account.setSpecialCheck(account.getSpecialCheck() + value);
    }

    private Long questionId(Scanner scanner){
        System.out.print("\nAccount ID: ");
        return Long.valueOf(scanner.nextLine());
    }

}
