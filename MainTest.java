package week2_0426;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.Assert.*;
import static week2_0426.Main.getResult;
import static week2_0426.Main.pushIntoStack;

public class MainTest {

    @Test
    public void test() {

        //input test cases
        ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("   the sky is blue   ");
        inputs.add("   the sky     is blue");
        inputs.add("   the sky     is blue");
        inputs.add("the sky is blue");

        //output
        String output = "blue is sky the";

        //test
        for (int i = 0; i < 4; i++) {
            Stack stack = pushIntoStack(inputs.get(i));
            assertEquals(output, getResult(stack));
        }



    }

    @Test
    public void testStack() {
        String input = "   the sky is blue   ";
        Stack stack = pushIntoStack(input);
        assertEquals("blue", stack.pop());
        assertEquals("is", stack.pop());
        assertEquals("sky", stack.pop());
        assertEquals("the", stack.pop());

    }
}