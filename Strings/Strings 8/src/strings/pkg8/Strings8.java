/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg8;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author mark
 */
public class Strings8 {/*aquest es una millora del 6*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
          String text1,text2;
          
          
          System.out.println("Entra el primer text acabat en INTRO:");
          do {            
             text1 = entrada.nextLine().toLowerCase();
          } while (text1.isEmpty());
          
          System.out.println("Entra el segon text acabat en INTRO:");
           do {            
             text2 = entrada.nextLine().toLowerCase();
          } while (text2.isEmpty());
          
          text1 = Normalizer.normalize(text1, Normalizer.Form.NFD);
          text1 = text1.replaceAll("\\p{M}", "");

          text2 = Normalizer.normalize(text2, Normalizer.Form.NFD);
          text2 = text2.replaceAll("\\p{M}", "");
           
          Pattern pattern=null;
          try{
            pattern = Pattern.compile("\\p{Punct}|\\p{Space}");
          }catch(PatternSyntaxException e){            
            System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
          }
          
          text1 = pattern.matcher(text1).replaceAll("");
          text2 = pattern.matcher(text2).replaceAll("");

        
          char[] text1char = text1.toCharArray();
          char[] text2char = text2.toCharArray();
          
          Arrays.sort(text1char);
          Arrays.sort(text2char);
          
          if (Arrays.equals(text1char, text2char)) 
              System.out.println("Són anagrama.");
          else 
              System.out.println("NO són anagrama.");
    }
    
}
