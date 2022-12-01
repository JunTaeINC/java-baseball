package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.model.ScoreMessage;
import baseball.view.InputView;
import baseball.view.OutputView;


import java.util.List;
import java.util.Objects;

public class GameController {
    ComputerNumber computerNumber = new ComputerNumber();
    UserNumber userNumber = new UserNumber();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    private final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final String RESTART = "1";
    private final int ZERO = 0;
    private final int THREE = 3;
    private boolean exitCode = false;
    private int strike = 0;
    private int ball = 0;
    private List<Integer> computerNumbersList = computerNumber.setComputerNumbers();

    public void playGame() {
        System.out.println(START_MESSAGE);
        while (!exitCode) {
            List<Integer> userNumbersList = userNumber.setUserNumbers(inputView.getUserInput());
            System.out.println(outputView.printResult(strike,ball));
            if (countStrike(computerNumbersList, userNumbersList) == THREE) {
                exitCode = exitOrRestart(inputView.getExitOrRestart());
            }
        }
    }

    private boolean exitOrRestart(String userInput) {
        if (Objects.equals(userInput, RESTART)) {
            computerNumbersList = computerNumber.setComputerNumbers();
            return false;
        } else {
            System.out.println(END_MESSAGE);
            return true;
        }
    }

    public int countStrike(List<Integer> computer, List<Integer> user) {
        int strike = ZERO;
        for (int space = 0; space < computer.size(); space++) {
            if (Objects.equals(computer.get(space), user.get(space))) {
                strike++;
            }
        }
        return strike;
    }

    public int countBall(List<Integer> computer, List<Integer> user) {
        int ball = ZERO;
        for (int space = 0; space < computer.size(); space++) {
            if (!Objects.equals(computer.get(space), user.get(space)) && computer.contains(user.get(space))) {
                ball++;
            }

        }
        return ball;
    }

}
