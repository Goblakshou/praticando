package dio.pm.praticando.domain;

public non-sealed class HalfTicket extends Ticket{

    public HalfTicket(Double value, String name, String movieDetail, Integer quantity) {
        super(value, name, movieDetail, quantity);
    }

    @Override
    public Double calculateBuy() {
        return (this.quantity * this.price) / 2;
    }

//    @Override
//    public String printReceipt() {
//                return "Name: " + this.name
//                + "\nDetail: " + this.movieDetail
//                + "\nPrice: " + this.price + "$ x Quantity: " + this.quantity
//                + "\nFull Price: " + calculateBuy() + "$";
//    }
}
