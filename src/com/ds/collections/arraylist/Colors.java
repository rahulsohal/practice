package com.ds.collections.arraylist;

import java.util.*;

public class Colors {
    private static List<String> colorList = new ArrayList<>();

    public void setColor(String color){
        this.colorList.add(color);
    }

    public void iterate() {
        Iterator it = this.colorList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    //Insert Element at first position of an ArrayList
    public void insertAtFist(String color){
        this.colorList.add(0,color);
    }

    //Retreive element from specified position from an ArrayList
    public String retreiveFromPos(int pos){
        return colorList.get(pos);
    }

    // Update An Element specified by given Element
    public void replaceElem(int pos , String new_el){
        colorList.remove(pos);
        colorList.add(pos,new_el);
    }

    public boolean search(String el){
        Iterator it = this.colorList.iterator();
        while (it.hasNext()){
            if(it.next().equals(el))
                return true;
            else
                return false;
        }
        return false;
    }

    public List<String> sort(){
        Collections.sort(this.colorList);
        return colorList;
    }

    public static List<String> copy(List<String> list1) {
        list1 = new ArrayList<>();
        Collections.copy(colorList,list1);
        return list1;
    }

    // shuffle array list
    public List<String> shuffle(List<String> list2){
        Collections.shuffle(list2);
        return list2;
    }

    //reverse array list
    public List<String> reverse(List<String> list3){
        Collections.reverse(list3);
        return list3;
    }

    //Extract a portion of an array list
    //public

    public static void main(String[] args){
        Colors clr = new Colors();


        clr.setColor("Red");
        clr.setColor("Black");
        clr.setColor("Blue");

        System.out.println(colorList);

        // Iteration through the arraylist

        clr.iterate();
    }
}
