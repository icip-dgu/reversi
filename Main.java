package week2_0426;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack stack = pushIntoStack(input);
        String result = getResult(stack);
        System.out.println(result);
        scanner.close();
    }

    // push words into stack
    public static Stack pushIntoStack(String input) {

        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < input.length(); i++) {

            // not word
            if (input.charAt(i) == ' ') {
                continue;
            }

            // word
            String word = "";
            for (int j = i; input.charAt(j) != ' '; j++) {
                word += input.charAt(j);
                if (j + 1 == input.length()) {
                    break;
                }
            }

            // stack
            stack.push(word);
            i += word.length();
        }

        return stack;
    }

    //print result string
    public static String getResult(Stack stack) {
        int stackSize = stack.size();
        String result = "";
        for (int i = 0; i < stackSize; i++) {
            if (i + 1 == stackSize) {
                result += stack.pop();
            } else {
                result += stack.pop() + " ";
            }
        }
        return result;

    }

}
