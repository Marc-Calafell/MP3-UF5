/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxers3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mark
 */
public class Fitxers3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {     
        BufferedReader fitxer1 = new BufferedReader (new FileReader("fitxer1.txt"));
        BufferedReader fitxer2 = new BufferedReader (new FileReader("fitxer2.txt"));
        PrintWriter fitxersortida = new PrintWriter (new FileWriter("bytes.txt"));

        String file1,file2;          

        while((file1=fitxer1.readLine()) != null && (file2=fitxer2.readLine()) != null){
            fitxersortida.println(file1);
            fitxersortida.println(file2);

        }

        if((file1=fitxer1.readLine()) != null){
            fitxersortida.println(file1);

            while((file1=fitxer1.readLine()) != null){
                fitxersortida.println(file1);
                
            }
            
        }
        if((file2=fitxer2.readLine()) != null){
            fitxersortida.println(file2);

            while((file2=fitxer2.readLine()) != null){
                fitxersortida.println(file2);
                
            }
        }
    }
}    
    
