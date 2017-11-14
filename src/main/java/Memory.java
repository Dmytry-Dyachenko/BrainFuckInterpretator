import java.util.ArrayDeque;

/**
 * Every manipulation with command
 */
public class Memory {
    private ArrayDeque<Integer> loopStart = new ArrayDeque<>();
    private int index = 0;
    private int[] mainMemoryArray = new int[50];
    private boolean areWeInside = false;

    public int[] getMainMemoryArray() {
        return mainMemoryArray;
    }

    public void setMainMemoryArray(int[] mainMemoryArray) {
        this.mainMemoryArray = mainMemoryArray;
    }

    /***Array, which will be used like main memory container */
    private String outputString = new String();

    public ArrayDeque<Integer> getLoopStart() {
        return loopStart;
    }

    public void setLoopStart(ArrayDeque<Integer> loopStart) {
        this.loopStart = loopStart;
    }

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
        mainMemoryArray[index]++;
    }

    public void decrement() {
        mainMemoryArray[index]--;
    }

    public void moveCaretLeft() {
        index--;
    }

    public void moveCarretRight() {
        index++;
    }

    public void startTheLoop() {
        loopStart.addFirst(index);
        areWeInside = (mainMemoryArray[index] == 0) ? true : false;
    }

    public void endTheLoop() {
        if (mainMemoryArray[index] != 0)
            loopStart.getFirst();
        loopStart.removeFirst();
    }

    public void output() {
      outputString+=(char)mainMemoryArray[index];
    }
}
