package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String toRet = String.format("%" + amountOfPadding + "s", stringToBePadded);
        return toRet;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String toRet = String.format("%" + -amountOfPadding + "s", stringToBePadded);
        return toRet;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String toRet = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            toRet += stringToBeRepeated;
        }
        return toRet;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String toCheck = string.replace(" ", "");
        for (int i = 0; i < toCheck.length(); i++) {
            char check = toCheck.charAt(i);
            if (check < 'A' || check > 'Z') {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if (string == null || string.equals("")) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (check < '0' || check > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String toCheck = string.replace(" ", "");
        for (int i = 0; i < toCheck.length(); i++) {
            char check = toCheck.charAt(i);
            if (check < '0' || check > '9') {
                return false;
            } else if (check > 'Z' && check < 'A') {
                return false;
            }
        }
        return true;
    }
}
