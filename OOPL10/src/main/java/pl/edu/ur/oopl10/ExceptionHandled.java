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
//https://way2java.com/exceptions/arrayindexoutofboundsexception-handling-java-example/
public class ExceptionHandled
{
  public ExceptionHandled()
  {
    int marks[] = { 40, 50, 60 };
    System.out.println("Hello 1");

    try
    {
      int m1 = marks[3];                          
      System.out.println("Marks are " + m1);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Do not cross size of array sir."  + e );
    }
    System.out.println("Hello 2");
    System.out.println("Hello 3");
  }
}  
