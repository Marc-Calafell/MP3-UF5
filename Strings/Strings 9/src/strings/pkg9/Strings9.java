/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg9;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author mark
 */
public class Strings9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        String text;
        
       System.out.println("Introduix un text. Acabat en INTRO:");
        do {
            text = entrada.nextLine().toLowerCase();
        } while (text.isEmpty());
        
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        text = text.replaceAll("\\p{M}", "");
        
        Pattern pattern = null;
        try {
            pattern = Pattern.compile("(^\\w+)\\W+(\\w+)\\W+(\\w+).+\\3\\W+\\2\\W+(\\1)$");
        } catch (PatternSyntaxException e) {
            System.out.println("Error a l'expressió regular: " + e.getDescription() + "\nTorna-ho a provar.");
        }
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()) System.out.println("El text complix el patró!");
        else System.out.println("El text NO complix el patró!");
    }
    
}
