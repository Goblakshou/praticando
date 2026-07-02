package main.java.dio.pm.praticando.domain;

public final class Manager extends Employee{

    public Manager(String name, String email, String password) {
        super(name, email, password, true);
    }

    @Override
    public String printInterface() {
        return "1 - Generate finance report \n2 - Consult selling \n3 - Alter e-Email \n4 - Alter password \n0 - Logoff";
    }

    @Override
    public void printFirstOption(Selling selling) {
        System.out.println("Finance Report:\n" + "\nSelling: " + selling.getSelling() + " x Earnings: $" + selling.getEarnings() + "\nAverage per sale: $" + (selling.getEarnings()/ selling.getSelling()));
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
