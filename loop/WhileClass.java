package loop;

import java.util.Random;
import java.util.Scanner;

public class WhileClass {
    public static void main(String[] args) {
//        int counter = 0;
//        while (counter < 10){
//            counter++;
//            System.out.println(counter + " минута отту");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Сан жазыныз: ");
//        int numberFromScan = scanner.nextInt();
//
//        System.out.println("Input: " + numberFromScan );
//        System.out.print("Output: ");
//
//        if (numberFromScan > 0){
//            while (numberFromScan >= 1){
//                System.out.print( numberFromScan +" ");
//                numberFromScan--;
//
//            }
//
//        }else {
//            System.out.println("Нолдон чон сан бер!");
//        }

        // Цикл канча жолу иштейт? Ответ 1 жолу
//        int e = 4, f = 6;
//        while (e < f) {
//            e = f + e;
//        }
//        // Ответ 2 жолу
//        int a = 4, b = 6;
//        while (a < b) {
//            a = a + 1;
//        }
//
//
//      // Ответ: Иштебейт так как логика не правильно задано
//        int g = 4, h = 6;
//        while (g > h){
//             a++;
//
//        }
//        //Ответ: 4 жолу
//        int k = 2, l = 12; //Первый цикл 2<12
//                           // второй 3 + 2 = 5 (5<12)
//                           // третий 5 + 5 = 8 ( 8<12)
//                           // четвертый 3 + 8 = 11 (11<12)
//        while ( k < l) {
//            k = 3 + k;
//
//            System.out.println(k);
//        }
//
//        //Task: Жуп сандарды чыгар
//        // Н: Input 10
//        // Output: 2 4 6 8
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Сан жазыныз!: ");
//        int number = scan.nextInt();
//        int counter = 1;
//
//        System.out.println("Input: " + number );
//        System.out.println("\nOutput: ");
//
//        while (number  > counter) {
//            if (counter % 2  == 0 ){
//                System.out.println(counter);
//
//            }
//            counter++;
//        }

        // Таблица умножения
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Сан жазыныз: ");
//        int num = scanner.nextInt();
//
//        int count = 1;
//        while (count <= 10) {
//            System.out.println(num + "*" + count + "=" + (num * count));
//            count++; // +1
//        }

        // Колдонуучудан каалагандай сандарды киргизууну сураныз жана аягында
        //ал киргизилген сандардын ичинен канча он,
        // терс жана нелдук сандар бар экенин керсетуу керек. Эскертуу while циклын колдонуп чыгарыныз!

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Введите количество чисел: ");
//        int n = scanner1.nextInt();
//
//        int count1 = 1;
//        //Мы создаём счётчики
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        //Повторяется ровно столько раз, сколько ввёл пользователь.
//        while (count1 <= n) {
//            System.out.println("Введите число " + count1 + ": ");
//            int number = scanner1.nextInt();
//
//            if (number > 0) {
//                positive++;
//            }else if (number < 0){
//                negative++;
//
//            }else {
//                zero++;
//            }
//            count1++;
//
//        }
//        System.out.println("\nИнформация о введенных числах:");
//        System.out.println("Положительные числа: " + positive);
//        System.out.println("Отрицательные числа: " + negative);
//        System.out.println("Нулевые числа: " + zero);

        // Task
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите количество чисел: ");
//        int num = scan.nextInt();
//
//        int count  = 1;
//        int chetniy = 0;
//        int neChotniy = 0;
//
//        while (count <= num){
//            System.out.print("Введите число " + count + ": " );
//            int num1 = scan.nextInt();
//
//            if (num1 % 2 == 0){
//                chetniy++;
//            } else if (num1 % 2 != 0) {
//                neChotniy++;
//            }
//            count++;
//        }
//
//        System.out.println("\nИнформоция о четных и нечетных числах: ");
//        System.out.println("Четные числа: " + chetniy);
//        System.out.println("Нечетные числа: " + neChotniy);

        //Task
        //Төмөнкү тизмектерди консольго чыгарышыбыз керек:
        //7 14 28 42 56 70 84 98.
        //Көрүнүп тургандай, биринчи сан 7, андан кийин ар бир кийинки санга 7 кошулат,
        //бирок 7ден кийин кошулган сандардын арасынан жуп сандары гана консольго чыксын

        int number = 7;

        System.out.print(number + "");

        while (number < 98) {
            number = number + 7;

            if (number % 2 == 0){
                System.out.println(number + " ");
            }

        }












    }

}
