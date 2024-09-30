package org.javaacademy.homework.homework5.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        //Запрещено изменять модификаторы доступа!
        //Практически все будет через рефлексию
        //Создать банк с 1500 денег
        //Создать вора
        //Дописать метод stealMoney у вора так, чтобы он крал все деньги из банка себе
        //(увеличивал у себя деньги и обнулял деньги банка)
        //Вызвать здесь метод stealMoney
        //Распечатать вора и банк

        //Итог:
        //Вор - 1500 денег
        //Банк - 0 денег

        Class<Bank> bankClass = Bank.class;
        Constructor<Bank> bankConstructor = bankClass.getDeclaredConstructor(BigDecimal.class);
        bankConstructor.setAccessible(true);
        Bank bank = bankConstructor.newInstance(BigDecimal.valueOf(1500));
        System.out.println(bank);
        System.out.println("---------------------------------");

        Class<Thief> thiefClass = Thief.class;
        Constructor<Thief> thiefConstructor = thiefClass.getDeclaredConstructor();
        thiefConstructor.setAccessible(true);
        Thief thief = thiefConstructor.newInstance();
        Method stealMoney = thiefClass.getDeclaredMethod("stealMoney", Bank.class);
        stealMoney.setAccessible(true);
        stealMoney.invoke(thief, bank);

        System.out.println(thief);
        System.out.println(bank);
        System.out.println("---------------------------------");

        Method setMoneyBank = bankClass.getDeclaredMethod("setMoney", BigDecimal.class);
        setMoneyBank.setAccessible(true);
        setMoneyBank.invoke(bank, BigDecimal.valueOf(3000));
        System.out.println(bank);
        System.out.println("---------------------------------");

        stealMoney.invoke(thief, bank);

        System.out.println(thief);
        System.out.println(bank);
    }
}