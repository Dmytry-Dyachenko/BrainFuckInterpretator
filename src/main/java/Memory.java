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
    private StringBuffer outputString = new StringBuffer();

    public ArrayDeque<Integer> getLoopStart() {
        return loopStart;
    }

    public void setLoopStart(ArrayDeque<Integer> loopStart) {
        this.loopStart = loopStart;
    }

    public StringBuffer getOutputString() {
        return outputString;
    }

    public void setOutputString(StringBuffer outputString) {
        this.outputString = outputString;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void implementCommands(BrainFuckCommand brainFuckCommand, int commandNumber) { /**Took the command from the interpretator method and sent it,
                                                                                            in dependency of conditionals, to different methods*/
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

    public void increment() { /**Increment the element of array with given index*/
        mainMemoryArray[index]++;
    }

    public void decrement() {/**Decrement the element of array with given index*/
        mainMemoryArray[index]--;
    }

    public void moveCaretLeft() {/**Move the pointer to the previous element of array*/
        index--;
    }

    public void moveCaretRight() {/**Move the pointer to the next element of array*/
        index++;
    }

    public void startTheLoop() { /**Save the information about the start of the loop*/
        loopStart.addFirst(commandNumber);
        areWeInside = (mainMemoryArray[index] == 0) ? true : false;
    }

    public void endTheLoop() {/**Go to the start of loop, if conditional is false, or go ahead if is not*/
        if (mainMemoryArray[index] != 0)
            this.commandNumber = loopStart.getFirst() - 1;
        loopStart.removeFirst();
    }

    public void output() { /**Make the output string for show it in the log*/
      outputString.append((char)mainMemoryArray[index]);
    }
}
