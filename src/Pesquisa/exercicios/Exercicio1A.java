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
public class Exercicio1A {
    
    
    static int pesquisa(int array [], int chave){
        for(int i = 0; i<array.length; i++)
            if(array[i] == chave)
                return i;
        return -1;
    }
    
    
    
    public static void main (String args []){
        System.out.println(pesquisa(new int [] {1, 4, 5, 1, 5}, 5));
    }
    
}
