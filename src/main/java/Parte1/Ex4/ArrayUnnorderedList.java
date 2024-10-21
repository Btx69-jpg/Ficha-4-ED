package Parte1.Ex4;

import Interfaces.UnorderedListADT;
import Parte1.Ex1.ArrayList;

public class ArrayUnnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {
    /**
     * Adiciona um elemento no inicio da lista
     *
     * @param element elemento a adicionar
     */
    @Override
    public void addToFront(T element) {
        if (element == null){
            throw new NullPointerException("Element cannot be null");
        }

        if (this.count == 0){
            this.list[this.count] = element;
        } else {
            openspace(0, element);
        }

        this.count++;
        this.last = this.count - 1;
        this.modCount++;
    }

    /**
     * Adiciona um elemento no fundo da lista
     *
     * @param element elemento a adicionar
     */
    @Override
    public void addToRear(T element) {

        if (element == null){
            throw new NullPointerException("Element cannot be null");
        }

        if (this.count == 0){
            this.list[this.count] = element;
        } else {

            this.list[this.count] = element;
        }

        this.count++;
        this.last = this.count - 1;
        this.modCount++;
    }

    /**
     * Adiciona um elemento após um elemento ja existente na lista
     *
     * @param element elemento a adicionar
     * @param target  elemento alvo que se deseja inserir o element após
     */
    @Override
    public void addAfter(T element, T target) {
        if (element == null){
            throw new NullPointerException("Element cannot be null");
        }

        for (int i = 0 ; i < this.count; i++){
            if (this.list[i].equals(target)){
                openspace(i+1, element);
                this.count++;
                this.last = this.count - 1;
                this.modCount++;
                return;
            }
        }

        throw new IllegalArgumentException("Element not found");
    }


}

