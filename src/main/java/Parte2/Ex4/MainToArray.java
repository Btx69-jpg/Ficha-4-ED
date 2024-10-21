package Parte2.Ex4;

import Parte1.Ex2.DoublyOrderedList;

public class MainToArray {
    public static void main(String[] args) {
        /**
         * method to To transform a doubly ordered list into an array
         * */
        DoublyOrderedList<Integer> list = new DoublyOrderedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        /*Integer[] array = list.toArray();

        for (Integer integer : array) {
            System.out.println(integer);
        }

         */
    }
}
