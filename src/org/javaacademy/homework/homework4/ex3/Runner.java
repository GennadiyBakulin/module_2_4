package org.javaacademy.homework.homework4.ex3;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Задание №3 - Небоскребы, небоскребы, а я...
        //1. Создать Класс Небоскреб - имя небоскреба, его высота в метрах.
        //2. Необходимо создать небоскребы:
        //Всемирный торговый центр - 541м
        //Шанхайская башня - 632м
        //Бурдж-Халифа - 828м
        //Международный финансовый центр Пинань - 599м
        //Абрадж аль-Бейт - 601м
        //Всемирный центр Лотте - 555м

        Skyscraper worldTradeCenter = new Skyscraper("World Trade Center", 541);
        Skyscraper shanghaiTower = new Skyscraper("Shanghai Tower", 632);
        Skyscraper burjKhalifa = new Skyscraper("Burj Khalifa", 828);
        Skyscraper pinanInternationalFinancialCenter = new Skyscraper("Pinan International Financial Center", 599);
        Skyscraper abrajAlBayt = new Skyscraper("Abraj al-Bayt", 601);
        Skyscraper lotteWorldCenter = new Skyscraper("Lotte World Center", 555);

        //3. Занести небоскребы в List! Дважды положить бурдж халифа в лист.

        List<Skyscraper> skyscraperList = List.of(worldTradeCenter, shanghaiTower, burjKhalifa,
                pinanInternationalFinancialCenter, abrajAlBayt, lotteWorldCenter, burjKhalifa);

        //4. С помощью стримов:
        //4.1 Убрать дубликаты и сохранить в новый лист (далее работаем с этим листом).
        //(РАЗНЫЕ СТРИМЫ!)
        //4.2. Вывести только первые три небоскреба.
        //4.3. Вывести самый высокий небоскреб.
        //4.4. Вывести те небоскребы, которые выше километра.
        //Если выше километра нет, то вывести на экран: небоскреба выше километра - нет.

        List<Skyscraper> newSkyscraperList = skyscraperList.stream()
                .distinct()
                .toList();

        newSkyscraperList.forEach(System.out::println);

        System.out.println("-----------------------------------");
        System.out.println("Первые три небоскреба:");

        newSkyscraperList.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");
        System.out.println("Самый высокий небоскреб:");

        newSkyscraperList.stream()
                .sorted((o1, o2) -> o2.getHeight() - o1.getHeight())
                .limit(1)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");
        System.out.println("Вывести те небоскребы, которые выше километра:");

        int maxHeight = 1000;

        if (newSkyscraperList.stream().noneMatch(skyscraper -> skyscraper.getHeight() > maxHeight)) {
            System.out.println("небоскреба выше километра - нет");
        } else {
            newSkyscraperList.stream()
                    .filter(skyscraper -> skyscraper.getHeight() > maxHeight)
                    .forEach(System.out::println);
        }
    }
}
