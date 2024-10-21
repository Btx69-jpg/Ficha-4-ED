package org.example;

import CLASS.NotComparable;
import Parte1.Ex2.DoublyOrderedList;

import java.util.Arrays;

public class DoublyOrderedListDemo {
    public static void main(String[] args)
    {


        DoublyOrderedList <String> list = new DoublyOrderedList<>();
        list.add("2");
        list.add("1");
        list.add("3ilguhuighui");
        list.add("4");
        list.add("5");

        System.out.println(list.size());
        System.out.println("First element:" + list.first());
        System.out.println("Last element:" + list.last());

        System.out.println("removed element:" + list.remove("2"));

        System.out.println(list);

        System.out.println("Inverted List" + Arrays.toString(list.Invert()));

        /*
        DoublyOrderedList<NotComparable> list = new DoublyOrderedList<>();

        list.add(new NotComparable());
        list.add(new NotComparable());
        list.add(new NotComparable());
        list.add(new NotComparable());

        System.out.println(list.size());

        System.out.println(list);
        list.remove(new NotComparable());

         */


    }

}
