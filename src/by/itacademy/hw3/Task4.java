package src.by.itacademy.hw3;

public class Task4{

   public static void main(String[] args){
        int a = 15;
        int b = 10;
        int c = 25;
        assert a != b && a != c && b != c;
        System.out.println("Числа в переменных a, b и c : " + a  + " " + b + " " + c);
        if (b > c) {
            int x = b; b = c; c = x; // swap(b, c);
        }
        assert b < c;
        if (a > c) {
            int x = a; a = c; c = x; // swap(a, c);
        }
        assert a < c;
        if (a > b) {
            int x = a; a = b; b = x; // swap(a, b);
        }
        assert a < b && b < c;
        System.out.println("Возрастающая последовательность: " + a  + " " + b + " " + c);
    }
}




//4.	В три переменные a, b, и c записаны 3 целых неравных между собой числа.
// Создать программу, которая выведет числа по возрастанию.