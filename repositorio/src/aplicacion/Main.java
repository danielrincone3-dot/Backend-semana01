package aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int CURRENT_YEAR = 2026;
    static List<Integer> agesStudentList = new ArrayList<>();

    public static void main(String[] args) {
        final String GREETING_MESSAGE = "Saludo estudiante de Java";
        final String LIST_HEADER = "Lista de estudiantes:";

        String[] namesStudents = {"Emanuel", "Matius", "Ronaldo", "Messi", "Carlos"};
        int[] birthYears = {2000, 2001, 2007, 2009, 1995};

        List<Integer> agesStudentsLocal;

        showMessage(GREETING_MESSAGE);
        showMessage(LIST_HEADER);

        agesStudentsLocal = fillAgesList(birthYears);

        for (int i = 0; i < namesStudents.length; i++) {
            System.out.println(namesStudents[i] + " tiene " + agesStudentsLocal.get(i) + " años.");
        }
    }

    static void showMessage(String message) {
        System.out.println(message);
    }

    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;
    }

    static List<Integer> fillAgesList(int[] birthYears) {
        for (int year : birthYears) {
            int age = calculateAge(year);
            agesStudentList.add(age);
        }
        return agesStudentList;
    }
}