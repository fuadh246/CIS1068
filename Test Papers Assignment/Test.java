public class Test {
    ObjectiveQuestion[] questions;
    public int totalPoints;

    public Test(ObjectiveQuestion[] questions) {
        this.questions = questions;
    }

    public int getTotalPoints() {
        for (int i = 0; i < questions.length; i++) {
            totalPoints += questions[i].getPoint();
        }
        return totalPoints;
    }

    public String Student_Test() {

        String questions_paper = "------------- Student copy -------------\n\n";

        for (int i = 0; i < questions.length; i++) {
            questions_paper += questions[i].studentFormat();
        }
        return questions_paper;
    }

    public String answer_Key_Test() {

        String questions_paper = "------------- Answer key -------------\n\n";

        for (int i = 0; i < questions.length; i++) {
            questions_paper += questions[i].answerFormat();
        }
        return questions_paper;
    }
}
