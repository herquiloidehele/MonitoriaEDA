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
public class Exercicio2A {
    
    
    /**
     * Funcao Recursiva que calcula a multiplicacao 
     * entre dois numeros
     * @param a
     * @param b
     * @return a multiplicacao de a e b
     */
    static int multiplicacao(int a, int b){
        if(a==1)
            return b;
        return b + multiplicacao(a-1, b);    
    }
}
