import static com.google.common.base.Strings.isNullOrEmpty;

/**
 * Check the validation of BrainFuck string
 */

public class Validator {

    public boolean isValid(String brainFuckString){      /**Check the string on validation*/
        boolean validation = !isNullOrEmpty(brainFuckString);
        return validation;
    }

}
