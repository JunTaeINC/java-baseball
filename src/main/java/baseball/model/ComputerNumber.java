package baseball.model;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;


public class ComputerNumber {

    private final int MIN_RANGE = 1;
    private final int MAX_RANGE = 9;
    private final int MAX_LENGTH = 3;

    public List<Integer> setComputerNumbers() {
        List<Integer> computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < MAX_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
            computerNumbers.add(randomNumber);
        }
        return computerNumbers;
    }
}
