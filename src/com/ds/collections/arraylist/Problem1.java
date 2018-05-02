package com.ds.collections.arraylist;

import java.util.*;

public class Problem1 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter no of inputs");
        input = sc.nextInt();

        int queries[] = new int[input];
        String query[] = new String[input];
        for(int i=0;i<input;i++) {
            System.out.println("Enter no of queries");
            queries[i] = sc.nextInt();
            query[i] = sc.nextLine();
            sc.next();
        }

        for(int j=0;j<input;j++){
            List<Integer> list = new ArrayList();
            String q = query[j];
            int l = 0;
            int num;
            int loop=0;
            while(q.charAt(l)!='\0'){
                System.out.print("Entering loop "+ loop++ + "times");
                if(q.charAt(l) == 'a'){
                    num = q.charAt(l+2);
                    l = l+2;
                    list.add(num);
                }
                else if(q.charAt(l) == 'b'){
                    Collections.sort(list);
                    l=l+2;
                }
                else if(q.charAt(l) == 'c'){
                    Collections.reverse(list);
                    l=l+2;
                }
                else if(q.charAt(l) == 'd'){
                    System.out.println(list.size());
                    l=l+2;
                }
                else if(q.charAt(l) == 'e'){
                    Iterator it = list.iterator();
                    while(it.hasNext()){
                        System.out.print(" ");
                        System.out.print(it.next());
                    }
                    l=l+2;
                }
                else if(q.charAt(l) == 'f'){
                    l= l+2;
                    Collections.sort(list,Collections.reverseOrder());
                }
                else if(q.charAt(l) == ' ')
                {
                    l++;
                }
                else{
                    System.out.println("Not a valid option ");
                    l=l+2;
                }



            }

        }
    }
}
