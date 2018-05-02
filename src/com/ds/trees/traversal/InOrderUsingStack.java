package com.ds.trees.traversal;

import java.util.Stack;
import com.ds.trees.utils.*;

public class InOrderUsingStack {

    Node root;

    void inOrder(Node root) {

        Stack<Node> stack = new Stack<>();
        Node node = root;

        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        while(stack.size() > 0 )
        {

            //visit the node

            node = stack.pop();
            System.out.print(node.data + " ");

            if (node.right != null) {
                node = node.right;

                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }

    }

    public static void main(String args[]){
        InOrderUsingStack in = new InOrderUsingStack();
        Node n  = new Node("A");
        n.left = new Node("B");
        n.right = new Node("C");
        n.left.left = new Node("D");
        n.left.right = new Node("E");

        in.inOrder(n);

    }
}
