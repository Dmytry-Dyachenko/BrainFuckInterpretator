import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The class for testing main commands of brainFuck language
 */
public class MainCommandsTest {
    Memory memoryInstance = new Memory();

    @Test
    public void moveCaretRightTest() {
        memoryInstance.setIndex(10);
        memoryInstance.moveCaretRight();
        assertEquals("Caret didn`t move to right place",11,memoryInstance.getIndex());
    }

    @Test
    public void moveCaretLeftTest() {
        memoryInstance.setIndex(11);
        memoryInstance.moveCaretLeft();
        assertEquals("Caret didn`t move to right place",10, memoryInstance.getIndex());
    }

    @Test
    public void incrementTest() {
        int[] array = new int[50];
        memoryInstance.setIndex(10);
        memoryInstance.setMainMemoryArray(array);
        memoryInstance.increment();
        assertEquals("Increment isn`t successful",1, memoryInstance.getMainMemoryArray()[memoryInstance.getIndex()]);
    }

    @Test
    public void decrementTest() {
        int[] array = new int[50];
        memoryInstance.setIndex(10);
        memoryInstance.setMainMemoryArray(array);
        memoryInstance.decrement();
        assertEquals("Decrement isn`t successful",0, memoryInstance.getMainMemoryArray()[memoryInstance.getIndex()] + 1);
    }
    @Test
    public void loopStartTest(){
        memoryInstance.setIndex(25);
        memoryInstance.startTheLoop();
        assertEquals("Start the loop isn`t saved into your deque",false,memoryInstance.getLoopStart().isEmpty());
    }
}
