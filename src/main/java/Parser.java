/**
 * Parse the BrainFuck string
 */
public class Parser {
    public BrainFuckCommand[] parseToCommand(String brainFuckString){
        char[] brainFuckCharackters = brainFuckString.toCharArray();
        BrainFuckCommand[] brainFuckCommands = new BrainFuckCommand[brainFuckCharackters.length];
        for (int i =0; i<brainFuckCharackters.length; i++)
        {
            switch (brainFuckCharackters[i]){
                case '+': brainFuckCommands[i] = BrainFuckCommand.INCREMENT; break;
                case '-': brainFuckCommands[i] = BrainFuckCommand.DECREMENT; break;
                case '>': brainFuckCommands[i] = BrainFuckCommand.MOVE_CARET_RIGHT; break;
                case '<': brainFuckCommands[i] = BrainFuckCommand.MOVE_CARET_LEFT; break;
                case '[': brainFuckCommands[i] = BrainFuckCommand.LOOP_START; break;
                case ']': brainFuckCommands[i] = BrainFuckCommand.LOOP_END; break;
                case '.': brainFuckCommands[i] = BrainFuckCommand.OUTPUT; break;
            }
        }
        return brainFuckCommands;
    }
}
