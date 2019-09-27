package printqueue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class Validation {

    /**
     * Method isDouble Description Validates that double value is entered
     *
     * @return boolean
     * @param fieldValue // input
     * @return java.util.regex.Matcher;
     */
    public static boolean isDouble(String fieldValue) {
        Pattern pat = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher mat = pat.matcher(fieldValue);
        return mat.matches();
    }

    /**
     * Method isDouble Description Validates that Double value is entered
     *
     * @return boolean
     * @param fieldValue // input
     * @param lower
     * @param upper
     * @return boolean
     */
    public static boolean isDouble(String fieldValue, double lower, double upper) {
        boolean result = true;
        Pattern pat = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher mat = pat.matcher(fieldValue);
        if (mat.matches()) {
            try {
                double num = Double.parseDouble(fieldValue);
                if (num < lower || num > upper) {
                    result = false;
                }
            } catch (NumberFormatException ex) {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Method isInteger() Description Validates that String fieldValue
     *
     * @return boolean
     * @param fieldValue // input
     * @author Nomingerel Tserenjav
     * @see java.util.regex.Matcher
     * @see java.util.regex.Patter
     */
    public static boolean isInteger(String fieldValue) {
        Pattern pat = Pattern.compile("\\d+");
        Matcher mat = pat.matcher(fieldValue);
        return mat.matches();
    }

    /**
     * Method isEmpty() Description Validates that JTextField is not empty
     *
     * @return boolean
     * @param fieldValue: JTextField, input
     * @author Nomingerel Tserenjav
     * @see java.util.regex.Matcher
     * @see java.util.regex.Patter
     * @see java.swing.JTextField;
     */
    public static boolean isEmpty(JTextField fieldValue) {
        String input = fieldValue.getText();
        if (input.length() <= 0 || input.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method isValidName() Description Validates that String input
     *
     * @return result
     * @param input: name, composer, year etc
     * @author Nomingerel Tserenjav
     * @see java.util.regex.Matcher
     * @see java.util.regex.Patter
     */
    public static boolean isValidName(String input) {
        final short MAX_LENGTH = 30;
        final short MIN_LENGTH = 2;
        boolean result = true;
        Pattern pat = Pattern.compile("[a-zA-Z ]+");
        Matcher mat = pat.matcher(input);

        if (!mat.matches() || input.length() > MAX_LENGTH || input.length() < MIN_LENGTH) {
            result = false;
        }
        return result;
    }
}
