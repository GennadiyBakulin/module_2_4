package org.javaacademy.homework.homework1.ex1.zoo;

import org.javaacademy.homework.homework1.ex1.animal.Animal;

public class Zoo<T extends Animal, K extends Animal, V extends Animal> {
    private final T animal1;
    private final K animal2;
    private final V animal3;

    public Zoo(T animal1, K animal2, V animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public K getAnimal2() {
        return animal2;
    }

    public V getAnimal3() {
        return animal3;
    }
}
