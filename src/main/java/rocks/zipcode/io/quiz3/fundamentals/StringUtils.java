package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
    StringBuilder newStr = new StringBuilder(str.length());
    newStr.setCharAt(indexToCapitalize, Character.toUpperCase(newStr.charAt(indexToCapitalize)));
    char replace = newStr.charAt(indexToCapitalize);
    replace = Character.toUpperCase(newStr.charAt(indexToCapitalize));

        return newStr.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
//        List<String> subStrings = new ArrayList<>();
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = 0; j < string.length() - 1; j++){
//                String temp = string.substring(i, i+j);
//                subStrings.add(temp);
//            }
//            Integer arraySize = subStrings.size();
//            String[] result = subStrings.toArray(new String[arraySize]);
//        }
        return null; //Arrays.toString(result);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
