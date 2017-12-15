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
public class _TodosExercicios {

    /**
     * Metodo recursivo para calculo de Factorial
     *
     * @param n o valor a calcular
     * @return O factorial de n
     */
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    
    static int somaNaturais(int n){
        if (n==1)
            return 1;
        return n+somaNaturais(n-1);
    }
    
    static int potencia(int b, int e){  
        if(e==1)
            return b;
        return b * potencia (b,e-1);
    }
    
    
    static int comparar(int a, int b){
        if(a>b)
            return a;
        return b;
    }
    
    static int maiorElementoArray(int a[], int tamanho){
       if(tamanho == 0)
           return a[tamanho];
       return comparar(maiorElementoArray(a, tamanho-1), a[tamanho]);
    }
     
    
    static int teste1(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        else
            return teste1(n-1) + 2*teste1(n-2);
    }
    
    static void teste2(int n){
        if(n==0)
            System.out.println("Zero");
        else{
            System.out.println(n);
            teste2(n-1);
        }
    }
    
    
    
    static int multiplicacao(int a, int b){
        if(a==1)
            return b;
        return b + multiplicacao(a-1, b);
        
    }
    
    static double somaDivisao(double n){
        if(n==1)
            return 1;
        else
            return somaDivisao(n-1) + (1/n);                                                                                              
    }
    
    
    
    static int funcao(int n){
        return n==1 ? 1 : (n==2) ? 2 : 2*funcao(n-1) + 3*funcao(n-2);
    }
    
    
    static void numerosImpares(int n){
        if(n<0)
            return;
        imprimirNumerosImpares(n);
    }
    
    
    static void imprimirNumerosImpares(int n){
        if(n==1)
            return;
            
        if(n%2 != 0)
            System.out.println(n);
        imprimirNumerosImpares(n-1);
    }
    
 
    
    static String inverterNumero(String numero, int tamanho){
        if(tamanho==0)
            return String.valueOf(numero.charAt(tamanho));
        return String.valueOf(numero.charAt(tamanho)) + inverterNumero(numero, tamanho-1);
        
    }
    
     static int somaArray(int a[], int tamanho){
        if(tamanho-1==0)
            return a[tamanho-1];
        return a[tamanho-1] + somaArray(a, tamanho-1);
    }
    
     
     static int mdc(int x, int y){
         if(y==0)
             return x;
         return mdc(y, x%y);
     }
     
     static int padovan(int n){
         if(n>=0 && n<=2)
             return 1;
         return padovan(n-2) + padovan(n-3);
     }
     
    
    

    public static void main(String args[]) {
        
        for (int i=0; i<20; i++)
            System.out.print(padovan(i)+ ", ");
    }

}