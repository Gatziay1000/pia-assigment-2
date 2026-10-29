    public double calculateAverageAttendance(int totalAttendedSessions, int totalLectures) {
        int totalExpectedSessions = this.enrolledStudents * totalLectures;
        double attendancePercentage = ((double) totalAttendedSessions / totalExpectedSessions) * 100;
        return attendancePercentage;
    }
