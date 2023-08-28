package java.javaStack;

import java.util.*;

public class Solution {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            String input=sc.nextLine();

            System.out.println(result(input));


        }

    }

    public static boolean result(String input) {


        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < input.length(); i++ ) {
            char c= input.charAt(i);
            if ( c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{' )
                stack.pop();
            else  if(c == ')' && !stack.isEmpty() && stack.peek() == '(' )
                stack.pop();
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[' )
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
