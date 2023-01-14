package src.by.itacademy.hw3;

    import java.util.Scanner;

    public class Task6 {
        private static final String TRIANGLE_EXISTS = "треугольник существует";
        private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt() ;
            int b =scanner.nextInt();
            int c =scanner.nextInt();

            if (a<=b+c && b<=a+c && c<=a+b)
                System.out.println("треугольник существует");
            else if (!(a<=b+c && b<=a+c && c<=a+b))
                System.out.println(TRIANGLE_NOT_EXISTS);

        }
    }
//6.Вводятся длины трех сторон предполагаемого треугольника.
// Определить, может ли существовать треугольник с такими сторонами при условии что,
// треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.
