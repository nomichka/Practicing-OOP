package ScannerPractice;

import java.util.Scanner; // java.util has a lot of useful classes

public class Runner {
    public static void main(String[] args) {
        // Scanner <scanner-name> = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Please say 'Hello!' back!");
        String greeting = input.nextLine(); // nextLine() returns what I write before I press enter

        if (greeting.equals("Hello!")) {
            System.out.println(":D");
        } else {
            System.out.println("I hate you.");
        }
        input.close();
    }
}
