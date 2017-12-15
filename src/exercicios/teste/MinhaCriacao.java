/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.teste;

import java.util.Stack;

/**
 *
 * @author herquiloidehele
 */
public class MinhaCriacao {
    
    
    static String teste(int a){
        
       if(!(a<=1))
        return ("EDA é simples. \n" + teste(a-1));
       return "Eda é simples";
    }
    
    
    

    
    
    
    
    static int somaPilha(Stack<Integer> pilha, Stack<Integer> pilhaAux){
        
        if(pilha.empty()){
           devolverValores(pilha, pilhaAux);
           return 0;  
        }
        
        pilhaAux.push(pilha.peek());
        
        return pilha.pop() + somaPilha(pilha, pilhaAux);

    }
    
     static double mediaPilha(Stack<Integer> pilha, Stack<Integer> pilhaAux){
        
        return (double) somaPilha(pilha, pilhaAux)/pilha.size();

    }   
    
    static void devolverValores(Stack<Integer> pilha, Stack<Integer> pilhaAux){
        for(int numero: pilhaAux)
            pilha.push(numero);  
    }
    
    
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> pilhaAux = new Stack<>();
        pilha.add(12);
        pilha.add(14);
        
        System.out.println(mediaPilha(pilha, pilhaAux));
        System.out.println(pilha);
             
    }
    
}
