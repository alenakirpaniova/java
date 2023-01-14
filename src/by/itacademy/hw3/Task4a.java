package src.by.itacademy.hw3;

public class Task4a {
    public static void main(String[] args) {
        int first = 25;
        int second = 10;
        int third = 75;
        if (first < second && first < third && second < third) {
            System.out.println (first + " " + second + " " + third);
        } else if (second < first && second < third && first < third) {
            System.out.println (second + " " + first + " " + third);
        } else if (third < first && third < second && first < second) {
            System.out.println (third + " " + first + " " + second);
        }
    }
}

