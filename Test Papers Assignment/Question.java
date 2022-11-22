public class Question {
    public int points;
    public int difficulty;
    final int MIN_DIFFICULTY = 1;
    final int MAX_DIFFICULTY = 5;
    public int answerSpace;
    public String questionText;

    public Question(int points, int difficulty, int answerSpace, String questionText) {
        this.points = points;
        if (difficulty >= MIN_DIFFICULTY && MAX_DIFFICULTY >= difficulty) {
            this.difficulty = difficulty;
        } else {
            this.difficulty = 0;
        }
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }

    public int getPoint() {
        return points;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getAnswerSpace() {
        return answerSpace;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setPoint(int points) {
        this.points = points;
    }

    public void setDifficulty(int difficulty) {
        if (difficulty >= MIN_DIFFICULTY && MAX_DIFFICULTY >= difficulty) {
            this.difficulty = difficulty;
        } else {
            this.difficulty = 0;
        }
    }

    public void setAnswerSpace(int answerSpace) {
        this.answerSpace = answerSpace;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
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

}