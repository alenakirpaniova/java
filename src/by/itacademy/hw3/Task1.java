package src.by.itacademy.hw3;

import java.util.Scanner;
public class Task1 {
    public static void main(String args []){
        int number;
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите челое число -> ");
        if(sr.hasNextInt()){
            number = sr.nextInt();
            if ((number % 2) == 0){
                System.out.print("Четное число " + number);
            }else{System.out.print("Не четное число " + number);}
        }else{System.out.print("Вы ввели не целое число");}
    }
}
//1.	Четное-нечетное. Передать на вход программы число. Если оно нечетное, распечатать его.
