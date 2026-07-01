package dio.pm.praticando.domain;

public non-sealed class FamilyPack extends Ticket{

    public FamilyPack(Double value, String name, String movieDetail, Integer quantity) {
        super(value, name, movieDetail, quantity);
    }

    @Override
    public Double calculateBuy() {
        if(this.quantity > 3){
            return (this.price * this.quantity) - applyDiscount();
        }
        return this.price * this.quantity;
    }

//    @Override
//    public String printReceipt() {
//        return "Name: " + this.name
//                + "\nDetail: " + this.movieDetail
//                + "\nPrice: " + this.price + "$ x Quantity: " + this.quantity
//                + "\nFull Price: " + calculateBuy();
//    }

    private Double applyDiscount(){
        return ((this.quantity * this.price) / 100) * 5;
    }

}
