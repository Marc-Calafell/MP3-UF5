/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mark
 */
public class Exepcions1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LlistaDeNumeros1 llista=new LlistaDeNumeros1();
      
      llista.readList("Fixer-que-no-esta.txt");
       
      llista.writeList("asd.txt");
      llista.readList("1234.txt");
       
      llista.writeList("fileio.txt");
      llista.readList("fileio.txt");
        
        
    }
    
}


class LlistaDeNumeros1 {

    private List<Integer> list;
    private static final int SIZE = 10; 

    public LlistaDeNumeros1 () {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);

        }

    }

    @SuppressWarnings("empty-statement")
    public void writeList(String fileName) {
        
        try{
            PrintWriter out = new PrintWriter(new FileWriter(fileName));
            for (int i = 0; i < SIZE; i++) {
                System.out.println("Value at: " + i + " = " + list.get(i));

            }

        }catch(IOException error){
            System.out.println("Error:");
        
        }finally{
            if(out!=null)
                out.close();
        }


    }

    public void readList(String fileName) {
        RandomAccessFile raf= null;
        String line = null;
        
        try{
            raf = new RandomAccessFile(fileName, "r");
       
            while ((line = raf.readLine()) != null) {
                Integer i = new Integer(Integer.parseInt(line));
                System.out.println(i); list.add(i);
            } 
        
        }catch(FileNotFoundException error){
             System.out.println("Error:");

        }catch(IOException error){
            System.out.println("Error:");
        }finally {
        
            try{
                raf.close();
                
            }catch(IOException error){
                System.out.println("Error:");
                
            }   
        }
    }
}
