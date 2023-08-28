package java.javaSubarray;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i, j, k;
        int count = 0;
        int sum ;

        for(i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();


        for(i=0;i<n;i++){

            for(j=i;j<n;j++) {
                sum = 0;
                for(k = i;k <= j; k ++)
                    sum += a[k] ;
                if(sum < 0) count ++;
            }
        }

        System.out.println(count);

    }
}
