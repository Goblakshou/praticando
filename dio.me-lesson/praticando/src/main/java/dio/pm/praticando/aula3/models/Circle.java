package main.java.dio.pm.praticando.aula3.models;

import main.java.dio.pm.praticando.aula3.interfaces.GeometricCalculator;

import java.util.Scanner;

public class Circle implements GeometricCalculator {

    @Override
    public void AreaCalculator(Scanner scanner) {
        System.out.print("INSERT THE CIRCLE'S RADIUS IN METER:");
        var radius = Double.parseDouble(scanner.nextLine());
        var area = (radius * radius) * 3.14;

        System.out.println("AREA: " + area + "m²");
    }
}
