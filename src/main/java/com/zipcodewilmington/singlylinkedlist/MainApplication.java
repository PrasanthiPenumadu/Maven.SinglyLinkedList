package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
public static void main(String [] args){
    SinglyLinkedList sll=new SinglyLinkedList();
    sll.add(9);
    sll.add(7);
    sll.add(5);
    sll.add(3);
    sll.add(1);
    sll.add(10);
    System.out.println(sll.getSize());
    sll.remove(3);
    System.out.println(sll.getSize());
    System.out.println(sll.get(3));
    System.out.println(sll.find(9));
    System.out.println(sll.contains(5));
    LinkedList cLL= sll.copyList();
    System.out.println(cLL.size());
     System.out.println(cLL.get(0));
    sll.printList();
    sll.sort();
}
}
