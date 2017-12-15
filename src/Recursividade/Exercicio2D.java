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
public class Exercicio2D {
    
     
    /**
     * Funcao recursiva para gerar os elementos da sucessao:
     * 
     * F(1)=1
     * F(2)=2
     * F (n) = 2*F(n-1) + 3*F(n-2)
     * 
     * Uso de Operador ternario para resolucao do exercicio
     * 
     * 
     * @param n o n-esimo termo da sucessao
     * @return O n-esomo elemento da sucessao
     */
    static int funcao(int n){
        return n==1 ? 1 : (n==2) ? 2 : 2*funcao(n-1) + 3*funcao(n-2);
    }
    
}
