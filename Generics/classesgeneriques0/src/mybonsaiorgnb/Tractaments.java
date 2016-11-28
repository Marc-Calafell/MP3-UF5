/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybonsaiorgnb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mark
 */
public class Tractaments <E> {/**/
   
    protected String descripcio;
    protected String motiu;
    protected int idBonsai;

    //Ho faig en un ArrayList per què vull es pogin repetir els tractaments en un mateix arbre;
    final private List<Tractaments> tipus = new ArrayList<>();

    
    /*constructor de la classe*/
    public Tractaments(String tipus, String descripcio, String motiu, int idBonsai) {
        this.descripcio = descripcio;
        this.motiu = motiu;
        this.idBonsai = idBonsai;
    }

    /*getters and setters*/
    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getMotiu() {
        return motiu;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }

    public int getIdBonsai() {
        return idBonsai;
    }

    public void setIdBonsai(int idBonsai) {
        this.idBonsai = idBonsai;
    }
    
    
    
 
}
