public class Driver {
    public static void main(String[] args) {
        ObjectiveQuestion[] questions = new ObjectiveQuestion[5];
        questions[0] = new ObjectiveQuestion(5, 1, 5,
                "How much wood would a woodchuck chuck if a woodchuck could chuck wood?", "700 pounds");
        questions[1] = new ObjectiveQuestion(5, 1, 5,
                "How much wood would a woodchuck chuck if a woodchuck could chuck wood?", "700 pounds");
        questions[2] = new ObjectiveQuestion(5, 1, 5,
                "How much wood would a woodchuck chuck if a woodchuck could chuck wood?", "700 pounds");
        questions[3] = new ObjectiveQuestion(5, 1, 5,
                "How much wood would a woodchuck chuck if a woodchuck could chuck wood?", "700 pounds");
        questions[4] = new ObjectiveQuestion(5, 1, 5,
                "How much wood would a woodchuck chuck if a woodchuck could chuck wood?", "700 pounds");
        Test test = new Test(questions);
        System.out.println(test.getTotalPoints());
    }
}
