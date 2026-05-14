import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = 5;
        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks " + i + ": ");
            total += sc.nextInt();
        }

        double avg = total / (double) subjects;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 90) System.out.println("Grade A");
        else if (avg >= 75) System.out.println("Grade B");
        else if (avg >= 50) System.out.println("Grade C");
        else System.out.println("Fail");
    }
}