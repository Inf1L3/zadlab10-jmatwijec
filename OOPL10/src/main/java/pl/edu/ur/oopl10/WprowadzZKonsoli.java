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
        BufferedReader br = new BufferedReader(new FileReader("cos.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
    }

    public void zapisz() throws FileNotFoundException, UnsupportedEncodingException {
        //stack
        try {
            PrintWriter writer = new PrintWriter("cos.txt", "UTF-8");
            Scanner odczyt = new Scanner(System.in);
            System.out.println("wprowadadz liczby zeby zapisac ");
            String a = odczyt.nextLine();
            writer.println(a);
        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziono pliku");
        }
    }
}
