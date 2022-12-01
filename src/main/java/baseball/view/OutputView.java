package baseball.view;

import baseball.model.ScoreMessage;

public class OutputView {

    private final int ZERO = 0;
    private final String BLANK = " ";

    public String printResult(int strike, int ball) {
        if (strike == ZERO && ball == ZERO) {
            return ScoreMessage.NOTHING.getScoreMessage();
        }
        if (strike == ZERO) {
            return ball + ScoreMessage.BALL.getScoreMessage();
        } else if (ball == ZERO) {
            return strike + ScoreMessage.STRIKE.getScoreMessage();
        } else {
            return ball + ScoreMessage.BALL.getScoreMessage() + BLANK
                    + strike + ScoreMessage.STRIKE.getScoreMessage();
        }
    }

}
