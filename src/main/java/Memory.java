import java.util.ArrayDeque;

/**
 * Every manipulation with command
 */
public class Memory {
    private ArrayDeque<Integer> loopStart = new ArrayDeque<>();
    private int index = 0;
    private int[] mainMemoryArray = new int[50];

    public int[] getMainMemoryArray() {
        return mainMemoryArray;
    }

    public void setMainMemoryArray(int[] mainMemoryArray) {
        this.mainMemoryArray = mainMemoryArray;
    }

    /***Array, which will be used like main memory container */
    private String outputString = new String();

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void implementCommands(BrainFuckCommand brainFuckCommand) {

    }

    public void increment() {
    }

    public void decrement() {
    }

    public void moveCaretLeft() {

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
