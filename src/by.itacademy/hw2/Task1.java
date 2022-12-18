package src.by.itacademy.hw2;

/*
Вывести на консоль значения переменных:
byte b = 0x55;
short s = 0x55ff;
int i = 1000000;
long l = 0xffffffffL;
char c = 'a';
float f = .25f;
double d = .00001234;
boolean b2 = true;
 */
public class Task1 {
    public static void main(String[] args) {
        byte b = 0x55;
        System.out.println(b);

        short s = 0x55ff;
        System.out.println(s);

        int i = 1000000;
        System.out.println(i);

        long l = 0xffffffffL;
        System.out.println(l);

        char c = 'a';
        System.out.println("'a'");

        float f = .25f;
        System.out.println(String.format("%.2f", f));

        double d = .00001234;
        System.out.println(String.format( "%.8f", d ));

        boolean b2 = true;
        System.out.println(b2);
    }
}

