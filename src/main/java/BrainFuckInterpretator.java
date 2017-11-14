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
            for (BrainFuckCommand command:brainFuckCommands
                 ) {
                memoryWorker.implementCommands(command);
            }
            System.out.println(memoryWorker.getOutputString());
        } else throw new Exception("Invalid string for interpretate it");
    }
}
