/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    public void wprowadzInt() {
        //https://stackoverflow.com/questions/12838346/possible-exception-if-user-enters-string-instead-of-int
        try {
            Scanner odczyt = new Scanner(System.in);
            System.out.println("wprowadz liczbe");
            int a = odczyt.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Entered value is not an integer");
        }
    }

    public void wczytaj() throws FileNotFoundException, IOException {
        // https://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java
        try {
            FileReader file = new FileReader("tessst.txt");
            BufferedReader read = new BufferedReader(file);

            String st = read.readLine();
            while (st != null) {
                System.out.println(st);
                st = read.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("blad");
        }
    }

    public void zapisz() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //stack

        try {
            FileWriter fileWriter = new FileWriter("tessst.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Scanner odczyt = new Scanner(System.in);
            System.out.println("wprowadadz liczby zeby zapisac ");
            String a = odczyt.nextLine();
            printWriter.println(a);
            printWriter.close();
        } catch (FileNotFoundException e) {

            System.out.println("nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("blad");
        }
    }
}
