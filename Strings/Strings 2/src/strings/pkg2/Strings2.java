/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.pkg2;

import java.util.Scanner;

/**
 *
 * @author mark
 */
public class Strings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner llegeix = new Scanner (System.in);
            
        boolean trobat = true;
        
        System.out.println("Escriu el text en el que buscar");
        String frase = llegeix.nextLine();
                
        String caracter;
        do{
            System.out.println("Quin caracter vols buscar?");
            caracter = llegeix.nextLine();
        
        }while(caracter.isEmpty());
            char patro = caracter.charAt(0);
        
        int majus;
        
        do {
            System.out.println("Vols distingir entre majúscules i minúscules? (S/N)");
            char resposta;
            
            try {
                resposta = llegeix.nextLine().trim().toUpperCase().charAt(0);
                
            }catch (StringIndexOutOfBoundsException e){
                resposta = 'C';
                
            }
            
            majus = "SN".indexOf(resposta);
            
        }while (majus == -1);

        int comensar;
        do {
            System.out.println("Vols buscar de dreta a esquerra o d'esquerra a dreta?[E/D]");
            char resposta = llegeix.nextLine().trim().charAt(0);
            comensar = "ED".indexOf(resposta);
        } while (comensar == -1);
        
        if(majus==1) {
            frase = frase.toLowerCase();
            patro = Character.toLowerCase(patro);
        }
        
        if (comensar == 1){
            for (int i = 0; i != -1;) {
                i= frase.indexOf(patro, i);
                if(i != -1) {
                    trobat=false;
                    System.out.println("La lletra \""+ patro + "\" es troba a la posició "+ i);
                    i++;
                }
            }
        }else {
            for (int i = frase.length(); i != -1;) {
                i= frase.lastIndexOf(patro, i);
                if(i != -1) {
                    trobat = false;
                    System.out.println("["+ patro +"]=>"+ i);
                    i--;
                }
            }
        }
        
        if(trobat) System.out.println("el patro [" + patro + "] no apareix en el text");
        
  
    }
    
}
