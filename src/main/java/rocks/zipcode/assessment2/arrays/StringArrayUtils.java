package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        int index = 0;
        int arraySize = endingIndex - startingIndex;
        String[] arrayToReturn;
        if (startingIndex >= arrayToBeSpliced.length) {
            throw new IndexOutOfBoundsException();
        } else if (startingIndex < 0 || endingIndex < 0){
            throw new IllegalArgumentException();
        } else {
            arrayToReturn = new String[arraySize];
            for (int i = startingIndex; i < endingIndex; i++) {
                    arrayToReturn[index] = arrayToBeSpliced[i];
                    index++;
            }
        }
        return arrayToReturn;

    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] arrayToReturn = new String[arrayToBeSpliced.length - startingIndex];
        if (arrayToBeSpliced.length < startingIndex && startingIndex > 0) {
            return arrayToReturn;
        }
        for (int i = startingIndex; i < arrayToBeSpliced.length - 1; i++) {
            arrayToReturn[i] = arrayToBeSpliced[i];
        }
        return arrayToReturn;
    }
        /*for (String element : arrayToBeSpliced) {
            if (element.equals(arrayToBeSpliced[startingIndex])) {

            }
        }
        return null;
    }*/
}
