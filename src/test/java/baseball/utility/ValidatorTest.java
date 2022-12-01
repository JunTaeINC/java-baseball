package baseball.utility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    private Validator validator;


    @BeforeEach
    public void setUp() {
        validator = new Validator();
    }

    @DisplayName("입력 숫자 길이(세 자리)검사")
    @Nested
    class Length_Check {

        @Test
        void case_True() {
            String userInput1 = "123";
            String userInput2 = "781";
            String userInput3 = "162";

            assertTrue(validator.numberLengthCheck(userInput1));
            assertTrue(validator.numberLengthCheck(userInput2));
            assertTrue(validator.numberLengthCheck(userInput3));
        }

        @Test
        void case_False() {
            String userInput1 = "1234";
            String userInput2 = "12";
            String userInput3 = "1";

            assertFalse(validator.numberLengthCheck(userInput1));
            assertFalse(validator.numberLengthCheck(userInput2));
            assertFalse(validator.numberLengthCheck(userInput3));
        }
    }

    @DisplayName("입력 숫자 문자 검사")
    @Nested
    class String_Check {

        @Test
        void case_True() {
            String userInput1 = "123";
            String userInput2 = "456";
            String userInput3 = "789";

            assertTrue(validator.stringCheck(userInput1));
            assertTrue(validator.stringCheck(userInput2));
            assertTrue(validator.stringCheck(userInput3));
        }

        @Test
        void case_False() {
            String userInput1 = "일이삼";
            String userInput2 = "1.2.45";
            String userInput3 = "18k";

            assertFalse(validator.stringCheck(userInput1));
            assertFalse(validator.stringCheck(userInput2));
            assertFalse(validator.stringCheck(userInput3));
        }
    }

    @DisplayName("입력 숫자 범위(1~9) 검사")
    @Nested
    class Range_Check {

        @Test
        void case_True() {
            String userInput1 = "123";
            String userInput2 = "456";
            String userInput3 = "789";

            assertTrue(validator.rangeCheck(userInput1));
            assertTrue(validator.rangeCheck(userInput2));
            assertTrue(validator.rangeCheck(userInput3));
        }

        @Test
        void case_False() {
            String userInput1 = "023";
            String userInput2 = "409";
            String userInput3 = "790";

            assertFalse(validator.rangeCheck(userInput1));
            assertFalse(validator.rangeCheck(userInput2));
            assertFalse(validator.rangeCheck(userInput3));
        }
    }

    @DisplayName("입력 숫자 중복 검사")
    @Nested
    class Duplication_Check {

        @Test
        void case_True() {
            String userInput1 = "123";
            String userInput2 = "456";
            String userInput3 = "789";

            assertTrue(validator.duplicationCheck(userInput1));
            assertTrue(validator.duplicationCheck(userInput2));
            assertTrue(validator.duplicationCheck(userInput3));
        }

        @Test
        void case_False() {
            String userInput1 = "112";
            String userInput2 = "999";
            String userInput3 = "911";

            assertFalse(validator.duplicationCheck(userInput1));
            assertFalse(validator.duplicationCheck(userInput2));
            assertFalse(validator.duplicationCheck(userInput3));
        }
    }

    @DisplayName("입력 숫자 중복 검사")
    @Nested
    class Exit_Or_Restart_Check {

        @Test
        void case_True() {
            String userInput1 = "1";
            String userInput2 = "2";

            assertTrue(validator.exitOrReStartCheck(userInput1));
            assertTrue(validator.exitOrReStartCheck(userInput2));
        }

        @Test
        void case_False() {
            String userInput1 = "탈출";
            String userInput2 = "j";

            assertFalse(validator.exitOrReStartCheck(userInput1));
            assertFalse(validator.exitOrReStartCheck(userInput2));
        }

    }
}