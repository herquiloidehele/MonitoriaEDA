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
public class Exercicio7 {
    
    
    /**
     * funcao que retorna o mdc de dois numeros
     * @param x o primeiro numero
     * @param y o segundo numero
     * @return o mdc entre x ey
     */
    static int mdc(int x, int y){
         if(y==0)
             return x;
         return mdc(y, x%y);
     }
}
