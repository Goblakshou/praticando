package main.java.dio.pm.praticando.domain;

import java.util.Scanner;

public final class Attendant extends Employee{

    public Attendant(String name, String email, String password) {
        super(name, email, password, false);
    }

    @Override
    public String printInterface() {
        return "1 - Realize sell \n2 - Consult selling \n3 - Alter e-Email \n4 - Alter password \n0 - Logoff";
    }

    @Override
    public void printFirstOption(Selling selling) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the value:");
        var value = Double.parseDouble(scanner.nextLine());

        selling.takeCash(value);
        System.out.println("Sale done with success");
    }

    @Override
    public void printSecondOption(Selling selling) {
        if(selling.getSellingHistory() == null){
            System.out.println("No sales");
            return;
        }
        System.out.println("Selling:\n" + selling.getSellingHistory());
    }
}
