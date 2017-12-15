/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author herquiloidehele
 */
public class PilhasAPI {
    public static void main(String[] args) {



        Queue<String> fila = new LinkedList<String>();
        
        fila.offer("Hele");
        fila.offer("Deize");
        fila.offer("Mauricio");
        fila.offer("Loide");
        
        
        
        System.out.println(fila.remove());
        System.out.println(fila.toString());


    }
    
}
