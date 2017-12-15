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
public class Exercicio1B {
     
    
    static void teste2(int n){
        if(n==0)
            System.out.println("Zero");
        else{
            System.out.println(n);
            teste2(n-1);
        }
    }
}
