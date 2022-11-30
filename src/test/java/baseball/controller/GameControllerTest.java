package baseball.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {

    private GameController gameController;


    @BeforeEach
    public void setUp() {
        gameController = new GameController();
    }

    @DisplayName("스트라이크 개수 확인")
    @Nested
    class Count_Strike {

        @Test
        void case_One_Strike() {
            List<Integer> computerNumbers = List.of(1, 2, 3);
            List<Integer> userNumbers = List.of(1, 4, 5);

            assertEquals(1, gameController.countStrike(computerNumbers, userNumbers));
        }

        @Test
        void case_Two_Strike() {
            List<Integer> computerNumbers = List.of(1, 2, 3);
            List<Integer> userNumbers = List.of(1, 2, 5);

            assertEquals(2, gameController.countStrike(computerNumbers, userNumbers));
        }

        @Test
        void case_Three_Strike() {
            List<Integer> computerNumbers = List.of(1, 2, 3);
            List<Integer> userNumbers = List.of(1, 2, 3);

            assertEquals(3, gameController.countStrike(computerNumbers, userNumbers));
        }
    }

    @DisplayName("볼 개수 확인")
    @Nested
    class Count_Ball {

        @Test
        void case_One_Ball() {
            List<Integer> computerNumbers = List.of(1, 2, 3);
            List<Integer> userNumbers = List.of(2, 4, 5);

            assertEquals(1, gameController.countBall(computerNumbers, userNumbers));
        }

        @Test
        void case_Two_Ball() {
            List<Integer> computerNumbers = List.of(1, 2, 3);
            List<Integer> userNumbers = List.of(2, 1, 5);

            assertEquals(2, gameController.countBall(computerNumbers, userNumbers));
        }

        @Test
        void case_Three_Ball() {
            List<Integer> computerNumbers = List.of(1, 2, 3);
            List<Integer> userNumbers = List.of(3, 1, 2);

            assertEquals(3, gameController.countBall(computerNumbers, userNumbers));
        }
    }

}