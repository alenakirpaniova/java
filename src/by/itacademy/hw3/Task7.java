package src.by.itacademy.hw3;

import java.util.Scanner;
import java.security.SecureRandom;


import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {


        // читывает входные данные, предоставленные пользователем
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // Этот метод считывает номер, указанный с клавиатуры
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter three number: ");
        int num3 = scan.nextInt();

        // Закрытие сканера после использования
        scan.close();

        // Вычисление произведения двух чисел
        int product = num1*num2;

        // Displaying the multiplication result
        System.out.println("Output: "+product);
    }
}


//7.	Пользователь вводит два целых однозначных числа.
// Программа задаёт вопрос: каков результат умножения первого числа на второе?
// Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
// Если нет  – показать еще и правильный результат.