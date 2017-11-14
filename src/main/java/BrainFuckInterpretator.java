/**
 * Interpretate the BrainFuck string and execute it
 */

public class BrainFuckInterpretator {

    public void executeString(String brainFuckString) throws Exception {
        Validator validator = new Validator();
        Parser parser = new Parser();
        if (validator.isValid(brainFuckString)) {
            BrainFuckCommand[] brainFuckCommands = parser.parseToCommand(brainFuckString);
            for (BrainFuckCommand command:brainFuckCommands
                 ) {

            }
        } else throw new Exception("Invalid string for interpretate it");
    }
}
