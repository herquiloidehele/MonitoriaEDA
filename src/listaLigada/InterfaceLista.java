/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLigada;
import java.util.LinkedList;

/**
 *
 * @author herquiloidehele
 */
public interface InterfaceLista {
    
    
    
    public void adicionarNoInicio(Object objecto);
    public void adicionarNoFim(Object objecto);
    public void adicionarNaPosicao(Object object, int posicao);
    public Object getObjecto(int posicao);
    public int getPosicao(Object objecto);
    public Object removerNoInicio();
    public Object removerNoFim();
    public Object removerObjecto(Object object);
    public boolean contem(Object object);
    public int tamanho();
    public void limpar();
    public boolean vazia();
    public Nodo getNodo(int posicao);
    public void removerInicio();
    public void removerMeio();
    public void removerFim();
    
}
