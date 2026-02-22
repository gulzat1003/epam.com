package condition;

import java.util.Scanner;

public class TernaryClass {
    public static void main(String[] args) {
       // Task 1
        String turuktuuUserName = "Gulzat";
        String turuktuuUserPassword = "1234";

        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Put your login: ");
        String name = scanner5.nextLine();

        System.out.print("Put your password: ");
        String password = scanner5.nextLine();

        String auth = turuktuuUserName.equals(name) && turuktuuUserPassword.equals(password) ? "Ternary way: Authentication passed" : "Trenary way: Authentication failed";
        System.out.println(auth);


       // Task2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программалоо тилин жаз: ");
        String proLang = scanner.nextLine();


        String result = proLang.equals("Java") ? "Бул жава тили" : "Жок, бул жава тили эмес";
        System.out.println(result);
    }

    //  int a = scanner.nextInt();
    //        String result = a >= 18 ? "Jogoru" : "Kichine";
    //        System.out.println(result);


}
