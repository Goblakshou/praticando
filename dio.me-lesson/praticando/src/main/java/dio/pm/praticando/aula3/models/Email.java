package main.java.dio.pm.praticando.aula3.models;

import main.java.dio.pm.praticando.aula3.interfaces.Message;

public class Email implements Message {
    @Override
    public void printMessage(String message) {
        System.out.println("E-mail: " + message);
    }
}
