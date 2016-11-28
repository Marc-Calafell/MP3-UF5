/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mark
 */
public class Strings6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
          String text1,text2;

          System.out.print("introdieix el primer text: ");
          do {            
             text1 = entrada.nextLine().toLowerCase();
             
          } while (text1.isEmpty());
          
          System.out.print("introdueix el segon text: ");
          text2 = entrada.nextLine().toLowerCase();

          char[] text1char = text1.toCharArray();
          char[] text2char = text2.toCharArray();
          
          Arrays.sort(text1char);
          Arrays.sort(text2char);
          
          if (Arrays.equals(text1char, text2char)) 
              System.out.println(text1+" es anagramma de "+text2);
          
          else 
               System.out.println(text1+" NO es anagramma de "+text2);

    }
    
}
