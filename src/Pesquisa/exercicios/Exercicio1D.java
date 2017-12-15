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
public class Exercicio1D {
    
    
    
    private static int pesquisa (int array [], int chave){
        int inicio = 0;
        int fim = array.length;
        int meio = (inicio+fim)/2;
        return pesquisa(array, chave, inicio, fim, meio);
    }
    
    
    static int pesquisa(int array [], int chave, int inicio, int fim, int meio){
        if (inicio>fim)
            return -1;
        if(array[meio] == chave)
            return meio;
        else
            if(chave > array[meio])
                inicio = meio + 1;
            else
                fim = meio - 1;
        meio = (inicio + fim)/2;
        return pesquisa(array, chave, inicio, fim, meio);
    }
    
    
    public static void main(String[] args) {
        System.out.println(pesquisa(new int [] {10, 20, 30, 40, 50, 60}, 200));
    }
}
