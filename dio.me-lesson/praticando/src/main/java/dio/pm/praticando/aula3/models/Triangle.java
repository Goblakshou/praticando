package main.java.dio.pm.praticando.aula3.models;

import main.java.dio.pm.praticando.aula3.interfaces.GeometricCalculator;

import java.util.Scanner;

public class Triangle implements GeometricCalculator {

    @Override
    public void AreaCalculator(Scanner scanner) {
        System.out.print("INSERT THE TRIANGLE'S BASE IN METER:");
        var base = Double.parseDouble(scanner.nextLine());
        System.out.print("INSERT THE TRIANGLE'S HEIGHT IN METER:");
        var height = Double.parseDouble(scanner.nextLine());
        var area = (base * height) / 2;

        System.out.println("AREA: " + area + "m²");
    }
}
