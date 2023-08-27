package javaList;

import java.util.*;

class Query {
    String function;
    List<Integer> items;

    public Query() {
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

    public void add(Integer item) {
        if(items == null) items = new ArrayList<>();
        items.add(item);
    }

    public int getIndex() {
        return items.get(0);
    }

    public int getValue() {
        return items.get(1);
    }
}


public class Solution {

    public static List<Integer> insert(List<Integer> list, int index, int element) {

        if(index >= list.size()) {
            list.add(element);
            return list;
        }

        list.add(0);
        for(int i = list.size()-1; i > index; i -- ) {
            list.set(i, list.get(i-1));
        }
        list.set( index, element);

        return list;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        List<Integer> l = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            l.add(sc.nextInt());
        }

        int q = sc.nextInt();

        List<Query> qe = new ArrayList<>();
        for(int i = 0 ; i< q ; i++ ) {
            sc.nextLine();
            Query t = new Query();
            t.setFunction(sc.nextLine());
            t.add(sc.nextInt());
            if(t.getFunction().equals("Insert"))  t.add(sc.nextInt());
            qe.add(t);
        }
        sc.close();

        for(int i=0;i<q ; i++)  {
            Query t = qe.get(i);
            int index = t.getIndex();

            if(t.getFunction().equals("Insert")) {

                l = insert(l, index, t.getValue());

            } else if(t.getFunction().equals("Delete")) {
                if(l.isEmpty() ) continue;

                l.remove(index);
            }
        }

        for(Integer ii : l ) {
            System.out.print(ii + " ");
        }

    }


}
