package baseball.view;

import baseball.utility.Validator;
import camp.nextstep.edu.missionutils.Console;


public class InputView {

    private static final String INPUT_SENTENCE = "숫자를 입력해주세요 : ";
    private static final String EXIT_SENTENCE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final Validator validator = new Validator();


    public String getUserInput() {
        System.out.print(INPUT_SENTENCE);
        String input = Console.readLine();
        if (!validator.validatorCheck(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public String getExitOrRestart() {
        System.out.println(EXIT_SENTENCE);
        String input = Console.readLine();
        if (!validator.exitOrReStartCheck(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

}
