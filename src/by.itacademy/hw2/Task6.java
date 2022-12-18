package src.by.itacademy.hw2;
//6.	Создать программу, которая будет выводить на экран меньшее по модулю из трёх вещественных чисел.
import java.util.Scanner;
public class Task6 {
    public static void main(String args[]) {
        System.out.println("Введите первое число");
        Scanner scn1=new Scanner(System.in);
        if(scn1.hasNextFloat()){
            float i=Math.abs(scn1.nextFloat());
            System.out.println("Введите второе число");
            Scanner scn2=new Scanner(System.in);
            if(scn2.hasNextFloat()){
                float k=Math.abs(scn2.nextFloat());
                System.out.println("Введите третье число");
                Scanner scn3=new Scanner(System.in);
                if(scn3.hasNextFloat()){
                    float n=Math.abs(scn3.nextFloat());
                    if(i<=k&i<=n)
                        System.out.println("Меньшее число по модулю "+i);
                    if(k<i&k<=n)
                        System.out.println("Меньшее число по модулю "+k);
                    if(n<i&n<k)
                        System.out.println("Меньшее число по модулю "+n);
                }
                else System.out.println("Ошибка. Вы ввели не вещественное число");
            }
            else System.out.println("Ошибка. Вы ввели не вещественное число");
        }
        else System.out.println("Ошибка. Вы ввели не вещественное число");
    }
}
