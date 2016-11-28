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
public class uniCapsa <T>{
    private T obj = null;
    
    public boolean add ( T obj){
        if(isfull()){
            return false;
        }
        
        this.obj = obj;
        return true;
    }
    
    public boolean isfull(){
        if(this.obj == null){
            return false;
        }
        
        return true;
    }
    
    public T get(){
        if(isfull()){
            return obj;
        }
        
        return null;
    }
    
    public boolean drain(){
        if(!isfull()){
            return false;
        }
        
        this.obj = null;
        return true;
    }
}
