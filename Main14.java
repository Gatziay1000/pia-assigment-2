public class Main14 {
    public static void main(String[] args) {
        System.out.println("IUEA Student Enrolment Tracking System\n");

        Course bit2115 = new Course("BIT2115: Java Programming", 45);
        bit2115.displayCourseInfo(40, 400, 10);

        Course bscs2101 = new Course("BSCS2101: Data Structures", 60);
        bscs2101.displayCourseInfo(52, 540, 10);

        Course bsse2104 = new Course("BSSE2104: Software Engineering", 35);
        bsse2104.displayCourseInfo(33, 315, 10);
    }
}
