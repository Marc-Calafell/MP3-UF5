/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author mark
 */
public class Strings5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner llegeix = new Scanner(System.in);
        String frase;

        System.out.println("Introdueix un text:");
        do {
            frase = llegeix.nextLine().trim();
            
        } while (frase.isEmpty());

        Pattern patro = Pattern.compile("\\B.|\\p{Punct}|\\p{Space}");
        frase = patro.matcher(frase).replaceAll("");
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("La paraula Nº "+ i + " comensa per " +frase.charAt(i));
        }

    }
    
}
