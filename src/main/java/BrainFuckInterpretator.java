/**
 * Interpretate the BrainFuck string and execute it
 */

public class BrainFuckInterpretator {

    public void executeString(String brainFuckString) throws Exception {
        Validator validator = new Validator();
        Parser parser = new Parser();
        if (validator.isValid(brainFuckString)) {
            Memory memoryWorker = new Memory();
            BrainFuckCommand[] brainFuckCommands = parser.parseToCommand(brainFuckString);
            for (int i = 0; i<brainFuckCommands.length;i++) {
                memoryWorker.implementCommands(brainFuckCommands[i],i);/**I give to "i" a command number, when loop is start again*/
                i = memoryWorker.getCommandNumber();
            }
            System.out.println(memoryWorker.getOutputString());
        } else throw new Exception("Invalid string for interpretate it");
    }
}
