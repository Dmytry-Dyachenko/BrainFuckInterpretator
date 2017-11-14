import java.util.ArrayDeque;

/**
 * Every manipulation with command
 */
public class Memory {
    private ArrayDeque<Integer> loopStart = new ArrayDeque<>();
    private int index = 0;
    private int[] mainMemoryArray = new int[50];
    private boolean areWeInside = false;
    private int commandNumber = 0;

    public int getCommandNumber() {
        return commandNumber;
    }

    public void setCommandNumber(int commandNumber) {
        this.commandNumber = commandNumber;
    }

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

    public void implementCommands(BrainFuckCommand brainFuckCommand, int commandNumber) {
        this.commandNumber = commandNumber;         /** The information about command number, for come back to it, if it is needed*/
        switch (brainFuckCommand){
            case INCREMENT: increment(); break;
            case DECREMENT: decrement(); break;
            case MOVE_CARET_LEFT: moveCaretLeft(); break;
            case MOVE_CARET_RIGHT: moveCaretRight(); break;
            case LOOP_START: startTheLoop(); break;
            case LOOP_END: endTheLoop(); break;
            case OUTPUT: output(); break;

        }
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

    public void moveCaretRight() {
        index++;
    }

    public void startTheLoop() {
        loopStart.addFirst(commandNumber);
        areWeInside = (mainMemoryArray[index] == 0) ? true : false;
    }

    public void endTheLoop() {

        if (mainMemoryArray[index] != 0)
            this.commandNumber = loopStart.getFirst() - 1;
        loopStart.removeFirst();
    }

    public void output() {
      outputString+=(char)mainMemoryArray[index];
    }
}
