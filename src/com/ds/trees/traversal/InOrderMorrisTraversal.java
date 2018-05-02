package com.ds.trees.traversal;
import com.ds.trees.utils.*;
import sun.tools.tree.BitAndExpression;

public class InOrderMorrisTraversal {

    Node root;
    void morrisTraversal(Node root){

        Node current, pre;

        if(root == null)
            return;

        current = root;
        while(current.left != null){

            if(current.left == null){
                System.out.print(current.data+" ");
                current = current.right;
            }

            else{
                //find the inorder predecessor of current
                pre = current.left;
                while(pre.right !=null && pre.right!=current){
                    pre = pre.right;
                }

                if(pre.right == null){
                    pre.right = current;
                    current = current.left;
                }

                /* Revert the changes made in if part to restore the original tree
                fix the right child of the preceds.x
                * */
                else{
                    pre.right = null;
                    System.out.print(current.data+" ");
                    current = current.right;
                    /* End of if condition pre-> right == NULL;*/
                }

            }
        }



    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("A");
        tree.root.left = new Node("B");
        tree.root.right = new Node("C");
        tree.root.left.left = new Node("D");
        tree.root.left.right = new Node("E");

        InOrderMorrisTraversal in = new InOrderMorrisTraversal();
        in.morrisTraversal(tree.root);
    }

}
