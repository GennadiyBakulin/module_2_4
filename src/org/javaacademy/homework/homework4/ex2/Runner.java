package org.javaacademy.homework.homework4.ex2;

import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
        //2. Создать стрим у набора
        //2.1 Посчитать количество букв "о" в одном слове
        //2.2 Посчитать сумму количества букв "о" во всех словах из набора
        //2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
        //
        //Ожидаемый результат:
        //6

        Set<String> words = Set.of("тон", "тополь", "боль", "рой", "стройка");
        int count = words.stream()
                .mapToInt(word -> word.length() - word.toLowerCase().replaceAll("о", "").length())
                .sum();
        System.out.println(count);
    }
}
