package src.by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        if (min >= 0 && min <= 14) {
            System.out.println("первая");
        }
        else if (min >= 15 && min <= 30) {
            System.out.println("вторая");
        }
        else if (min >= 31 && min <= 45) {
            System.out.println("третья");
        }
        else if (min >= 46 && min <= 59) {
            System.out.println("четвертая");
        }
        else
        {
            System.out.println("число не входит не в одну четверть часа");
        }
    }
}
//5.Передать на вход программы число от 0 до 59.
// Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).


