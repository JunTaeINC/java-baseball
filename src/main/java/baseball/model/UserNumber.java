package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserNumber {
    private static final String BLANK = "";

    public List<Integer> setUserNumbers(String userInput) {
        return Arrays.stream(userInput.split(BLANK))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
