package rocks.zipcode.assessment2.fundamentals;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

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
        String newString = string.replace(" ", "");
        if (newString.matches("[a-zA-Z]+")) {
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String newString = string.replace(" ", "");
        if (newString.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String toCheck = string.replace(" ", "");
        if (!toCheck.matches("[a-zA-Z0-9!]+")) {
            return true;
        }
        return false;
    }
}
