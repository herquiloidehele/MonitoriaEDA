/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;

/**
 *
 * @author herquiloidehele
 */
public class PesquisaBinaria {
    
    static int pesquisa(int chave, int lista []){
        int inicio = 0;
        int fim = lista.length;
        int meio = (inicio + fim)/2;
        
        while(inicio<fim){

            if(chave == lista [meio])
                return meio;
            else
                if(chave > lista[meio])
                    inicio = meio;
                else
                    fim = meio;
                meio = (inicio + fim)/2;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int lista [] = {10, 20, 30, 40, 50, 60};
        
        System.out.println(pesquisa(30, lista));
         
    }
}
