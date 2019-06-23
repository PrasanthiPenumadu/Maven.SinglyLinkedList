package com.zipcodewilmington.singlylinkedlist;


import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */

public class SinglyLinkedList {
 Node root;
 int size;
public SinglyLinkedList() {
    root = new Node();
    size = 0;
}

    public LinkedList copyList(){
    LinkedList cLL=new LinkedList<Integer>();
    Node thisNode=this.root;
    while(thisNode.next!=null){
        cLL.add(thisNode.data);
        thisNode=thisNode.next;
    }return cLL;
    }

public  void sort(){
    Node thisNode=this.root;
    System.out.println();
    System.out.print("List Elements in Sorting Order : ");
    for(int i=0;i<size-1;i++){
        if (thisNode.data > thisNode.next.data) {
            int temp = thisNode.data;
            thisNode.setData(thisNode.next.data);
            thisNode.next.setData(temp);
        }  System.out.print(" "+thisNode.data);
        thisNode = thisNode.next;
            }System.out.print(" "+thisNode.data);
}

    public  void printList(){
        Node thisNode=this.root;
        System.out.print("List Elements: ");
        while(thisNode.next!=null){
            System.out.print(" "+thisNode.data);
            thisNode=thisNode.next;
        }
    }
    public int getSize() {
        return this.size;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public  Node add(int data){
    Node newNode=new Node(data,root);
    this.root=newNode;
    this.size++;
    return newNode;
    }
    public int get(int index){
    Node thisNode=this.root;
        for(int i=0;i<index;i++){
            thisNode=thisNode.next;
        } return thisNode.data;
    }
    public int find(int n){
        Node thisNode=this.root;
        int index=0;
        while(thisNode.next!=null){
            thisNode=thisNode.next;
            index++;
            if(thisNode.getData()==n){
                return index;}
        }return -1;
    }

    public boolean contains(int data) {
        Node thisNode = this.root;
        while (thisNode.next != null) {
            thisNode=thisNode.next;
            if (thisNode.getData() == data)
                return true;
        }return false;
    }

    public void remove(int index){
        Node thisNode=this.root;
      for(int i=0;i<index-1&&thisNode.next!=null;i++){
          thisNode=thisNode.next;
      }thisNode.next=thisNode.next.next;
      this.size--;
    }


    public  class Node {

protected Node next;
private int data;

public Node(){}

public Node(int val){
    data=val;
}
public Node(int val,Node next){
    this.data=val;
    this.next=next;
}

     public Node getNext() {
         return this.next;
     }

     public void setNext(Node n) {
         this.next = n;
     }

     public int getData() {
         return this.data;
     }

     public void setData(int val) {
         this.data = val;
     }
 }
}

