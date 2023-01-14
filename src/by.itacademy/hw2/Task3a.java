package src.by.itacademy.hw2;
/*
Задать промежуток времени в переменной в секундах.
Вывести его на консоль в неделях, днях, часах, минутах и секундах.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task3a {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ("введи начальное время в секундах ");
        int a = Integer.parseInt ( x.readLine () );
        int sec = a % 60; // остаток от деления 40 - нашли сколько секунд
        int m = (a - sec) / 60; // находим сколько минут - 61 (одну потом оставиль, остальные 60 - записываем в 1 час)
        int min = m % 60; // находим сколько минут - 60
        int h = (m - min) / 60; // выше, где 61 нашли, один отняли, получили 60, вот эти 60 перевели в один час
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 24;
        int w = (d - day) / 7;

        System.out.println (w + " неделя " + d + " дней " + h + " часов " + min + " минут " + sec + " секунд " );
        //System.out.printf ( "%.2f\n", seconds );
    }
}