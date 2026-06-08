package dio.pm.praticando.exercices.repository;

import java.util.ArrayList;
import java.util.List;

import dio.pm.praticando.exercices.models.Account;

public class AccountRepository{
    private List<Account> contas = new ArrayList<>();
    private Long idAtual = 1L;
    
    public List<Account> listarContas(){
        return contas;
    }

    public Account buscarConta(Long id){
        for (Account conta : contas) {
            if(conta.getId().equals(id)){
                return conta;
            }
        }
        return null;
    }

    public void salvarConta(Account conta, Double saldo){
        
        conta.setId(idAtual);
        conta.setSaldo(saldo);

        contas.add(conta);

        idAtual++;

    }


}
