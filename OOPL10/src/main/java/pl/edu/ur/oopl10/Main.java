package pl.edu.ur.oopl10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        /*
        WprowadzZKonsoli zad1 = new WprowadzZKonsoli();
        zad1.wprowadzInt();
        ExceptionHandled zad2 = new ExceptionHandled();
        // zad3
        try {
            Scanner odczyt = new Scanner(System.in);
            System.out.println("wprowadz liczbe 1 ");
            int a = odczyt.nextInt();
            System.out.println("wprowadz liczbe 2");
            int b = odczyt.nextInt();
            Dzielenie zad3 = new Dzielenie(a, b);
        } catch (ArithmeticException e) {
            System.err.println("nie dzieli sie przez 0");
        }
         */
//zad4
/*
        int licznik = 0;
        while (true) {
            try {

                int c = ThreadLocalRandom.current().nextInt(-10, 10 + 1); //stack
                int d = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
                Dzielenie zad4 = new Dzielenie(c, d);
            } catch (ArithmeticException e) {
                System.err.println("nie dzieli sie przez 0");
                licznik++;
                if (licznik == 3) {
                    System.out.println("Uwaga 3 razy 0 wystapilo");
                    System.exit(0);
                }
            }

        }
         */ WprowadzZKonsoli zad5 = new WprowadzZKonsoli();
         zad5.zapisz();
         zad5.wczytaj();
    }
}
