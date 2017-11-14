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
        memoryInstance.moveCarretRight();
        assertEquals(11, memoryInstance.getIndex());
    }

    @Test
    public void moveCaretLeftTest() {
        memoryInstance.setIndex(11);
        memoryInstance.moveCaretLeft();
        assertEquals(10, memoryInstance.getIndex());
    }

    @Test
    public void incrementTest() {
        int[] array = new int[50];
        memoryInstance.setIndex(10);
        memoryInstance.setMainMemoryArray(array);
        memoryInstance.increment();
        assertEquals(1, memoryInstance.getMainMemoryArray()[memoryInstance.getIndex()]);
    }

    @Test
    public void decrementTest() {
        int[] array = new int[50];
        memoryInstance.setIndex(10);
        memoryInstance.setMainMemoryArray(array);
        memoryInstance.decrement();
        assertEquals(0, memoryInstance.getMainMemoryArray()[memoryInstance.getIndex()] + 1);
    }
    @Test
    public void loopStartTest(){
        memoryInstance.setIndex(25);
        memoryInstance.startTheLoop();
        assertEquals(false,memoryInstance.getLoopStart().isEmpty());
    }
}
