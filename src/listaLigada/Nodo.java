/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLigada;

/**
 *
 * @author herquiloidehele
 */
public class Nodo {
    
    private Object object;
    private Nodo proximo;

    public Nodo(Object object, Nodo proximo) {
        this.object = object;
        this.proximo = proximo;
    }
    
    public Nodo(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    
    
}
