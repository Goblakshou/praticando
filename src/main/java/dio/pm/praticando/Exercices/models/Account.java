package dio.pm.praticando.exercices.models;

public class Account {

    private Long id;
    private String name;
    private Double balance;
    private Double specialCheck;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double saldo) {
        this.balance = saldo;
    }

    public Double getSpecialCheck() {
        return specialCheck;
    }

    public void setSpecialCheck(Double chequeEspecial) {
        this.specialCheck = chequeEspecial;
    }


}
