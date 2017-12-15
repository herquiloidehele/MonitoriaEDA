/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLigada;

import java.util.ArrayList;
import java.util.EmptyStackException;
import javax.swing.JOptionPane;

/**
 *
 * @author herquiloidehele
 */
public class ListaLigada implements InterfaceLista{

    
    private Nodo primeiro;
    private Nodo ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }
    

    @Override
    public void adicionarNoInicio(Object objecto) {
        Nodo nodo = new Nodo(objecto);
        if(this.vazia()){
            this.primeiro = nodo;
            this.ultimo = nodo;
        }else{
            nodo.setProximo(this.primeiro);
            this.primeiro = nodo;
        }
        
        this.tamanho++;
    }

    @Override
    public void adicionarNoFim(Object objecto) {
        Nodo nodo = new Nodo(objecto);
        if(this.vazia()){
            this.adicionarNoInicio(objecto);
            tamanho--;
        }else{
            ultimo.setProximo(nodo);
            ultimo = nodo;
        }
        
        this.tamanho++;
    }

    @Override
    public void adicionarNaPosicao(Object object, int posicao) {
        if(posicao <0 || posicao >  this.tamanho())
            throw new IndexOutOfBoundsException("Indice Invalido");
        
            
    }

    @Override
    public Object removerNoInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object removerNoFim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object removerObjecto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contem(Object object) {
        Nodo nodo = primeiro;
        
        while(nodo != null){
            if(nodo.getObject().equals(object))
                return true;
            nodo = nodo.getProximo();
        }
        
        return false;
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public void limpar() {
        this.primeiro = null;
    }

    @Override
    public boolean vazia() {
        return tamanho == 0;
    }

    
    
    @Override
    public Object getObjecto(int posicao) {
        if(posicao <0 || posicao >  this.tamanho())
            throw new IndexOutOfBoundsException("Indice Invalido");
        
        Nodo nodo = this.primeiro;
        
       for (int i = 1; i <= posicao; i++)
           nodo = nodo.getProximo();
       
       return nodo.getObject();
    }
    
    
    
    public Object getObjectoReverse(int posicao) {
        if(posicao <0 || posicao >  this.tamanho())
            throw new IndexOutOfBoundsException("Indice Invalido");
        
        Nodo nodo = this.ultimo;
        
       for (int i = 1; i <= posicao; i++)
           nodo = nodo.getProximo();
       
       return nodo.getObject();
    }
    
    
    
    @Override
    public Nodo getNodo(int posicao) {
        if(posicao <0 || posicao >  this.tamanho())
            throw new IndexOutOfBoundsException("Indice Invalido");
        
        Nodo nodo = this.primeiro;
        
       for (int i = 1; i <= posicao; i++)
           nodo = nodo.getProximo();
       
       return nodo;
    }
    
    public Nodo getNodoReverse(int posicao) {
        if(posicao <0 || posicao >  this.tamanho())
            throw new IndexOutOfBoundsException("Indice Invalido");
        
        Nodo nodo = this.ultimo;
        
       for (int i = 1; i <= posicao; i++)
           nodo = nodo.getProximo();
       
       return nodo;
    }


    @Override
    public int getPosicao(Object objecto) {
        throw new UnsupportedOperationException("Metodo nao implementado ainda"); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void removerInicio() {
        if(this.vazia())
            throw new NullPointerException("A lista esta vazia");
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;     
    }
    

    @Override
    public void removerMeio() {
        
        if(this.vazia())
            throw new NullPointerException("A lista esta vazia");
        
        
        if(this.tamanho == 1)
            this.removerFim();
        if(this.tamanho == 2)
            this.removerInicio();
        else{
            int meio = this.tamanho/2;
            this.getNodo(meio-1).setProximo(this.getNodo(meio+1));    
        }
        this.tamanho--;
    }

    
    @Override
    public void removerFim() {
        if(this.vazia())
            throw new NullPointerException("A lista esta vazia");
        
        if(this.tamanho == 1){
            this.ultimo = null;
            this.primeiro = null;
        }else        
            this.ultimo = this.getNodo(this.tamanho-2);
        
        this.tamanho--;
   
    }

    
    public void inverterLista(){
        for(int i = this.tamanho() -1; i >=0; i--){
            if(i == 0){
                this.primeiro.setProximo(null);
                return;
            }
            this.getNodo(i).setProximo(this.getNodo(i-1));
        }
    }
    

    @Override
    public String toString() {
        String elementos = "[ ";

        for (int i = 0; i<this.tamanho(); i++){
            elementos+=(this.getObjecto(i)+ ", ");
        }
        
        return elementos+"]";
    }

    public String toStringReverse() {
        String elementos = "[ ";

        for (int i = 0; i<this.tamanho(); i++){
            elementos+=(this.getObjectoReverse(i)+ ", ");
        }
        
        return elementos+"]";
    }

    
}
