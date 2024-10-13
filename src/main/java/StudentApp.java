import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

    String[] details1 = getDetails();
    String[] details2 = getDetails();
    String[] details3 = getDetails();

    Student s1 = new Student();
    s1.setName(details[0]);
    s1.setEmail(email);
    s1.setCourse(course);

    Student s2 = new Student();
    s2.setName(name);

    System.out.println(s1);
    System.out.println(s2);

    //System.out.println("Student 1: Name: " + student1.getName() + ", Email: " + student1.getEmail() + ", Course: " + student1.getCourse());
    //System.out.println("Student 2: Name: " + student2.getName() + ", Email: " + student2.getEmail() + ", Course: " + student2.getCourse());
    //System.out.println("Student 3: Name: " + student3.getName() + ", Email: " + student3.getEmail() + ", Course: " + student3.getCourse());

    }
    public static String[] getDetails() {
        Scanner sc = new Scanner(System.in);

        //Prompting the user for details
        String[] details = new String[3];
        System.out.println("Please enter a name: ");
        details[0] = sc.nextLine();
        System.out.println("Please enter a email: ");
        String email = sc.nextLine();
        System.out.println("Please enter a course: ");
        String course= sc.nextLine();
        System.out.println();
        return details;
    }
}
