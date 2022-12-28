package src.by.itacademy.hw3;


   import java.io.BufferedReader;
   import java.io.InputStreamReader;

    public class Task3{
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите число - номер дня недели - от 1 до 7 :" );
            String s = reader.readLine();
            int day = Integer.parseInt(s);

            if (day == 1)
            {
                System.out.println("понедельник");
            }
            else if (day == 2)
            {
                System.out.println("вторник");
            }
            else if (day == 3)
            {
                System.out.println("среда");
            }
            else if (day == 4)
            {
                System.out.println("четверг");
            }
            else if (day == 5)
            {
                System.out.println("пятница");
            }
            else if (day == 6)
            {
                System.out.println("суббота");
            }
            else if (day == 7)
            {
                System.out.println("воскресенье");
            }
            else
            {
                System.out.println("такого дня недели не существует");
            }

        }
    }




//3.Дни недели. С консоли вводится число от 1 до 7. Если число не входит в диапазон 1-7, вывести сообщение об ошибке.
// Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.