package condition;

import java.util.Random;
import java.util.Scanner;


public class Task {
    public static void main(String[] args) {

        // Task 1
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.print("Введите время: ");
//        int time = scanner4.nextInt();
//
//        if (time >= 4 && time <= 12){
//            System.out.print("Доброе утро");
//
//        }else if (time >= 13 && time <= 18){
//            System.out.print("Добрый день");
//
//        } else if (time >= 18 && time <= 24) {
//            System.out.println("Добрый вечер");
//        } else if (time >=0 && time <= 4) {
//            System.out.print("Доброй ночи");
//        }
//        else {
//            System.out.println("Theris no such time");
//        }

        // Task 2 with if else

//        String turuktuuUserName = "Gulzat";
//        String turuktuuUserPassword = "1234";
//
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.print("Put your login: ");
//        String name = scanner5.nextLine();
//
//        System.out.print("Put your password: ");
//        String password = scanner5.nextLine();


//        if (turuktuuUserName.equals(name) && turuktuuUserPassword.equals(password)){
//            System.out.println("Authentication passed");
//        } else {
//            System.out.println("Authentication failed");
//        }

        //       int a = scanner.nextInt();
//        String result = a >= 18 ? "Jogoru" : "Kichine";
//        System.out.println(result);

        //with ternary operator
//       String auth = turuktuuUserName.equals(name) && turuktuuUserPassword.equals(password) ? "Ternary way: Authentication passed" : "Trenary way: Authentication failed";
//        System.out.println(auth);

        // Task 6
        /*1. Колдонуучудан жашын, жынысын (М же F), уй-булелук абалын
                (Ооба же Жок) киргизууну сураныныз, эгерде кызматкер аял
        болсо, анда ал шаарларда гана иштейт. эгерде кызматкер эркек
        жана 20 жаштан 40 жашка чейинки болсо, каалаган жерде иштей алат. Кызматкер эркек болсо жана 40 жаштан 60 жашка
        чейинки болсо, анда ал шаар жеринде гана иштейт. Жана башка курактык киргизуу менен, "ERROR" керсетулушу керек.

         */

        //Task 3
//        Scanner scanner6 = new Scanner(System.in);
//        System.out.print("Put your age: ");
//        int age = scanner6.nextInt();
//
//        System.out.print("Put your gender (M or F): ");
//        char gender = scanner6.next().charAt(0);
//
//        System.out.print("Marital status (true, false): ");
//        boolean status = scanner6.nextBoolean();
//
//        if (gender == 'F') {
//            System.out.println("She can work only in the city");
//
//        } else if (gender == 'M' && age >= 20 && age <= 40) {
//            System.out.println("He can work anywhere");
//
//        } else if (gender == 'M' && age > 40 && age <= 60) {
//            System.out.println("He can work only in the city");
//
//        } else {
//            System.out.println("ERROR");
//        }

        // Task 4
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.print("Үч орундуу сан жазыныз: ");
//        int number = scanner3.nextInt();
//
//        int a = number / 100;        // первая цифра
//        int b = (number / 10) % 10;  // вторая цифра 📌(Оператор % — это остаток от деления.) Остаток от деления на 10 — всегда последняя цифра числа.
//        int c = number % 10;         // третья цифра
//
//        System.out.println(c + " " + b + " " + a);

        /*
        🧠 Золотые правила для цифр числа:
        Что хотим получить             Как делаем
        Последнюю цифру                n % 10
        Убрать последнюю               n / 10
        Сотни (для 3-значного)         n / 100
        Среднюю цифру                  (n / 10) % 10

         */

        //Task 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Уч орундуу сан жаз!: ");
//        int num = scanner.nextInt();
//
//        int a = num / 100; // сотни
//        int b = (num / 10) % 10; // десятки
//        int c = num % 10; // единицы
//
//        int reversed = c * 100 + b * 10 + a;
//
//        int result = reversed - 20;
//        System.out.println("Reversed: " + reversed);
//        System.out.println("Output: " + result);

        //reversed = c*100 + b*10 + a

        //Task 6
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("Сан жазыныз: ");
//
//        int number = scanner2.nextInt();
//        System.out.println("Input: " + number);
//
//        if (number > 0){
//            System.out.print( "Output: " + number * 2);
//        } else if (number < 0) {
//            System.out.print( "Output: " + number);
//
//        }else {
//            System.out.println("Output: " + "Пишите положителный или отрицательный цивры");
//        }

        // Task 7

//        Scanner scanner3 = new Scanner(System.in);
//        System.out.print("Put a number!: ");
//        int num = scanner3.nextInt();
//
//        if (num > 0 ){
//            System.out.println("Положительное ");
//        } else if (num < 0 ) {
//            System.out.print("Отрицательное ");
//        } else {
//            System.out.println("Ноль");
//        }

        // Task 8

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Напиши целое положительное число!: ");
//        int num = scanner.nextInt();
//
//        if (num >= 100){
//            num = num - 1;
//        } else {
//        System.out.println("Error");
//        }
//        System.out.println("Output: " + num);


        // Task 9
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Окуучулардын санын жазыныз!: ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Отургучтардын санын жазыныз! ");
//        int num2 = scan.nextInt();
//
//        if (num1 > num2){
//            System.out.println("Отургучтар жетпей калат экен");
//        } else if (num1 < num2) {
//            System.out.println("Отургучтардын саны окуучулардан коп экен! ");
//
//        } else {
//            System.out.println(" Отургучтар жетет экен! ");
//        }

        //Task 10
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Уч сан жазыныз!: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (a <= b && a <= c) {
//            if (b <= c) {
//                System.out.print(a + ". " + b + ". " + c);
//            } else {
//                System.out.println(a + ". " + c + ". " + b);
//            }
//        } else if (b <= a && b <= c) {
//            if (a <= c) {
//                System.out.println(b + ". " + a + ". " + c);
//            } else {
//                System.out.println(b + ". " + c + ". " + a);
//            }
//        } else {
//            if (a <= b) {
//                System.out.print(c + ". " + a + ". " + b);
//            } else {
//                System.out.println(c + ". " + b + ". " + a);
//            }
//        }

        //Task 11

//        Scanner scanner =  new Scanner(System.in);
//        System.out.print("Сан жазыныз!: ");
//        int num =scanner.nextInt();
//
//        if (num < 0){
//            num = num * num;
//            System.out.print ("Output: " + num);
//        }
//        else {
//            System.out.println("Error");
//        }

        // Task 12

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Cive the number!: ");
//        int num = scanner.nextInt();
//
//        int lastDigit = num % 10;
//        int rounded;
//        //  Пример: 433
//        // 433 % 10 = 3
//        if (lastDigit < 5) { // 3 < 5 → округляем вниз
//            rounded = num - lastDigit; // 433 - 3 = 430
//        } else {
//            rounded = num + (10 - lastDigit);
//        }
//        System.out.print("Otput: " + rounded);

//        Пример 1: 433
//		433 % 10 = 3
//		3 < 5 → округляем вниз
//		433 - 3 = 430
//
//        Пример 2: 56
//		56 % 10 = 6
//		6 ≥ 5 → округляем вверх
//		56 + (10 - 6) = 60

        //Альтернатива (через Math.round)
//        int round = Math.round(num / 10.0f) * 10;
//        System.out.println(round);

        // Task 13
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter month number: ");
//
//        int month = scanner.nextInt();
//
//        if (month >= 1 && month <= 12){
//            System.out.println("This is a valid month number");
//        }
//        else {
//            System.out.println("ERROR: This is not a month number");
//
//        }

        //Task 14

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Put a number with 3 digital!: ");
//        int num = scanner.nextInt();
//
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;

//        Выражение               Что делает                                     Пример для 272
//        number / 100            убирает 2 последние цифры                      272 / 100 = 2
//        (number / 10) % 10      убирает последнюю, берёт новую последнюю       272 → 27 → 7
//        number % 10             берёт последнюю цифру                          272 % 10 = 2

//
//        if (a == b && a == c && b == c){
//            System.out.println("Количество разных цифр: 1");
//        } else if (a == b || a == c || b == c) {
//            System.out.println("Количество разных цифр: 2");
//
//        }else {
//            System.out.println("Количество разных цифр: 3");
//        }


        // Task 15
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Консольго бир символ жазыныз! ");
//        char symbol = scanner.next().charAt(0);
        //1️⃣ Как мы считываем символ
        // 	•	scanner.next() → считывает строку
        //	•	.charAt(0) → берёт первый символ
        //	•	в итоге получаем char
        //      Что значит ch >= 'A' && ch <= 'Z'?
        //      В компьютере каждый символ — это число (таблица ASCII / Unicode).
        //      Латинские буквы расположены подряд:

//        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
//            System.out.println("Введённый символ является буквой латинского алфавита");
//        } else {
//            System.out.println("Введённый символ НЕ является буквой латинского алфавита");
//        }

        //Task 15
//        Scanner scan = new Scanner(System.in);
//        System.out.print(" Сиз биринчи келдиниз, атынызды жазыныз: ");
//        String string = scan.nextLine();
//
//        System.out.print("Сиз биринчи эмессиз, атынызды жазыныз: ");
//        String string1 = scan.nextLine();

//        if (string.equals(string1)){
//            System.out.println("Вы тезки");
//        }
//        else {
//            System.out.println("Вы не тезки");
//        }

        // with trenary operation

//        String result = string.equals(string1) ? "Вы тезки" : "Вы не тезки";
//        System.out.println(result);

        // Напишите программу, которая генерирует числа от 1 до 3.
        // 1 - камень. 2 - ножницы, 3 бумага. Сиз озунуз бир сан бересиз консольдон
        //анан текшересиз

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Колдонуучунун тандоосу
        System.out.println("1 - Камень, 2 - Ножницы, 3 - Бумага");
        System.out.print("Сиз танданыз: ");

        int user = scanner.nextInt();

        // Компьютердин тандоосу (1–3)
        //📌 Эсиңизде сактаңыз
        // Код                   Натыйжа
        //nextInt(3)             0–1-2
        //nextInt(3) + 1         1–3 (Бизге оюн үчүн: 1 → Камень 2 → Ножницы 3 → Бумага то есть 1ден 3 чейин керек ошон учун + 1 кошулат


        int computer = random.nextInt(3) + 1;

        String userChoice = "";
        String computerChoice = "";

        // Колдонуучунун варианты
        if (user == 1) userChoice = "Камень";
        else if (user == 2) userChoice = "Ножницы";
        else if (user == 3) userChoice = "Бумага";

        // Компьютердин варианты
        if (computer == 1) computerChoice = "Камень";
        else if (computer == 2) computerChoice = "Ножницы";
        else if (computer == 3) computerChoice = "Бумага";

        // Толук маалымат
        System.out.println("Сизде: " + userChoice);
        System.out.println("Компьютерде: " + computerChoice);

        // Натыйжа
        if (user == computer) {
            System.out.println("Тең чыкты!");
        } else if (
                (user == 1 && computer == 2) ||
                        (user == 2 && computer == 3) ||
                        (user == 3 && computer == 1)
        ) {
            System.out.println("Сиз уттунуз!");
        } else {
            System.out.println("Компьютер утту!");
        }

    }


}




