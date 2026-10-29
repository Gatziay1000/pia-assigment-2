public double calculatePassPercentage(int passedStudents) {
        double passPercentage = ((double) passedStudents / this.enrolledStudents) * 100;
        return passPercentage;
    }
