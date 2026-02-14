package aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int CURRENT_YEAR = 2026;

    public static void main(String[] args) {
        final String GREETING_MESSAGE = "saludo estudiante de java";

        String[] namesStudents = {"Emanuel", "Matius", "Ronaldo", "Messi", "Carlos"};
        int[] birthYears = {2000, 2001, 2007, 2009, 1995};


        List<Integer> agesStudents = new ArrayList<>();

        showMessage(GREETING_MESSAGE);


        for (int i = 0; i < birthYears.length; i++) {
            int age = calculateAge(birthYears[i]);
            agesStudents.add(age);
            System.out.println(namesStudents[i] + " tiene " + age + " años.");
        }
    }


    static void showMessage(String message) {
        System.out.println(message);
    }

    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;
    }
}