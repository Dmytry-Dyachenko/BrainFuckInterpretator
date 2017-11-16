/**
 * Interpretate the BrainFuck string and execute it
 */

public class BrainFuckInterpretator {

    public StringBuffer executeString(String brainFuckString) throws Exception {/**Execute string if it is possible*/
        Validator validator = new Validator();

        if (validator.isValid(brainFuckString)) {/** Send the string for checking validation */
            Parser parser = new Parser();
            Memory memoryWorker = new Memory();
            BrainFuckCommand[] brainFuckCommands = parser.parseToCommand(brainFuckString);
            for (int i = 0; i<brainFuckCommands.length;i++) {
                memoryWorker.implementCommands(brainFuckCommands[i],i);/**I give to "i" a command number, when loop is start again*/
                i = memoryWorker.getCommandNumber();
            }
            System.out.println(memoryWorker.getOutputString());
           return memoryWorker.getOutputString();
        } else throw new Exception("Invalid string for interpretate it");
    }
}
