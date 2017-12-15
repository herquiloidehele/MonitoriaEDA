/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLigada;

/**
 *
 * @author herquiloide
 */
public class TesteLista {
 
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adicionarNoFim(1);
        lista.adicionarNoFim(2);
        lista.adicionarNoFim(3);
        lista.adicionarNoFim(4);
//        lista.adicionarNoFim(5);
//        
    
        lista.inverterLista();
        
//        lista.removerFim();
//        lista.removerMeio();
//        lista.adicionarNoFim(6);
//        lista.adicionarNoFim(7);
        
//        lista.removerMeio();
        System.out.println(lista.toStringReverse());
        
        
    }
}
