package baseball.utility;

import java.util.List;

public class Validator {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;
    private final int MAX_LENGTH = 3;

    public static boolean checkNumberRangeCheck(List<Integer> testObject) {
        for (Integer number : testObject) {
            if (number > MAX_RANGE || number < MIN_RANGE) {
                return false;
            }
        }
        return true;
    }

    public static boolean numberLengthCheck(String testObject) {
        if (testObject.length() != 3) {
            throw new IllegalArgumentException();
        }
        return true;
    }

}
