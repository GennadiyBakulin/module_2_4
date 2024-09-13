package org.javaacademy.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        Burning<Uranium> nuclearReactor = (uranium) -> System.out.println("зеленый свет вокруг!");
        Burning<Tree> fire = (tree) -> System.out.println("желто-красный свет вокруг!");
        nuclearReactor.burning(new Uranium());
        fire.burning(new Tree());
    }
}
