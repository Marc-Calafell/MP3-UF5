/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author mark
 */
public class Strings7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valid;
              
        
        do{
        System.out.println("Introdueix email: "); 
        String email = sc.next();

        Pattern patro = Pattern.compile("[\\w]+@[\\.\\w]+\\.\\w");

        Matcher matcher = patro.matcher(email);
        valid =matcher.find();
        
        
        } while (valid==false);
    
        System.out.println("El email es valid");
    
    }
    
}
