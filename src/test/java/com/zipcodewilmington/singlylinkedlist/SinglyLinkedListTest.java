package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList sll=new SinglyLinkedList();
    @org.junit.Test
    public void add() {
        sll.add(9);
        sll.add(7);
        sll.add(5);
        sll.add(3);
        sll.add(1);
        sll.add(10);
        Assert.assertEquals(6, sll.size);
    }
    @org.junit.Test
    public void copyList() {
        sll.add(9);
        sll.add(7);
        sll.add(5);
        sll.add(3);
        sll.add(1);
        sll.add(10);
        LinkedList copyLL= sll.copyList();
        Assert.assertEquals(6, copyLL.size());
    }

    @org.junit.Test
    public void sort() {
        sll.add(9);
        sll.add(7);
        sll.add(5);
        sll.add(3);
        sll.add(1);
        sll.add(10);
        sll.sort();
        Assert.assertEquals(1, sll.get(0));
    }

    @org.junit.Test
    public void getSize() {
        sll.add(5);
        sll.add(3);
        sll.add(1);
        sll.add(10);
        Assert.assertEquals(4, sll.getSize());
    }

    @org.junit.Test
    public void get() {
        sll.add(3);
        sll.add(1);
        sll.add(10);
        Assert.assertEquals(3, sll.get(2));
    }

    @org.junit.Test
    public void find() {
        sll.add(3);
        sll.add(1);
        sll.add(10);
        Assert.assertEquals(2, sll.find(3));
    }

    @org.junit.Test
    public void contains() {
        sll.add(3);
        sll.add(1);
        sll.add(10);
        Assert.assertEquals(true, sll.contains(3));
    }


    @org.junit.Test
    public void remove() {
        sll.add(3);
        sll.add(1);
        sll.add(10);
        sll.remove(2);
        Assert.assertEquals(false, sll.contains(3));
    }
}
