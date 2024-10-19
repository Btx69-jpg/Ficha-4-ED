package org.example;

import Parte1.Ex1.ArrayOrderedList;

public class ArrayOrderedListDemo {
    public static void main(String[] args) {
        ArrayOrderedList<Integer> list = new ArrayOrderedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        System.out.println("First element:" + list.first());
        System.out.println("Last element:" + list.last());

        System.out.println("removed element:" + list.remove(2));

        System.out.println(list);

        list.add(2);

        System.out.println(list);
    }
}
