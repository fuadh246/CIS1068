
import java.io.*;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
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
        System.out.println(test.Student_Test());
        write_to_file("Student_test_paper.txt", test.Student_Test());
        write_to_file("answer_key.txt", test.answer_Key_Test());

    }

    public static void write_to_file(String filename, String Print) throws FileNotFoundException {

        PrintStream outToFile = new PrintStream(new File(filename));
        outToFile.println(Print);
    }
}
