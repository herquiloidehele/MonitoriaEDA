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
public class Exercicio8 {
    
    
    /**
     * funcao recursiva que imprime os elementos 
     * da serio de Padovan
     * @param n o n-esimo termo da sucessao
     * @return n-esemo elemento da sucessao
     */
    static int padovan(int n){
         if(n>=0 && n<=2)
             return 1;
         return padovan(n-2) + padovan(n-3);
     }
}
