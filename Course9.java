public void displayCourse9Info(int passedStudents, int attendedSessions, int totalLectures) {
        double passRate = calculatePassPercentage(passedStudents);
        double attendanceRate = calculateAverageAttendance(attendedSessions, totalLectures);

        System.out.println("========================================");
        System.out.println("Course Name          : " + course9Name);
        System.out.println("Enrolled Students    : " + enrolledStudents);
        System.out.printf("Pass Rate            : %.2f%%\n", passRate);
        System.out.printf("Average Attendance   : %.2f%%\n", attendanceRate);
    }
