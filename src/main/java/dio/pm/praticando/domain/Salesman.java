package dio.pm.praticando.domain;

import java.time.LocalDateTime;

public final class Salesman extends Employee {

    private Integer percentualPerSold;

    private Double soldAmount;

    public Salesman(String code, String name, String address, Double salary, LocalDateTime birth) {
        super(code, name, address, salary, birth);
    }

    public Double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(Double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public Integer getPercentualPerSold() {
        return percentualPerSold;
    }

    public void setPercentualPerSold(Integer commission) {
        this.percentualPerSold = commission;
    }

    @Override
    public String getCode(){
        
        return "SL" + this.code;

    }

    @Override
    public Double getFullSalary() { return this.salary = this.salary + (this.soldAmount * this.percentualPerSold) / 100; }


}
