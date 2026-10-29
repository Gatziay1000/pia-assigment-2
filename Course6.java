public class Course6 {
    private String courseName;
    private int enrolledStudents;
    private static int totalUniversityStudents = 0;

    public Course(String courseName, int enrolledStudents) {
        this.course6Name = course6Name;
        this.enrolledStudents = enrolledStudents;
        totalUniversityStudents += enrolledStudents;
    }

    // Getters
    public String getCourseName() { return courseName; }
    public int getEnrolledStudents() { return enrolledStudents; }
    public static int getTotalUniversityStudents() { return totalUniversityStudents; }
}
