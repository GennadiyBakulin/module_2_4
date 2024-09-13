package org.javaacademy.homework.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatMeter = boat -> boat.getLength();
        Ruler<Animal> animalMeter = animal -> animal.getBodyLength() + animal.getTailLength();
        System.out.println(boatMeter.ruler(new Boat(250)));
        System.out.println(animalMeter.ruler(new Animal(25, 15)));
    }
}
