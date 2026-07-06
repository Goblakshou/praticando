package main.java.dio.pm.praticando.aula2.domain;

import main.java.dio.pm.praticando.aula2.Manager;
import main.java.dio.pm.praticando.aula2.SalesMan;
import main.java.dio.pm.praticando.aula2.Selling;

import java.util.Scanner;

public abstract sealed class Employee permits Manager, SalesMan, main.java.dio.pm.praticando.aula2.domain.Attendant {

    private final String name;

    private String email;

    private String password;

    private final Boolean isAdmin;

    private Boolean isLogged = false;

    public Boolean getIsLogged(){
        return isLogged;
    }

    public Employee(String name, String email, String password, Boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    Scanner scanner = new Scanner(System.in);

    public void login(){
        if(this.isLogged){
            System.out.println("User actually logged");
            return;
        }
        System.out.print("E-mail: ");
        var email = scanner.nextLine();

        System.out.print("Password: ");
        var password = scanner.nextLine();

        if(this.email.equals(email) && this.password.equals(password)){
            System.out.println("User logged with success");
            this.isLogged = true;
        } else {
            System.out.println("E-mail or Password incorrect");
        }
    }

    public void logoff(){
        if(!(this.isLogged)){
            System.out.println("Actually not logged");
            return;
        }
        this.isLogged = false;
        System.out.println("Logoff done");
    }

    public void editEmail(){
        if(!(this.isLogged)){
            System.out.println("Actually not logged");
            return;
        }
        System.out.print("Insert the current e-mail: ");
        var email = scanner.nextLine();
        if(email.equals(this.email)) {
            System.out.print("Insert the new e-mail: ");
            this.email =  scanner.nextLine();

            System.out.println("E-mail changed");
            return;
        }
        System.out.println("The e-mail don't match");
    }

    public void editPassword(){
        if(!(isLogged)){
            System.out.println("Actually not logged");
        }
        System.out.print("Insert the current password: ");
        var password = scanner.nextLine();
        if(password.equals(this.password)){
            System.out.print("Insert the new password: ");
            this.password = scanner.nextLine();

            System.out.println("Password changed");
            return;
        }

        System.out.println("The password don't match");
    }

    public String printUser(){
        return  "Name: " + this.name +
                "\nEmail: " + this.email +
                "\nPassword: " + this.password +
                "\nAdmin: " + (this.isAdmin ? "Yes" : "No");
    }

    public abstract String printInterface();

    public abstract void printFirstOption(Selling selling);
    public abstract void printSecondOption(main.java.dio.pm.praticando.aula2.domain.Selling selling);
}
