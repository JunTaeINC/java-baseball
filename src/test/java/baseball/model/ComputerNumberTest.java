package baseball.model;

import baseball.utility.Validator;
import org.junit.jupiter.api.*;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ComputerNumberTest {

    private ComputerNumber computerNumber;

    @BeforeEach
    public void setUp() {
        computerNumber = new ComputerNumber();
    }

    @DisplayName("컴퓨터 숫자 중복 검사")
    @Nested
    class Duplication_Check {

        @Test
        void duplicationCheck() {
            List<Integer> computerNumbers = computerNumber.setComputerNumbers();
            Set<Integer> setComputerNumbers = new HashSet<>(computerNumbers);

            assertEquals(computerNumbers.size(), setComputerNumbers.size());
        }

    }

    @DisplayName("컴퓨터 숫자 길이(세 자리) 검사")
    @Nested
    class LengthCheck {

        @Test
        void lengthCheck() {
            List<Integer> computerNumbers = computerNumber.setComputerNumbers();

            assertEquals(computerNumbers.size(), 3);
        }
    }

    @DisplayName("컴퓨터 숫자 범위(1~9) 검사")
    @Nested
    class Range_Check {

        @Test
        void rangeCheck() {
            List<Integer> computerNumbers = computerNumber.setComputerNumbers();

            assertTrue(Validator.checkNumberRangeCheck(computerNumbers));

        }
    }

}