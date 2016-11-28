/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybonsaiorgnb;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author mark
 */
public class MultiCapsa <E>{
    private Collection<E> info;
    
    
    public MultiCapsa(Collection<E> implem){
        info = implem;
    }
      
    public void add ( E elem){
        info.add(elem);
        
    }
    
     public boolean isempty(){   
        return info.isEmpty();
        
    }
    
    public E get(){
        if(isempty()) {
            return null;
            
        }
        
        Iterator<E> it = info.iterator();
        return it.next();
        
    }
    
    public boolean drain(){
        try{
            info.clear();
            return true;
            
        } catch (Exception e){
            return false;
            
        }
    }
    
    public boolean del(){
        Iterator<E> it = info.iterator();
        return info.remove(it.next());
    }
    
    
}