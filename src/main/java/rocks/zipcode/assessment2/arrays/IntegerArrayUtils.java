package rocks.zipcode.assessment2.arrays;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.logging.Logger;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    private static final Logger LOGGER = Logger.getLogger(IntegerArrayUtils.class.getName());


    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] newArray = new Integer[integerArray.length+1];
        for (int i = 0; i < integerArray.length; i++) {
            newArray[i] = integerArray[i];
        }
        newArray[newArray.length - 1] = valueToBeAdded;
        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] arrayToReturn = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length - 1; i++) {
            if (i == indexToInsertAt) {
                arrayToReturn[i] = valueToBeInserted;
            } else {
                arrayToReturn[i] = integerArray[i];
            }
        }
        return arrayToReturn;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        Integer unknown = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (i == (indexToFetch)) {
                unknown = integerArray[i];
            }
        }
        return unknown;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
