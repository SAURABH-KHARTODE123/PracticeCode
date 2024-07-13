package CustomExceptionDemo;

import java.util.Scanner;

public class CustomExceptionDemo {

    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close(); // Closing the scanner to avoid resource leaks

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
