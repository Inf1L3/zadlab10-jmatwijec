package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        WprowadzZKonsoli zad1 = new WprowadzZKonsoli();
        zad1.wprowadzInt();
        ExceptionHandled zad2 = new ExceptionHandled();
        try {
            Scanner odczyt = new Scanner(System.in);
            System.out.println("wprowadz liczbe 1 ");
            int a = odczyt.nextInt();
            System.out.println("wprowadz liczbe 2");
            int b = odczyt.nextInt();
            Dzielenie zad3= new Dzielenie(a,b);
        } catch (ArithmeticException e) {
            System.err.println("nie dzieli sie przez 0");
        }

    }

}
