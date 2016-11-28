/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxers2;

/**
 *
 * @author mark
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mark
 */
public class Fitxers2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    
        BufferedInputStream fitxer1 = new BufferedInputStream (new FileInputStream("fitxer1.txt"));
        BufferedInputStream fitxer2 = new BufferedInputStream (new FileInputStream("fitxer2.txt"));
        BufferedOutputStream fitxerSortida = new BufferedOutputStream (new FileOutputStream("bytes.txt"));
                

        int file1,file2;
       // String enter = "\n";
            
            
        while((file1=fitxer1.read()) != -1){
            fitxerSortida.write(file1);
                
            if('\n' == file1){
                while((file2=fitxer2.read()) != -1){
                    fitxerSortida.write(file2);
                    if('\n' == file2) break;
                    
                   }  
                }
            }
            while((file2=fitxer2.read()) != -1){
                       fitxerSortida.write(file2);
            }
            
    }
}    
    
