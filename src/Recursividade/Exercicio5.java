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
public class Exercicio5 {
    
    
    static int somaArray(int a[], int tamanho){
        if(tamanho-1==0)
            return a[tamanho-1];
        return a[tamanho-1] + somaArray(a, tamanho-1);
    }
}
