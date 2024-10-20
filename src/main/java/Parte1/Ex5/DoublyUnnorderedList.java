package Parte2.Ex3;

import Exceptions.ElementNotFoundException;
import Interfaces.UnorderedListADT;
import Parte1.Ex2.DoubleNode;
import Parte1.Ex2.DoublyLinkedList;

public class DoublyUnnorderedList<T> extends DoublyLinkedList<T> implements UnorderedListADT<T> {
    /**
     * Adiciona um elemento no inicio da lista
     *
     * @param element elemento a adicionar
     */
    @Override
    public void addToFront(T element) throws NullPointerException{

        if (element == null){
            throw new NullPointerException("Element cannot be null");
        }
        DoubleNode<T> newNode = new DoubleNode<>(element);

        if (this.first == null){

            this.first = newNode;
            this.count++;
            this.modCount++;
            return;

        }
        newNode.setNext(this.first);
        this.first.setPrevious(newNode);

        //condição de baixo BigO para caso so haja dois elementos na lista adicionar o novo elemento corrigindo o ultimo
        if (this.count == 1){
            this.last = this.first;
        }

        this.first = newNode;
        this.count++;
        this.modCount++;

    }

    /**
     * Adiciona um elemento no fundo da lista
     *
     * @param element elemento a adicionar
     */
    @Override
    public void addToRear(T element) throws NullPointerException {
        if (element == null){
            throw new NullPointerException("Element cannot be null");
        }
        DoubleNode<T> newNode = new DoubleNode<>(element);

        //last pode ser null caso não tenha sido utilizado nenhum outro metodo para adicionar
        if (this.last == null){

            this.last = newNode;
            this.count++;
            this.modCount++;
            return;

        }
        newNode.setPrevious(this.last);
        this.last.setNext(newNode);
        this.last.setPrevious(this.last.getPrevious());

        //condição de baixo BigO para caso so haja dois elementos na lista adicionar o novo elemento corrigindo o ultimo
        if (this.count == 1){
            this.first = this.last;
        }

        this.last = newNode;
        this.count++;
        this.modCount++;

    }

    /**
     * Adiciona um elemento após um elemento ja existente na lista
     *
     * @param element elemento a adicionar
     * @param target  elemento alvo que se deseja inserir o element após
     */
    @Override
    public void addAfter(T element, T target) throws NullPointerException, ElementNotFoundException {
        if (element == null){
            throw new NullPointerException("Element cannot be null");
        }
        for (DoubleNode<T> current = this.first; current != null; current = current.getNext()){
            if (current.getElement().equals(target)){
                DoubleNode<T> newNode = new DoubleNode<>(element);
                newNode.setNext(current.getNext());
                newNode.setPrevious(current);
                current.setNext(newNode);
                this.count++;
                this.modCount++;
                return;
            }
        }

        throw new ElementNotFoundException("Element not found");
    }
}
