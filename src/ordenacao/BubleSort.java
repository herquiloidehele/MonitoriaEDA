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
public class BubleSort {
    
    
    static int[] bubleSort(int array[]){
        
        for(int i = 0; i<array.length; i++)
            for(int j = i+1; i<array.length; i++){
                if(array[i] > array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
        } 
        return array;
    }
    
    public static void main(String[] args) {
        for (int a : bubleSort(new int [] {3, -2, 1, 5, 10, 5}))
            System.err.println(a);
            
    }
    
}
