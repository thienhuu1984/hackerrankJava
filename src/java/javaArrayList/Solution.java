package java.javaArrayList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int i,j, d, q;
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();


        for(i=0;i<n;i++) {
            d = sc.nextInt();
            ArrayList<Integer> t = new ArrayList<>();
            for(j=0;j<d; j ++ ) {
                t.add(sc.nextInt());
            }
            a.add(t);

        }

        q = sc.nextInt();
        for(i=0;i<q; i ++ ) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(sc.nextInt());
            t.add(sc.nextInt());
            x.add(t);
        }

        sc.close();

        for(i = 0 ; i < q; i ++ ) {
            ArrayList<Integer> t = x.get(i);
            if(a.size() < t.get(0))
                System.out.println("ERROR!");
            else {
                ArrayList<Integer> ta = a.get(t.get(0)-1);
                if(ta.size() < t.get(1)) System.out.println("ERROR!");
                else System.out.println(ta.get(t.get(1)-1));
            }
        }
    }
}