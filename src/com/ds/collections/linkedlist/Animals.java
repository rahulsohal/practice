package com.ds.collections.linkedlist;

import java.util.*;


public class Animals {
    private List<String> animList = new LinkedList();

    public void append(String el){
        this.animList.add(el);
    }

    public void iterate(){
        Iterator it = this.animList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    // Iterate through linked list starting from specific pos
    public void iterateFromPos(int pos){
        Iterator it = this.animList.listIterator(pos);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

/******************* Using node ********************* */



    public static void main(String[] args){
        List<String> list1 = new LinkedList();

        Animals an = new Animals();

        an.append("Deer");
        an.append("Elephant");
        an.append("Lion");
        an.append("Dog");

        an.iterate();

        an.iterateFromPos(2);
    }

}
