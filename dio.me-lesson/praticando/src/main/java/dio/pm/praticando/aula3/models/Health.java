package main.java.dio.pm.praticando.aula3.models;

import main.java.dio.pm.praticando.aula3.interfaces.TaxCalculator;

public class Health implements TaxCalculator {

    final Double TAX_VALUE = 1.5;

    @Override
    public Double calculateTax(Double price, Integer quantity) {
        var total = price * quantity;
        var tax = (total / 100) * TAX_VALUE;
        return total + tax;
    }
}
