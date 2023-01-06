package src.by.itacademy.hw3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3a {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число - номер дня недели - от 1 до 7 :" );
        String s = reader.readLine();
        int day = Integer.parseInt(s);

        // 1- понедельник
        // 2 - вторник
        // 3 - среда
        // 4 - четверг
        // 5 - пятница
        // 6 - выходной
        // 7 - выходной

        switch (day) {
            case 0:
                System.out.println("Введите число - номер дня недели - от 1 до 7 :");
                break;
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("выходной");
                break;
            case 7:
                System.out.println("выходной");
                break;
            default:
                System.out.println("такого дня недели не существует");
        }
    }
}


