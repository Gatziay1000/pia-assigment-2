public class Course {
    private String courseName;
    private int enrolledStudents;

    private static int totalUniversityStudents = 0;

    public Course(String courseName, int enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        totalUniversityStudents += enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public static int getTotalUniversityStudents() {
        return totalUniversityStudents;
    }
    public double calculatePassPercentage(int passedStudents) {
        double passPercentage = ((double) passedStudents / this.enrolledStudents) * 100;
        return passPercentage;
    }

        public double calculateAverageAttendance(int totalAttendedSessions, int totalLectures) {
        int totalExpectedSessions = this.enrolledStudents * totalLectures;
        double attendancePercentage = ((double) totalAttendedSessions / totalExpectedSessions) * 100;
        return attendancePercentage;
    }

    public void displayCourseInfo(int passedStudents, int attendedSessions, int totalLectures) {
        double passRate = calculatePassPercentage(passedStudents);
        double attendanceRate = calculateAverageAttendance(attendedSessions, totalLectures);

        System.out.println("========================================");
        System.out.println("Course Name          : " + courseName);
        System.out.println("Enrolled Students    : " + enrolledStudents);
        System.out.printf("Pass Rate            : %.2f%%\n", passRate);
        System.out.printf("Average Attendance   : %.2f%%\n", attendanceRate);
    }

    public static void displayUniversityStats() {
        System.out.println("\n========================================");
        System.out.println("   IUEA UNIVERSITY-WIDE STATISTICS      ");
        System.out.println("========================================");
        System.out.println("Total Registered Students (All Courses): " + totalUniversityStudents);
        System.out.println("========================================\n");
    }
}
