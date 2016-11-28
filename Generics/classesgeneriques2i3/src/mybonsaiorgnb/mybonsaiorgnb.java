/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybonsaiorgnb;


/**
 *
 * @author mark
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class mybonsaiorgnb {
    
    public static void main(String[] args) {
        MultiCapsa multiBox=new MultiCapsa(new ArrayList()); 
            multiBox.add("Alfa"); 
            multiBox.add("Beta"); 

            System.out.println((multiBox.isempty()?"buida":"no buida")); 
            System.out.println(multiBox.get()); 

            multiBox.del(); 

            System.out.println(multiBox.get()); 

            multiBox.del(); 
            System.out.println((multiBox.drain()?"buidada":"amb contingut")); 
            System.out.println((multiBox.isempty()?"buida":"no buida")); 

            
        multiBox=new MultiCapsa(new HashSet()); 
            multiBox.add("Alfa"); 
            multiBox.add("Beta"); 

            System.out.println((multiBox.isempty()?"buida":"no buida")); 
            System.out.println(multiBox.get()); 

            multiBox.del(); 
            System.out.println(multiBox.get()); 

            multiBox.del(); 
            System.out.println((multiBox.drain()?"buidada":"no buidada")); 
            System.out.println((multiBox.isempty()?"buida":"no buida")); 
            
 
        
    }}