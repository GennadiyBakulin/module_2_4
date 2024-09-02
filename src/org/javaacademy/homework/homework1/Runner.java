package org.javaacademy.homework.homework1;

import org.javaacademy.homework.homework1.ex1.animal.Bird;
import org.javaacademy.homework.homework1.ex1.animal.Dog;
import org.javaacademy.homework.homework1.ex1.animal.Tiger;
import org.javaacademy.homework.homework1.ex1.zoo.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println("---------------Задание №1 Зоопарк------------------");
        //Задание №1 Зоопарк
        //1. Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
        //Общий родитель - животное (никаких атрибутов и методов в нем нет).
        //2. Создать зоопарк, который может хранить в себе 3 животных любого типа.
        //Т.е. могут быть следующие зоопарки:
        // Зоопарк в котором Тигр, Тигр, Птица
        // Зоопарк в котором Собака, Собака, Собака
        // Зоопарк в котором Птица, Птица, Тигр.
        //3. Сделать геттеры на всех животных.
        //Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
        //Т.е. создали зоопарк Тигр, Собака, Птица (положили в этот зоопарк животных  при создании).
        //Получили первое животное (тигра) - вызвали у него рык
        //Получили второе животное (собака) - вызвали у него лай
        //Получили первое животное (птица) - вызвали у него полет
        //Запрещено пользоваться instanceOf.

        Tiger tiger = new Tiger();
        Bird bird = new Bird();
        Dog dog = new Dog();
        Zoo<Tiger, Bird, Dog> zoo = new Zoo<>(tiger, bird, dog);
        zoo.getAnimal1().can();
        zoo.getAnimal2().can();
        zoo.getAnimal3().can();

        System.out.println("-------------------------");

        Zoo<Tiger, Tiger, Dog> zoo2 = new Zoo<>(tiger, tiger, dog);
        zoo2.getAnimal1().can();
        zoo2.getAnimal2().can();
        zoo2.getAnimal3().can();

        System.out.println("---------------Задание №2 Гидрометцентр------------------");
        //Задание №2 Гидрометцентр
        //Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
        //Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
        //Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
        //Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
        //Запрещено использовать массивы.

        List<Integer> january =
                List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2, -7, -3, -1, -8, -9, -8, -8,
                        -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1);
        List<Integer> february =
                List.of(-8, -10, -12, -13, -15, -16, -12, -7, -8, -10, -10, -9, -8, -8, -8, -9, -10, -9,
                        -5, -6, -8, -7, -8, -9, -6, -5, -3, -1);
        List<Integer> union = new ArrayList<>(List.copyOf(january));
        union.addAll(february);

        int sum = 0;

        for (int elem : union) {
            sum += elem;
        }
        double averageTemperature = (double) sum / union.size();
        System.out.printf(
                "Среднесуточная температура воздуха за два месяца составила = %.2f градуса\n", averageTemperature);

        System.out.println("---------------Задание №3 Ресторанный гуру------------------");
        //Задание №3 Ресторанный гуру
        //Николай Петрович ходит по ресторанам. За 5 дней он был во множестве ресторанов.
        //Он обратился к вам, чтобы узнать в каком ресторане(ах) он был каждый день
        // (т.е. найти ресторан(ы) в которых он был и в понедельник, и во вторник, и в среду и тд).
        ArrayList<String> monday = new ArrayList<>(
                List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо"));
        ArrayList<String> tuesday = new ArrayList<>(
                List.of("Вареничная №1", "Пушкин", "Чебуречная №1", "Ниппон", "Реберная"));
        ArrayList<String> wednesday = new ArrayList<>(List.of("Реберная", "Арарат", "Майя", "Ниппон", "Таксим"));
        ArrayList<String> thursday = new ArrayList<>(List.of("Грех", "Ваниль", "Реберная", "Пянсе", "Фо бо"));
        ArrayList<String> friday = new ArrayList<>(List.of("Бёрдс", "Реберная", "Андерсон", "Ниппон", "Чифанька"));

        List<String> list = new ArrayList<>(List.copyOf(monday));
        list.retainAll(tuesday);
        list.retainAll(wednesday);
        list.retainAll(thursday);
        list.retainAll(friday);
        System.out.println("Ресторан(ы) в котором(ых) Николай Петрович был каждый день - " + list);
    }
}
