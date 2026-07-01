package main.java.dio.pm.praticando.domain;

public non-sealed class FamilyPack extends Ticket{

    private Integer quantity;

    public FamilyPack(Double value, String name, String movieDetail) {
        super(value, name, movieDetail);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
