package org.javaacademy.homework.homework4.ex1;

public class Car {
    private final String number;

    public Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;
        return number.equals(car.number);
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }
}
