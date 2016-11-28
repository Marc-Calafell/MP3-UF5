/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybonsaiorgnb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mark
 */
public class mybonsaiorgnb {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
    
        System.out.print("entra la frase:\n");
        String frase = scan.nextLine();
        
        String afrase[]; 
        afrase = frase.split(" "); 
        String cpar[]; 
        
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        for(int i=0;i<afrase.length;i++){
            map.put(i, afrase[i]);
            
            for(int j=0;j<afrase.length;j++){
                if(afrase[i]==afrase[j]){
                    
                    
                }
                    
        }
 
    Iterator it = map.keySet().iterator();
    while(it.hasNext()){
        Integer key = (Integer) it.next();
        System.out.println("Clau: " + key + " -> Valor: " + map.get(key));
}
        
        
        
        
    }
    
    }
}
