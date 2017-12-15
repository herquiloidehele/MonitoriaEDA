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
public class Exercicio2C {
    
    
    /**
     * Funcao recursiva para calcular a soma dos elementos da sucessao
     * 1 + 1/2 + 1/3 + ... + 1/n
     * @param n o n-esimo termo da sucessao
     * @return o resultado sa soma dos elementos da sucessao
     */
    static double somaDivisao(double n){
        if(n==1)
            return 1;
        else
            return somaDivisao(n-1) + (1/n);                                                                                              
    }
    
}
