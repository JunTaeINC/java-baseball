package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.view.InputView;

import java.util.List;
import java.util.Objects;

public class GameController {

    private final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    private int STRIKE = 0;
    private int BALL = 0;


    public void playGame() {
        ComputerNumber computerNumber = new ComputerNumber();
        UserNumber userNumber = new UserNumber();
        InputView inputView = new InputView();

        List<Integer> computerNumbersList = computerNumber.setComputerNumbers();
        while (true) {
            System.out.println(START_MESSAGE);
            List<Integer> userNumbersList = userNumber.setUserNumbers(inputView.userInput());
        }
    }

    private int countStrike(List<Integer> computer, List<Integer> user) {
        for (int space = 0; space < computer.size(); space++) {
            if (Objects.equals(computer.get(space), user.get(space))) {
                STRIKE++;
            }
        }
        return STRIKE;
    }

    private int countBall(List<Integer> computer, List<Integer> user) {
        for (int space = 0; space < computer.size(); space++) {
            if (!Objects.equals(computer.get(space), user.get(space)) && computer.contains(user.get(space))) {
                BALL++;
            }

        }
        return BALL;
    }

}
