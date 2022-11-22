public class TestMain {
    public static void main(String[] args) {
        // question 1
        Question question1 = new Question(5, 1, 5, "");
        question1.setQuestionText("How much wood would a woodchuck chuck if a woodchuck could chuck wood?");
        System.out.println(question1.studentFormat());
        // question 2 : ObjectiveQuestion
        ObjectiveQuestion ObjectiveQuestion1 = new ObjectiveQuestion(5, 3, 10,
                null, null);
        ObjectiveQuestion1.setQuestionText("How much wood would a woodchuck chuck if a woodchuck could chuck wood?");
        ObjectiveQuestion1.setCorrectAnswer("700 pounds");
        System.out.println(ObjectiveQuestion1.studentFormat());
        // AnswerFormat()
        // System.out.println(ObjectiveQuestion1.answerFormat());
        // question 3 : FillInTheBlankQuestion
        FillInTheBlankQuestion FillInTheBlankQuestion1 = new FillInTheBlankQuestion(5, 2, 1, null, null);
        FillInTheBlankQuestion1.setQuestionText("______ was the 16th US President.");
        FillInTheBlankQuestion1.setCorrectAnswer("Abraham Lincoln");
        System.out.println(FillInTheBlankQuestion1.studentFormat());
        // AnswerFormat()
        // System.out.println(FillInTheBlankQuestion1.answerFormat());

        // question 3 : FillInTheBlankQuestion
        MultipleChoiceQuestion MultipleChoiceQuestion1 = new MultipleChoiceQuestion(5, 5, 0, null, null, null);
        String[] MultipleChoiceQuestion1_options = { "Peter Griffin",
                "Scooby Doo", "Spongebob Squarepants", "Eric Cartman" };
        MultipleChoiceQuestion1.setPossibleAnswers(MultipleChoiceQuestion1_options);
        MultipleChoiceQuestion1.setQuestionText("Who lives in a pineapple under the sea?");
        MultipleChoiceQuestion1.setCorrectAnswer("Spongebob Squarepants");
        System.out.println(MultipleChoiceQuestion1.studentFormat());
        // AnswerFormat()
        // System.out.println(MultipleChoiceQuestion1.answerFormat());

    }
}
