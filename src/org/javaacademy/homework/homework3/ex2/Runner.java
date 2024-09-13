package org.javaacademy.homework.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = name -> name.length() % 2 == 0;
        Divination<Person> grannyFortuneTeller = person -> (person.getAge() + person.getHeight()) > 210;
        System.out.println(chamomile.divination("Kirill"));
        System.out.println(grannyFortuneTeller.divination(new Person(30, 180)));
    }
}
