public class ObjectiveQuestion extends Question {
    public String correctAnswer;

    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
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
        return "Question: " + questionText
                + "    Point: " + points
                + "   Difficulty: " + difficulty
                + "\nAnswer:  " + lines;
    }

    public String answerFormat() {
        return "Question: " + questionText
                + "    Point: " + points
                + "   Difficulty: " + difficulty
                + "\nCorrect Answer: " + correctAnswer + "\n";
    }
}
