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
public class Exercicio4 {
    
    /**
     * funçåo recursiva para inverter os algorismos de um numero
     * @param numero numero para inverter
     * @param tamanho tamanho do  numero ou quantidade de algarismos
     * @return o numero invertido
     */
    static String inverterNumero(String numero, int tamanho){
        if(tamanho-1==0)
            return String.valueOf(numero.charAt(tamanho-1));
        return String.valueOf(numero.charAt(tamanho-1)) + inverterNumero(numero, tamanho-1);
        
    }
}
