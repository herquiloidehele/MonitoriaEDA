/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa.exercicios;

/**
 *
 * @author herquiloidehele
 */
public class Exercicio1B {
    
    
    static int pesquisa(int array [], int chave, int tamanho){
        if(tamanho == -1)
            return -1;
        if(array[tamanho] == chave)
            return tamanho;
         return pesquisa(array, chave, tamanho-1);  
    }
 
    public static void main(String[] args) {
        System.out.println(pesquisa(new int [] {10, 3, 4, 100, 9, 8}, 8, 5));
    }
    
}
