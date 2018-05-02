package com.ds.trees.traversal;

import com.ds.trees.utils.*;

public class Order {
    Node root;
    Order(String key){
        root = new Node(key);
    }



    static void preOrder(Node root){
        if(root!=null){
            System.out.print(" "+root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(" "+root.data);
            inOrder(root.right);
        }
    }

    static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" "+root.data);
        }
    }

    static void levelOrder(Node root){
        int h = height(root);
        for(int i=1;i<=h;i++){
            printGivenLevel(root,i);
            System.out.println();
        }
    }

//    Compute the height of the tree --- the number of nodes along the longest path from the root node to the farthest leaf node.
    static int height(Node root){
        if(root == null){
            return 0;
        }

        int lheihgt = height(root.left);
        int rheight = height(root.right);

        if(lheihgt > rheight)
            return (lheihgt+1);
        else return (rheight+1);

    }

    static void printGivenLevel(Node root, int level){
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.data+ " ");
        else
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    public static void main(String[] args){
        Order bTree = new Order("A");
        bTree.root.left = new Node("B");
        bTree.root.right = new Node("C");

        bTree.root.left.left = new Node("D");
        bTree.root.left.right = new Node("E");
        bTree.root.right.left = new Node("F");
        bTree.root.right.right = new Node("G");


        levelOrder(bTree.root);
    }
}
