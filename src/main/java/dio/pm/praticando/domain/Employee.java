package dio.pm.praticando.domain;

import java.time.LocalDateTime;

public abstract sealed class Employee permits Manager, Salesman {
    
    protected String code;

    protected String name;

    protected String address;

    protected Double salary;

    protected LocalDateTime birth;

    public Employee(String code, String name, String address, Double salary, LocalDateTime birth) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.birth = birth;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public Employee() {
    }

    public abstract Double getFullSalary();
    

}
