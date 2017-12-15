/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;


/**
 *
 * @author herquiloidehele
 */
public class TestePilha {
    
    static String teste(int a){
       if(!(a<=1))
        return ("EDA é simples. \n" + teste(a-1));
       return "Eda é simples";
    }
 

    public static void main(String[] args) {
        
        
        
        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        pilha.push(70);

        
        pilha.pushNesimoInalte(4, "Teste");
        
        pilha.mostrar();
                
       
       
       
        
    }
}
