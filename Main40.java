import java.util.*;

class Main40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int user_age = sc.nextInt();
        int difference = 100 - user_age;
        System.out.println("You are " + difference + " years from being 100.");
    }
}