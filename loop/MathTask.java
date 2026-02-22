package loop;

import java.util.Scanner;

public class MathTask {
    public static void main(String[] args) {

        // Math task 1
//        Scanner scanner = new Scanner(System.in);
//        // Имя и фамилия
//        System.out.print("Жумушчунун аты-жонун жаз: ");
//        String fullName = scanner.nextLine();
//
//        // Год рождения
//        System.out.print("Туулган жылын жаз: ");
//        int birthYear = scanner.nextInt();
//
//        // Год начала работы
//        System.out.print("Жумушка кайсы жылы кирген: ");
//        int workStartYear = scanner.nextInt();
//
//        // Текущий год
//        System.out.print("Азыр кайсы жыл: ");
//        int currentYear = scanner.nextInt();
//
//        // Расчёты
//        int age = currentYear - birthYear;
//        int workExperience = currentYear - workStartYear;
//
////        // Вывод
////        System.out.println("Жумушчунун аты-жону: " + fullName);
////        System.out.println("Жашы: " + age + " жыл");
////        System.out.println("Жумуш стажы: " + workExperience + " жыл");
//        System.out.printf("""
//            * Жумушчунун аты-жону: %s
//            * Жашы: %d
//            * Жумуш стажы: %d
//            """, fullName, age, workExperience );

//        // Task2
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("1-ое целое число: ");
//        int num = scanner1.nextInt();
//
//        System.out.print("2-го целого числа: ");
//        int num1 = scanner1.nextInt();
//
//        int result = num - num1;
//
//
//        System.out.printf("""
//                * Расстояние между двумя целыми числами: %s
//                * Максимальное целое число: %s
//                * Мин.целое число: %s
//
//                """, result, Math.max(num, num1), Math.min(num, num1));

        //Task 3
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Үч орундуу сан жазыныз: ");
        int number = scanner3.nextInt();

        int a = number / 100;        // первая цифра
        int b = (number / 10) % 10;  // вторая цифра 📌(Оператор % — это остаток от деления.) Остаток от деления на 10 — всегда последняя цифра числа.
        int c = number % 10;         // третья цифра

        System.out.println(c + " " + b + " " + a);

        /*
        🧠 Золотые правила для цифр числа:
        Что хотим получить             Как делаем
        Последнюю цифру                n % 10
        Убрать последнюю               n / 10
        Сотни (для 3-значного)         n / 100
        Среднюю цифру                  (n / 10) % 10

         */


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Эки орунду сан жаз: ");
//
//        int number = scanner.nextInt();
//
//        int tens = number / 10;   // ондуктар
//        int ones = number % 10;   // бирдиктер
//
//        System.out.println("Output: " +  (tens * 10) + " + " + ones);

        // Task 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Уч орундуу сан жаз: ");
//        int number1 = scanner.nextInt();
//        int hundred = number1 / 100;
//        int tens1 = number1 / 10;
//        int ones1 = number1 % 10;
//
//        System.out.println("Output: " +(hundred * 100) + " + " +  (tens1 * 10) + " + " + ones1);

        //Task 4
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Суйлом жазыныз!: ");
//
//        String sentence = scanner1.nextLine();
//
//        String[] word = sentence.split(" ");
//
//        int i = 0;
//        while (i < word.length) {
//            System.out.println(word[i]);
//            i++;
//        }

        // Task

        // 0 менен 1дин ортосунда кокус сан
        double randomNumber = Math.random();

        // 3кө көбөйтөбүз
        double result = randomNumber * 3;

        // Тегеректөөлөр
        long roundResult = Math.round(result);
        double ceilResult = Math.ceil(result);
        double floorResult = Math.floor(result);

        // Натыйжаларды чыгарабыз
        System.out.println("Random number (0-1): " + randomNumber);
        System.out.println("After * 3: " + result);

        System.out.println("Math.round: " + roundResult);
        System.out.println("Math.ceil: " + ceilResult);
        System.out.println("Math.floor: " + floorResult);


    }
}















