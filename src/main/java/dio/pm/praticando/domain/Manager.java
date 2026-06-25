package dio.pm.praticando.domain;

import java.time.LocalDateTime;

public final class Manager extends Employee{

    public Manager(String code, String name, String address, Double salary, LocalDateTime birth) {
        super(code, name, address, salary, birth);
    }

    private String login;

    private String password;

    private Integer comission;
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getComission() {
        return comission;
    }

    public void setComission(Integer comission) {
        this.comission = comission;
    }
    
    @Override
    public String getCode(){
        
        return "MN" + this.code;

    }

    @Override
    public Double getFullSalary() { return salary + comission;
    }
    
    
}
