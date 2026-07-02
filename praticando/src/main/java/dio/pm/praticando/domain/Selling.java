package main.java.dio.pm.praticando.domain;

public final class Selling {

    private Integer selling = 0;

    private Double earnings = 0.0;

    private String sellingHistory;

    private Boolean saleInProgress = false;

    public String getSellingHistory() {
        return sellingHistory;
    }

    public Integer getSelling() {
        return selling;
    }

    public Double getEarnings() {
        return earnings;
    }

    public void setSelling() {
        if(this.saleInProgress){
            System.out.println("Another sale in progress");
            return;
        }
        this.selling = this.selling + 1;
        this.sellingHistory = this.sellingHistory + "\nSelling: " + this.selling;
        this.saleInProgress = true;
        System.out.println("Started the selling, go to the attendant to end de sale");
    }

    public void takeCash(Double value){
        if(!(this.saleInProgress)){
            System.out.println("None sale in progress");
            return;
        }
        this.earnings = this.earnings + value;
        this.sellingHistory = this.sellingHistory + " - Value: $" + value;
        this.saleInProgress = false;
        System.out.println("Sale done");
    }

}
