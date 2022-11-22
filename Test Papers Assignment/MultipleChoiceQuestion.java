public class MultipleChoiceQuestion extends Question {
    public String[] possibleAnswers;
    public String correctAnswer;

    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText,
            String[] possibleAnswers, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        String answer = "";
        for (int i = 0; i < possibleAnswers.length; i++) {
            if (possibleAnswers[i].equals(correctAnswer)) {
                answer += i + 1 + ". ***" + correctAnswer + "***\n";
            } else {
                answer += i + 1 + ". " + possibleAnswers[i] + "\n";
            }
        }
        return answer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getPossibleAnswers() {
        String options = "";
        for (int i = 0; i < possibleAnswers.length; i++) {
            options += i + 1 + ". " + possibleAnswers[i] + "\n";
        }
        return options;
    }

    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String studentFormat() {
        return "Question: " + questionText
                + "    Point: " + points
                + "   Difficulty: " + difficulty
                + "\n\n" + getPossibleAnswers();
    }

    public String answerFormat() {
        return "Question: " + questionText
                + "    Point: " + points
                + "   Difficulty: " + difficulty
                + "\n\n" + getCorrectAnswer();
    }

}
