/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.*; 
import java.lang.*;

public class LiebreThread implements Runnable
{
  public void run()
       {
int i=0;
System.out.println("Comienza la liebre.."); 
 while(i<5)
  {
        try
        {
            Thread.sleep(2000);  
            System.out.println("Liebre..");
         }
          catch(InterruptedException ex)
           {
           } 
     i++;
}
System.out.println("Termina la liebre");
          }
   }

