/**
 * The constant names of BrainFuck methods
 */

public enum BrainFuckCommand {
    INCREMENT('+'),
    DECREMENT('-'),
    MOVE_CARET_LEFT('<'),
    MOVE_CARET_RIGHT('>'),
    LOOP_START('['),
    LOOP_END(']'),
    OUTPUT('.');

    private final char symbol;

    BrainFuckCommand(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
