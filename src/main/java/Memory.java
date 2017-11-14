import java.util.ArrayDeque;

/**
 * Every manipulation with command
 */
public class Memory {
    private ArrayDeque<Integer> loopStart = new ArrayDeque<>();
    private int index = 0;
    private int[] mainMemoryArray = new int[50];
    /***Array, which will be used like main memory container */
    private String outputString = new String();

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    public void implementCommands(BrainFuckCommand brainFuckCommand) {

    }

    public void increment() {
    }

    public void decrement() {
    }

    public void moveCarretLeft() {

    }

    public void moveCarretRight() {

    }

    public void startTheLoop() {

    }

    public void endTheLoop() {

    }

    public void output() {

    }
}
