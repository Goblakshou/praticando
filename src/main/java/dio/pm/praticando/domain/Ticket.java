package main.java.dio.pm.praticando.domain;

public sealed abstract class Ticket permits FamilyPack, HalfTicket{

    protected Double value;

    protected String name;

    protected String movieDetail;

    public Double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getMovieDetail() {
        return movieDetail;
    }

    public Ticket(Double value, String name, String movieDetail) {
        this.value = value;
        this.name = name;
        this.movieDetail = movieDetail;
    }
}
