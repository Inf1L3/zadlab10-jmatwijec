/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Dzielenie extends Exception {
    public Dzielenie(int a, int b){
        if (b == 0) {
        throw new ArithmeticException();
}
        else{
            System.out.println(a/b);
        }
    }
}
