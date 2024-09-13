package org.javaacademy.homework.homework3.ex1;

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = () -> new Apple();
        Garden<Apricot> apricotFarm = () -> new Apricot();
        Apple apple = appleFarm.grow();
        Apricot apricot = apricotFarm.grow();
        System.out.println(apple);
        System.out.println(apricot);
    }
}
