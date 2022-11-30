package baseball.model;

public enum ScoreMessage {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String scoreMessage;

    ScoreMessage(final String scoreMessage){
        this.scoreMessage = scoreMessage;
    }

    public String getScoreMessage(){
        return scoreMessage;
    }
}
