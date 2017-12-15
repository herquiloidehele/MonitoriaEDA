/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

/**
 *
 * @author herquiloide
 */
public class Exercicio1A {
    
    
    /**
     * Para entrada 6 a saida eh 43
     * @param n
     * @return 
     */
    static int teste(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        else
            return teste(n-1) + 2*teste(n-2);
    }
}
