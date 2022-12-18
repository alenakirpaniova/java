package src.by.itacademy.hw2;

public class Task4 {
    public static void main (String args[]) {
        int number_i = 10;
        double number_d = (int) number_i; // автоматическое преобразованием: int в double

        System.out.println(number_i);   // Выведет 10
        System.out.println(number_d);   // Выведет 10.0

        double number_a = 10.25;
        int number_b = (int) number_a; // сужающее преобразование, перед переменной в скобках имя типа

        System.out.println(number_a);   // Выведет 10.25
        System.out.println(number_b);   // Выведет 10
    }
}

