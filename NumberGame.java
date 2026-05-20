import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        

        while (guess != number) {
            System.out.print("Enter your guessing number: ");
            guess = sc.nextInt();

            if (guess < number){
                System.out.println("Too low");
            }else if (guess > number){
                System.out.println("Too high");
            }else{
                System.out.println(" your guess is Correct!");
            }
        }
    }
}
