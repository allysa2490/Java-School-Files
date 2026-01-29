import java.util.Scanner;

public class activity38 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();

        for (int i = 0; i < num1; i++) {
            System.out.print(i + " ");
        }
    }
}
