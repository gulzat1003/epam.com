package loop;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        while (a > b) {
//            System.out.println("While ");
//            a++;
//        }
//        // Хотя бы один раз будет работать
//        do {
//            System.out.println("Do while ");
//            a++;
//        } while (a > b);

//        // Example
//        String password = "symbat123";
//        Scanner scanner = new Scanner(System.in);
//        String fromUserPassword;

        // with while
//        while (!password.equals(fromUserPassword)){
//            System.out.println("True");
//            System.out.println("Welcome to Lms");
//        }

//        do {
//            System.out.print("Enter the password: ");
//            fromUserPassword = scanner.nextLine();
//        }while (!password.equals(fromUserPassword));
//        System.out.println("Welcome!!!!");


        // Task 1
        int number  = 0; // counter болуп иштеп берет
        do {
            if (number % 3 == 0 && number % 5 == 0){
                System.out.println(number);
            }
            number++;

            } while (number < 100);
        



    }


}
