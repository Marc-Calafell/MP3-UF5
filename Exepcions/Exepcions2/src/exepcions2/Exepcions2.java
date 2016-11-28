/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mark
 */
public class Exepcions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
                    
        LlistaDeNumeros2 llista = new LlistaDeNumeros2();
        llista.readList("filename.txt");
        llista.writeList("filefail.txt");
        
    }
    
}


class LlistaDeNumeros2 {

    private List<Integer> list;

    private static final int SIZE = 10; 

    public LlistaDeNumeros2 () {

        list = new ArrayList<Integer>(SIZE);

        for (int i = 0; i < SIZE; i++) {

            list.add(new Integer(i));

        }

    }

    public void writeList(String fileName) {
        
        PrintWriter out = null;
        try{
            out= new PrintWriter(new FileWriter(fileName));
        for (int i = 0; i < SIZE; i++) {

            out.println("Value at: " + i + " = " + list.get(i));

        }
        
        out.println(list.get(SIZE));
        
        }catch (IOException e){
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println("S'està accedint a un lloc que no existeix. " + e.getMessage());
        }finally{
            if(out!=null)
                out.close();
        }

        

    }

    public void readList(String fileName) {

        String line = null;

        RandomAccessFile raf = null;
        
        try{
            raf = new RandomAccessFile(fileName, "r");

            while ((line = raf.readLine()) != null) {

                Integer i = new Integer(Integer.parseInt(line));

                System.out.println(i); list.add(i);

            }
        }catch(FileNotFoundException e){
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("El format no és correcte. "+e.getMessage());
        }finally {
            
            try{
                if (raf != null) raf.close();
            }catch(IOException e){
               System.out.println("Hi ha hagut un error: " + e.getMessage());
            }      
        
        }
         

    }

}
