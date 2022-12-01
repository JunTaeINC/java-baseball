package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.model.ScoreMessage;
import baseball.view.InputView;


import java.util.List;
import java.util.Objects;

public class GameController {

    private final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final String RESTART = "1";
    private final String BLANK = " ";


    ComputerNumber computerNumber = new ComputerNumber();
    UserNumber userNumber = new UserNumber();
    InputView inputView = new InputView();
    private List<Integer> computerNumbersList = computerNumber.setComputerNumbers();

    public void playGame() {
        System.out.println(START_MESSAGE);
        boolean exitCode = false;
        while (!exitCode) {
            List<Integer> userNumbersList = userNumber.setUserNumbers(inputView.getUserInput());
            System.out.println(printResult(computerNumbersList, userNumbersList));
            if (countStrike(computerNumbersList, userNumbersList) == 3) {
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

    private String printResult(List<Integer> computer, List<Integer> user) {
        int strike = countStrike(computer, user);
        int ball = countBall(computer, user);
        if (strike == 0 && ball == 0) {
            return ScoreMessage.NOTHING.getScoreMessage();
        }
        if (strike == 0) {
            return ball + ScoreMessage.BALL.getScoreMessage();
        } else if (ball == 0) {
            return strike + ScoreMessage.STRIKE.getScoreMessage();
        } else {
            return ball + ScoreMessage.BALL.getScoreMessage() + BLANK
                    + strike + ScoreMessage.STRIKE.getScoreMessage();
        }
    }

    public int countStrike(List<Integer> computer, List<Integer> user) {
        int strike = 0;
        for (int space = 0; space < computer.size(); space++) {
            if (Objects.equals(computer.get(space), user.get(space))) {
                strike++;
            }
        }
        return strike;
    }

    public int countBall(List<Integer> computer, List<Integer> user) {
        int ball = 0;
        for (int space = 0; space < computer.size(); space++) {
            if (!Objects.equals(computer.get(space), user.get(space)) && computer.contains(user.get(space))) {
                ball++;
            }

        }
        return ball;
    }

}
