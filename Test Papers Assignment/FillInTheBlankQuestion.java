public class FillInTheBlankQuestion extends Question {
    public String correctAnswer;

    public FillInTheBlankQuestion(int points,
            int difficulty,
            int answerSpace,
            String questionText,
            String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;

    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String studentFormat() {
        String lines = "";
        for (int i = 0; i < answerSpace; i++) {
            lines += "\n";
        }
        return questionText
                + "    Point: " + points
                + "   Difficulty: " + difficulty
                + "\nAnswer:  " + lines;
    }

    public String answerFormat() {
        return "__" + correctAnswer + "__ " + questionText
                + "    Point: " + points
                + "   Difficulty: " + difficulty + "\n";
    }
}
