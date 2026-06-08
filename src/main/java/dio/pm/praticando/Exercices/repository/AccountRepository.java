package dio.pm.praticando.exercices.repository;

import java.util.ArrayList;
import java.util.List;

import dio.pm.praticando.exercices.models.Account;

public class AccountRepository{
    private List<Account> accounts = new ArrayList<>();
    private Long currentId = 1L;
    
    public List<Account> listAccounts(){
        return accounts;
    }

    public Account searchAccount(Long id){
        for (Account account : accounts) {
            if(account.getId().equals(id)){
                return account;
            }
        }
        return null;
    }

    public void saveAccount(Account account, Double balance){
        
        account.setId(currentId);
        account.setBalance(balance);

        accounts.add(account);

        currentId++;

    }


}
