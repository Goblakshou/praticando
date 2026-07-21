package main.java.dio.pm.praticando.aula3.models;

import main.java.dio.pm.praticando.aula3.interfaces.GeometricCalculator;

import java.util.Scanner;

public class Square implements GeometricCalculator {

    @Override
    public void AreaCalculator(Scanner scanner) {
        System.out.print("INSERT ONE OF THE SQUARE'S SIDE IN METER:");
        var side = Double.parseDouble(scanner.nextLine());
        var area = (side * side);

        System.out.println("AREA: " + area + "m²");
    }
}
