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
public class Exercicio3 {
    
    
    /**
     * Funcao recursiva que quando introduzido um numero positivo 
     * retorna todos os numeros impares menores que ele caso contrario
     * a funçåo é interropida
     * @param n 
     */
    static void imprimirNumerosImpares(int n){
        if(n<0)
            return;
            
        if(n%2 != 0)
            System.out.println(n);
        imprimirNumerosImpares(n-1);
    }

}
