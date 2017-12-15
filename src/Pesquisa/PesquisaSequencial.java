/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;

/**
 *
 * @author herquiloidehele
 */
public class PesquisaSequencial {
    
    
    static int pesquisa(int chave, int [] lista){
        for(int i = 0; i<lista.length; i++)
            if(lista[i] == chave)
                return i;
        return -1;
    }
    
    
    
    public static void main(String[] args) {
        
        int lista [] = {10, 19, 200, 7, 0, 3, 1, 3};
        
        System.out.println(pesquisa(7, lista));
        
        
        
        
    }
}
