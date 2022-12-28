package src.by.itacademy.hw3;

import java.util.Scanner;
public class Task2{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0 && (a%2)==0)
            System.out.println("отрицательное четное число");
        else if(a<0 && (a%2)!=0)
            System.out.println("отрицательное нечетное число");
        else if(a==0)
            System.out.println("ноль");
        else if(a>0 && (a%2)==0)
            System.out.println("положительноее четное число");
        else if(a>0 && (a%2)!=0)
            System.out.println("положительное нечетное число");

    }
}

//	2. Передать на вход программы число,
// если оно нечетное положительное или четное  отрицательное, вывести соответствующий текст.