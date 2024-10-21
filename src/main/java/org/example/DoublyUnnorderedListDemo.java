package org.example;

import Parte1.Ex5.DoublyUnnorderedList;

public class DoublyUnnorderedListDemo {
    public static void main(String[] args){
        DoublyUnnorderedList<Integer> list = new DoublyUnnorderedList<>();
        list.addToFront(5);
        list.addToFront(4);
        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);
        list.addToRear(6);
        list.addAfter(7, 6);
        System.out.println("Removed element: " + list.remove(4));
        System.out.println("Removed element: " + list.remove(6));
        System.out.println("remove first: " + list.removeFirst());
        System.out.println("Remove last: " + list.removeLast());
        System.out.println("Removed element: " + list.remove(5));
        System.out.println("Removed element: " + list.remove(3));
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        System.out.println(list.contains(5));
        System.out.println(list.contains(6));
        System.out.println(list.contains(7));
        System.out.println(list.contains(8));
    }
}
