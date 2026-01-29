import java.util.Scanner;

public class activity36 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}