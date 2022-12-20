package src.by.itacademy.hw2;

public class Task4a {
    public static void main(String[] args) {
        byte a = 15;
        byte b = a;
        System.out.println(b);

        byte e = 15; // автоматическое преобразование
        short f = e;
        System.out.println(f);

        byte c = 15; // автоматическое преобразование
        int d = c;
        System.out.println(d);

        int i = 15;
        long l = i;
        System.out.println(l);

        int k = 0;
        long m = 15;
        k = (int) m; // сужающее преобразование, перед переменной в скобках имя типа
        System.out.println(k);
        System.out.println(m);

        double n = 15.2345;
        int p = (int) n;
        System.out.println(p); // в консоли получится число 15.
                               // контейнере останется то, что туда «влезло».
                               // У чисел с плавающей точкой будет «отсекаться» дробная часть.
                               // дробная часть не округляется, а отбрасывается.

    }

}
