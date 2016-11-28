/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings3;

import java.util.Scanner;

/**
 *
 * @author mark
 */
public class Strings3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String text;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introdueix un text :");
        text = entrada.nextLine().toLowerCase();
        
        StringBuilder A = new StringBuilder(text);
        
        String B =A.reverse().toString();
        
        if(text.equals(B))System.out.println("El text introduït és palíndrom");
        else System.out.println("El text introduït NO és palíndrom");
        
        
    }
    
}
