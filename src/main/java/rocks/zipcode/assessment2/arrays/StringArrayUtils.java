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
        String[] toRet = new String[endingIndex - startingIndex];
        for (int i = 0; i < arrayToBeSpliced.length - 1; i++) {
            if (i == startingIndex) {
                toRet[i] = arrayToBeSpliced[i];
            } else if (i == endingIndex) {
                toRet[i] = arrayToBeSpliced[i];
            } else {

            }
        }
        return toRet;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        return null;
    }
}
