package baseball.utility;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Validator {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;
    private static final int MAX_LENGTH = 3;
    private static final String BLANK = "";

    private static final String ZERO_TO_NINE = "^[0-9]*$";
    private static final String ONE_TO_NINE = "^[1-9]*$";
    private static final String RESTART_CODE = "1";
    private static final String EXIT_CODE = "2";


    public static boolean checkNumberRangeCheck(List<Integer> testObject) {
        for (Integer number : testObject) {
            if (number > MAX_RANGE || number < MIN_RANGE) {
                return false;
            }
        }
        return true;
    }

    public boolean numberLengthCheck(String testObject) {
        return testObject.length() == MAX_LENGTH;
    }

    public boolean stringCheck(String testObject) {
        Pattern zeroToNine = Pattern.compile(ZERO_TO_NINE);
        return zeroToNine.matcher(testObject).matches();
    }

    public boolean rangeCheck(String testObject) {
        Pattern OneToNine = Pattern.compile(ONE_TO_NINE);
        return OneToNine.matcher(testObject).matches();
    }

    public boolean duplicationCheck(String testObject) {
        return Arrays.stream(testObject.split(BLANK))
                .distinct()
                .count() == testObject.length();
    }

    public boolean validatorCheck(String userInput) {
        return duplicationCheck(userInput) && rangeCheck(userInput) && stringCheck(userInput) && numberLengthCheck(userInput);
    }

    public boolean oneOrTwoNumberCheck(String userInput) {
        return Objects.equals(userInput, RESTART_CODE) || Objects.equals(userInput, EXIT_CODE);
    }

    public boolean exitOrReStartCheck(String userInput) {
        return stringCheck(userInput) && oneOrTwoNumberCheck(userInput);
    }

}
