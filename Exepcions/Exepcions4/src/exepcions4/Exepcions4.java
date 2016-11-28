/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions4;

import java.io.EOFException;
import java.io.IOException;

/**
 *
 * @author mark
 */
public class Exepcions4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EOFException, IOException {
           Fill son = new Fill();
           son.method1();
            Pare father = new Pare ();
            father.method1();
    }
}

class Pare{

    public void method1() 
            throws IOException
    {}
   
}


class Fill extends Pare{

    @Override

    public void method1() 
            throws EOFException
    {}
    

}
