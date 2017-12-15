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
public class InsertionSort {
    
    
    
    
    static int [] insertionSort(int array[]){
        
        for(int i = 1; i<array.length; i++){
            for(int j = i; j>0; j--){
                if(array[j]<array[j-1]){
                    int aux = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux;
                }else
                    break;
            }
        }
        
        return array;
    }
    
    
    
    public static void main(String[] args) {
        for(int a : insertionSort(new int [] {3,1, 0, 5, -2, 99, 200}))
            System.out.println(a);
    }
}
