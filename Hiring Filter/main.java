import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * to find 10 applicants is used the GPA to get all the applicants who has GPA range of 2.8 to 4.0
 * then i used the languages they know, checked if they knows java, C, and Pyhton 
 * since temple teaches this 3 for their entry leval classes.
*/

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> applicant = new ArrayList<String>();
        Hiring_Filter filter = new Hiring_Filter();

        File file = new File("applicant_data.csv");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            line = line.replaceAll(", ", " ");
            applicant.add(line);
        }

        System.out.println(applicant.size());

        ArrayList<String> applicant_gpa_filtered = new ArrayList<String>();
        for (int i = 1; i < applicant.size(); i++) {
            String[] s = applicant.get(i).split(",");
            // System.out.println(s[8]);
            if (filter.GPA_filte(s[8]) == true) {
                applicant_gpa_filtered.add(applicant.get(i));
            }
        }
        System.out.println(applicant_gpa_filtered.size());
        ArrayList<String> applicant_language_filtered = new ArrayList<String>();
        for (int i = 0; i < applicant_gpa_filtered.size(); i++) {
            String[] s = applicant_gpa_filtered.get(i).split(",");
            String[] languages = s[7].split(" ");

            String[] language_looking_for = { "Java", "Python", "C" };
            if (filter.Language_filter(languages, language_looking_for) == true) {
                applicant_language_filtered.add(applicant_gpa_filtered.get(i));
            }
        }

        System.out.println(applicant_language_filtered.size());

        for (int i = 0; i < 10; i++) {
            System.out.println(applicant_language_filtered.get(i));
        }

    }

}
