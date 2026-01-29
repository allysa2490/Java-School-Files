import java.util.*;

class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret_number = 5;
        System.out.println("Guess what the secret number is (1-10): ");
        int user_guess = sc.nextInt();
        
        if (user_guess == secret_number) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}