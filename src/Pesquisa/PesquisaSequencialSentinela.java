/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;

import java.util.Arrays;

/**
 *
 * @author herquiloidehele
 */
public class PesquisaSequencialSentinela {
    
    
    /**
     * adiciona mais um elemento na ultima posicao 
     * da lista.
     * @param lista
     * @param chave
     * @return 
     */
    static int[] adicionar(int chave, int lista[]){
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista [lista.length -1] = chave;
        return lista;
    }
    
    
    /**
     * A vantagem da pesquisa sequencial com sentinela eh que nao
     * precisamos verificar se a lista ja atingiu o fim ou nao.
     * @param chave
     * @param lista
     * @return 
     */
    static int pesquisa(int chave, int [] lista){
        lista = adicionar(chave, lista);
        int i;
        for(i=0; lista[i] != chave; i++);
        
        if(i<lista.length-1)
            return i;
        return -1;
    }
    
    
    
    public static void main(String[] args) {
        
        int lista [] = {1, 19, 2, 7, 0,  1, 3};
        System.out.println(pesquisa(9000, lista));
        
    }
}
