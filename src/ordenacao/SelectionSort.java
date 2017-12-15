/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author herquiloidehele
 */
public class SelectionSort {
    
    
    
    static int [] ordenacao(int [] array){
        
        for(int i = 0; i<array.length-1; i++){
            int menor = i;
            for(int j = i+1; j<array.length; j++)
                if(array[menor] > array[j])
                    menor = j;
            
            int aux = array[menor];
            array[menor] = array[i];
            array[i] = aux;
        }
        
        return array;
    }
    
    
    public static void main(String[] args) {
        int array[] = ordenacao(new int [] {90,4, -8,0,11, 2, 6666,6});
        
        for (int a : array){
            System.out.println(a);
        }
        
    }
    
    
}
