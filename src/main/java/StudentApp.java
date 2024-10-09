import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        String[] details1 = getDetails();

        /*
        Student s = new Student();
        s.setName(name);
        s.setEmail(email);
        s.setCourse(course);

        Student s2 = new Student("Mary", "mary@atu.ie", "biology" );
        System.out.println(s);
        System.out.println(s2);

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
    public static String[] getDetails() {

        Scanner sc = new Scanner(System.in);
        //Prompting for details
        String[] details = new String[2];
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();
        System.out.println("Please enter a email: ");
        String email = sc.nextLine();
        System.out.println("Please enter a course: ");
        String course = sc.nextLine();
        return details;
    }

}
