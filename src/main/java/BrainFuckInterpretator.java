/**
 * Interpretate the BrainFuck string and execute it
 */

public class BrainFuckInterpretator {

    public void executeString(String brainFuckString) throws Exception {
      Validator validator = new Validator();
      if(validator.isValid(brainFuckString)){

      } else throw new Exception("Invalid string for interpretate it");
    }
}
