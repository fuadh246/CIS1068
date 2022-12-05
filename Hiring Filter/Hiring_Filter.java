import java.util.ArrayList;
import java.util.Arrays;

public class Hiring_Filter {
    public static boolean GPA_filte(String gpa) {
        double gpa_double_value = Double.parseDouble(gpa);
        if (gpa_double_value >= 2.8 && gpa_double_value <= 4.0) {
            return true;
        }
        return false;
    }

    public static boolean Language_filter(String[] languages, String[] language_looking_for) {
        int count = 0;
        for (int i = 0; i < languages.length; i++) {
            for (int j = 0; j < language_looking_for.length; j++) {
                if (languages[i].trim().equals(language_looking_for[j].trim())) {
                    count++;
                }
            }
        }
        if (count == language_looking_for.length) {
            return true;
        }
        return false;
    }

}