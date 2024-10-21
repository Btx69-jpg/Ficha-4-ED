package org.example;

import Parte1.Ex4.ArrayUnnorderedList;

public class ArrayUnnorderedListDemo {
    public static void main(String[] args)
    {
        ArrayUnnorderedList<Integer> list = new ArrayUnnorderedList<>();
        list.addToFront(5);
        list.addToFront(4);
        list.addToFront(3);

        list.addToFront(2);
        list.addToFront(1);
        System.out.println("Size: " + list.size());
        System.out.println("First element:" + list.first());
        System.out.println("Last element:" + list.last());
        System.out.println("removed element:" + list.remove(2));
        System.out.println(list);
        list.addToFront(2);
        System.out.println(list);
        list.addToRear(6);
        System.out.println(list);
        list.addAfter(7, 6);
        System.out.println(list);
    }
}
