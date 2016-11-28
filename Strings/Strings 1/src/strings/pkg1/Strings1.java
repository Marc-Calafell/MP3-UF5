/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg1;

/**
 *
 * @author mark
 */
public class Strings1 {

    /**
     *
     * @param args
     */
    
    /*Falta poser el argument al projecte*/
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No hi ha cap argument.");
            
        }else if (!args[0].contains(".")){
            System.out.println("el numero no te decimals.");
            
        }else{
            String[] numero = args[0].split("\\.");
            System.out.println(numero[1].length());
        }

        if(args.length>0){
            int punt = args[0].indexOf('.');
            try {
                double d = Double.valueOf(args[0]);
                if (punt==-1) {
                    System.out.println("El número té 0 decimals.");
                
                } else { 
                    System.out.println("El número té "+(args[0].length()-punt-1)+" decimals.");
                
                }
                
            } catch (java.lang.NumberFormatException e){
                System.out.println("L'argument no és un número real.");
            
            }
            
        }
    }
    
}
