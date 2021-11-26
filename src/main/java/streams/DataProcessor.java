package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataProcessor {


    public static boolean atLeastOneGradeA(Student student) {
        return false;
    }


    public static List<Integer> getStudentAges(List<Student> students) {
        return new ArrayList<>();
    }

    public static List<Student> getStudentsWithMinimumAge(List<Student> students, int minAge) {
        return new ArrayList<>();
    }


    // getGender() == Gender.MALE
    // or getGender().name().equals("MALE")
    public static long countMaleStudents(List<Student> students) {
        return 0;
    }


    public static double avgAgeOfFemaleStudent(List<Student> students) {
        return 0.0;
    }

    public static Integer getProductOfStudentAges(List<Student> students) {
        return 0;
    }

    // ignore F Grades
    public static double productOfStudentGrades(Student student) {
        return 0.0;
    }

    // region BONUS

    public static Optional<Grade> getBestMathGradeFromStudent(Student student) {
        return Optional.empty();
    }

    public static List<Integer> getSortedAges(List<Student> students) {
        return new ArrayList<>();
    }

    // endregion
}
