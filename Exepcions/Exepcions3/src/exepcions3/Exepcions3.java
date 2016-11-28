/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author mark
 */
public class Exepcions3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LlansaExcepcio exepcio = new LlansaExcepcio();
        
        exepcio.metode1();
        
        
    }
    
}

class LlansaExcepcio {

    private PrintWriter fitxer = null;

    void metode1() {
        metode2();
    }

    void metode2() {
        try {
            metode3();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat. " + e.getMessage());
        }
    }

    void metode3() throws FileNotFoundException {
        try {
            metode4();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    void metode4() throws FileNotFoundException {
        try {
            fitxer = new PrintWriter("c:/sortida.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }

    }
}
