public class Course5 {
    private String courseName;
    private int enrolledStudents;
    private static int totalUniversityStudents = 0;

    public Course5(String courseName, int enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        totalUniversityStudents += enrolledStudents;
    }
}
