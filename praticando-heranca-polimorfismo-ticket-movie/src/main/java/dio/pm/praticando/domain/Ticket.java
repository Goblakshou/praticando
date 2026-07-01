package dio.pm.praticando.domain;

public sealed abstract class Ticket permits FamilyPack, HalfTicket{

    protected Double price;

    protected String name;

    protected String movieDetail;

    protected Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getMovieDetail() {
        return movieDetail;
    }

    public Ticket(Double value, String name, String movieDetail, Integer quantity) {
        this.price = value;
        this.name = name;
        this.movieDetail = movieDetail;
        this.quantity = quantity;
    }

    public abstract Double calculateBuy();

    public String printReceipt() {
        return "Name: " + this.name
                + "\nDetail: " + this.movieDetail
                + "\nPrice: " + this.price + "$ x Quantity: " + this.quantity
                + "\nFull Price: " + calculateBuy() + "$";
    }
}
