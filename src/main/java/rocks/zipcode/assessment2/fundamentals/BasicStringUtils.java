package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 += string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        char[] reversedString = string1.toCharArray();
        int index = 0;
        int end = reversedString.length - 1;
        char temporary;
        System.out.println(reversedString);
        while (end > index) {
            temporary = reversedString[index];
            reversedString[index] = reversedString[end];
            reversedString[end] = temporary;
            end--;
            index++;
        } return new String(reversedString);
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversedFirstWord = reverse(string1);
        String reversedSecondWord = reverse(string2);
        String toRet = concatentate(reversedFirstWord, reversedSecondWord);
        return toRet;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        String replaced = string.replace(charactersToRemove, "");


        char[] stringToManipulate = string.toCharArray();
        char[] charsToRemove = charactersToRemove.toCharArray();

        //char[] finalString = new char[stringToManipulate.length - charsToRemove.length];
        for (int i = 0; i < stringToManipulate.length - 1; i++) {
            for (int j = 0; j < charsToRemove.length - 1; j++) {
                if (stringToManipulate[i] == charsToRemove[j]) {
                    stringToManipulate[i] = ' ';
                } else {
                    stringToManipulate[i] = stringToManipulate[i];
                }
            }
        }
        return new String(replaced);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removedChars = removeCharacters(string, charactersToRemove);
        String reversed = reverse(removedChars);
        return reversed;
    }
}
