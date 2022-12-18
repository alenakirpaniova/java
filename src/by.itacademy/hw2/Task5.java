package src.by.itacademy.hw2;
// 5.	Создать программу, которая будет сообщать, является ли целое число чётным.

import java.util.Scanner;
public class Task5 {
    public static void main(String args[]) {
        int num; // переменная для хранения числа
        System.out.println("Введите число: "); //Введенное пользователем число в консоле будет хранится в переменной num

        Scanner input = new Scanner(System.in); // сканирование сканера, новый сканер(System.in), используется для ввода строки во время выполнения
        num = input.nextInt(); // nextInt используется для целого числа

        // Если число делится на 2, то это четное число, иначе - нечетное
        // если остаток от деления равен нулю, то четное
        if ( num % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}

