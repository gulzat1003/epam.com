import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello %s   wor%dld", " Gulzat", 35);
//        System.out.println("Another     feature line");
//        int num = 34;
//
//        int num1 = 49098;
//        int num2 = 546;
//        int sum = num1 * num2;
//
//        System.out.println(num1 % num2);
//        System.out.println("Sum: " + sum);
//
//        System.out.println("-----------------");
//
//        Scanner scannerForNum = new Scanner(System.in);
//        Scanner scannerForText = new Scanner(System.in);  //option + command + R (выделят и перименовать везде)
//        System.out.print("Write first number: ");
//        int firstNumber = scannerForNum.nextInt();
//
//        System.out.println("firstNumber = " + firstNumber); // soutv
//
//
//        System.out.print("Write second number ");
//        int secondNumber = scannerForNum.nextInt();
//
//
//        //System.out.println("Result: " + (firstNumber + secondNumber));
//
//        System.out.print("Boolean varieables: ");
//        boolean booleanValue = scannerForNum.nextBoolean();
//
//        System.out.print("Char var: ");
//        char charSymbol = scannerForNum.next().charAt(0);
//        System.out.println("charSymbol = " + charSymbol);
//
//        System.out.print("String var: ");
//        String text = scannerForText.nextLine();
//        System.out.println("text = " + text);
//
//        System.out.println("==============");


        Scanner scanner = new Scanner(System.in);

        // Имя и фамилия
        System.out.print("Жумушчунун аты-жонун жаз: ");
        String fullName = scanner.nextLine();

        // Год рождения
        System.out.print("Туулган жылын жаз: ");
        int birthYear = scanner.nextInt();

        // Год начала работы
        System.out.print("Жумушка кайсы жылы кирген: ");
        int workStartYear = scanner.nextInt();

        // Текущий год
        System.out.print("Азыр кайсы жыл: ");
        int currentYear = scanner.nextInt();

        // Расчёты
        int age = currentYear - birthYear;
        int workExperience = currentYear - workStartYear;

//        // Вывод
//        System.out.println("Жумушчунун аты-жону: " + fullName);
//        System.out.println("Жашы: " + age + " жыл");
//        System.out.println("Жумуш стажы: " + workExperience + " жыл");
        System.out.printf("""
            * Жумушчунун аты-жону: %s
            * Жашы: %d
            * Жумуш стажы: %d  
            """, fullName, age, workExperience );


    }
}
