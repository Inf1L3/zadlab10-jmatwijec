/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    public void wprowadzInt(){
        //https://stackoverflow.com/questions/12838346/possible-exception-if-user-enters-string-instead-of-int
        try{
        Scanner odczyt=new Scanner(System.in);
        System.out.println("wprowadz liczbe");
        int a= odczyt.nextInt();
        }
        catch(InputMismatchException e) {
       System.err.println("Entered value is not an integer");
        }
    }
}
