import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();
        System.out.println("Please enter a email: ");
        String email = sc.nextLine();
        System.out.println("Please enter a course: ");
        String course = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setEmail(email);
        s.setCourse(course);

        /*
        Student firstStudent = new Student();
        firstStudent.setName("Bartek");
        firstStudent.setEmail("bartek@atu.ie");
        firstStudent.setCourse("Electroncis");

        System.out.println(firstStudent.toString());

        // second student
        Student secondStudent = new Student("Sean");

        // third student
        Student thirdStudent = new Student("Mary", "mary@atu.ie", "biology" );
        */
    }
}
