import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();
        sc.nextLine();
        
        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter Subject Name: ");
            String subjectName = sc.nextLine();

            System.out.print("Enter marks in " + subjectName + ": ");
            int marks = sc.nextInt();

            sc.nextLine();
            
            total =total+marks;
        }

        double avg = total / (double) subjects;

        System.out.println("\nStudent Name: " +name );
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 90){
            System.out.println("Grade A");
        }else if (avg >= 75){
             System.out.println("Grade B");
        }else if (avg >= 50) {
            System.out.println("Grade C");
         } else {
            System.out.println("Fail");
         }
    }
}