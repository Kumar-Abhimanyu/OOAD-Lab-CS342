package SublitCode;
import java.util.*;
public class Bracket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        sc.nextLine(); // Consume the newline character after numTests

        for (int i = 0; i < numTests; i++) {
            String input = sc.nextLine();
            System.out.println(isBalanced(input) ? "Yes" : "No");
        }
    }

    public static boolean isBalanced(String input){
        Stack<Character> st = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') 
            {
                if (st.isEmpty()) 
                {
                    return false;
                }

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}