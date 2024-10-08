package org.javaacademy.homework.homework4.ex1;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //ИСПОЛЬЗОВАНИЕ FOR, WHILE ЗАПРЕЩЕНО В ЭТОЙ ДЗ! Только СТРИМЫ.

        //Задание №1 - Список спец номеров
        //Нам необходимо распечатать список номеров, которые принадлежат чиновникам
        //1. Создать класс машина. У машины есть номер.
        //2. Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
        //3. Создать 50 машин с номерами к0[01-50]се178 (где [01-50] - это все значения от 01 до 50)
        //4. Объединить машины в единый стрим
        //5. Оставить в объединенном стриме машины с номерами 04[0-9] - это номера, выдаваемые чиновникам
        //6. Получить из оставшихся машин номера.
        //7. Распечатать номера.
        //ожидаемый результат:
        // a040ан799
        // a041ан799
        // ...
        // k048се178
        // k049се178

        int firstNumber = 1;
        int lastNumber = 50;
        String numberBureaucrat = "04";

        Set<Car> setCars1 = IntStream.range(firstNumber, lastNumber + 1)
                .mapToObj(number -> new Car("а0%02dан799".formatted(number)))
                .collect(Collectors.toSet());

        Set<Car> setCars2 = IntStream.range(firstNumber, lastNumber + 1)
                .mapToObj(number -> new Car("к0%02dсе178".formatted(number)))
                .collect(Collectors.toSet());

        Stream.concat(setCars1.stream(), setCars2.stream())
                .filter(car -> car.getNumber().startsWith(numberBureaucrat, 1))
                .map(Car::getNumber)
                .sorted()
                .forEach(System.out::println);
    }
}
