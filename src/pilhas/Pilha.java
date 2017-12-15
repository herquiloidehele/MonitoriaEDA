
package pilhas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author herquiloidehele
 */
public class Pilha implements Pilhable{

    
    public Object [] elementos;
    public int quantidade = 0;
    private final int DEFAULT_INICIAL_CAPACITY = 2; 

    public Pilha() {
        elementos = new Object[DEFAULT_INICIAL_CAPACITY];
    }
    
    
    
    /**
     * Adiciona um determindo Elemento no topo da pilha
     * @param objecto
     * @return 
     */
    @Override
    public Object push(Object objecto) {
        elementos[quantidade] = objecto;
        quantidade++;
        aumentarCapacidade();
        return objecto;
    }

    
    /**
     * Remove o elemento que se localiza no topo da pilha
     * @return 
     */
    @Override
    public Object pop() {
        if(quantidade > 0){
            Object objecto = this.peek();
            elementos[quantidade-1] = null;
            quantidade--;
            return objecto;
        }
        return null;
    }

    
    /**
     * Retorna o elemento que se encontra no topo da pilha
     * @return 
     */
    @Override
    public Object peek() {
        return elementos[quantidade-1];
    }

    /**
     * Verifica se a pilha esta ou nao vazia
     * @return 
     */
    @Override
    public boolean empty() {
        return quantidade ==0;
    }

    
    /**
     * Retorna a posicao de um determindo elemento da pilha
     * baseando do elemento que se encontra no topo da pilha.
     * @param objecto
     * @return 
     */
    @Override
    public int search(Object objecto) {
        int posicao = -1;
        for(int i = 0; i<quantidade; i++){
            if(elementos[i] == objecto){
                posicao = i;
                return quantidade - posicao;
            }
        }
        return posicao;        
    }

      
    /**
     * Aumenta a capacidade do array quando estiver cheio
     */
    private void aumentarCapacidade(){
        if(quantidade == elementos.length)
            elementos = Arrays.copyOf(elementos, quantidade + DEFAULT_INICIAL_CAPACITY);
    }

    @Override
    public void pushNesimoAlte(int n, Object object) {
        for (int i = 1; i<n; i++){
            this.pop();
        }
        this.push(object);
        
    }

    @Override
    public void pushNesimoInalte(int n, Object object) {
        ArrayList<Object> elementos = new ArrayList<>();
        
        for (int i = 1; i<n; i++)
            elementos.add(this.pop());
       

        this.push(object);
            
        for (int i=elementos.size()-1; i >= 0; i--)
            this.push(elementos.get(i));      
    }

    
    public void mostrar() {

        for(Object elemento: elementos)
            System.out.println(elemento);
    }
    
    
    
    
 
}
