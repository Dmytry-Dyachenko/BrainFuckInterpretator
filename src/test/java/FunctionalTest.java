import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalTest {
    @Test
    public void testTheInterpretator(){
        BrainFuckInterpretator brainFuckInterpretator = new BrainFuckInterpretator();
        try {
            assertEquals("Strings isn`t equal","Come in",String.valueOf(brainFuckInterpretator.executeString("++++++++++[>+>+++>+++++++>++++++++++<<<<-]>>>---.>+++++++++++.--.--------.<<++.>>++++.+++++.")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            assertEquals("Strings isn`t equal","Spaghetti is too tasty",String.valueOf(brainFuckInterpretator.executeString("++++++++++[>+>+++>+++++++>++++++++++<<<<-]>>>+++++++++++++.>++++++++++++.<++++++++++++++.++++++.+.---.>++++..<++++.<++.>.>-.<<.>>+.-----..<<.>>+++++.<--------.>-.+.+++++.")));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
