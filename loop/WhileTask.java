package loop;

import java.util.Random;
import java.util.Scanner;

public class WhileTask {
    public static void main(String[] args) {

        //Напишите класс, который создает 20 случайных чисел диапазона 1 - 99.
        // Следует вывести в консоль только те числа которые делятся на 1-ое рандомное число без остатка.
        // Нельзя использовать массив так как еще не проходили. Цикл нужно использовать

//        Random random = new Random();

        //1️⃣ Почему первое число отдельно?
        //делиться должны на первое рандомное число
        //Мы должны его сохранить, иначе сравнивать будет не с чем.

//        int firstNumber = random.nextInt(99) + 1;
//        System.out.println("First random number (divider) : " + firstNumber);
//
//        int count = 1;
//        while (count < 20) {
//            int num = random.nextInt(99) + 1;
//
//            if (num % firstNumber == 0) {
//                System.out.println(num + "is divisible by " + firstNumber);
//            }
//            count++;
//        }
        //Мы сначала сохраняем первое случайное число, потом в
        // цикле генерируем остальные и сразу проверяем делимость.
        //3️⃣ Основная идея
        //	•	% показывает остаток
        //	•	Если остаток = 0 → число делится на делитель без остатка
        //	•	Если остаток ≠ 0 → не делится


        //Напишите класс который генерирует 20 рандомных чисел из диапазона -50 до +50,
        // и определяет наименьшее число и наибольшее число

        Random random1 = new Random();
        //📊 Получается вот что:
        //Было (0–100)         После -50         Итог
        //0                    -50               минимум
        //50                    0                середина
        //100                   50               максимум
        //      int number = random1.nextInt(101) - 50;

        //Если мы не зададим начальные значения min и max то сравнивать будет не с чем
        // каждый раз Генерируется новое число
        //Если меньше текущего min → обновить
        //Если больше текущего max → обновить

//        int min = number;
//        int max = number;
//
//        System.out.println("Generated number: ");
//        System.out.println(number);
//
//
//        int count1 = 1;
//        while (count1 < 20) {
//            number = random1.nextInt(101) - 50;
//            System.out.println(number);

        //  1.	Генерируем первое число
        //	2.	Считаем его и минимумом, и максимумом
        //	3.	Потом каждое новое число сравниваем:
        //	•	если меньше → обновляем минимум
        //	•	если больше → обновляем максимум

//            if (number < min) {
//                min = number;
//            }
//            if (number > max) {
//                max = number;
//            }
//            count1++;
//
//            System.out.println("Minimum:" + min);
//            System.out.println("Maximum:" + max);
//
//        }

        // Напишите класс, который принимает с консоли для переменной
        //А целое положительное число, а затем дополнительно будет спрашивать
        // еще числа, эти числа будут должны вычитаться из переменной х,
        // вы будете вводить числа до тех пор пока Х не будет отрицательным или равен О.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите положительное число X:: ");
//        int x = scanner.nextInt();
//
//        while (x > 0) {
//            System.out.println("Введите число для вычитания: ");
//            int number = scanner.nextInt();
//
//            x = x - number;
//            System.out.println("Текущее значение X = " + x);
//        }
//        System.out.println("X стало нулевым или отрицательным. Программа завершена");


        //Task

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int randomNumber = random.nextInt(10) + 1;
//        int userNumber = 0;
//
////👉 Колдонуучу туура тапмайынча цикл айлана берет.
//        while (userNumber != randomNumber) {
//            System.out.print("1ден 10го чейин сан киргизиниз: ");
//            userNumber = scanner.nextInt();
//
//            if (userNumber < randomNumber) {
//                System.out.println("Берилген сан random сандан кичине, кайра аракет кылыныз!");
//            } else if (userNumber > randomNumber) {
//                System.out.println("Берилген сан random сандан чон, кайра аракет кылыныз!");
//            } else {
//                System.out.println("Куттуктайбыз! Сиз туура таптыңыз!");
//
//            }
//
//        }

//        int row =1;
//
//        while (row <= 4){
//            int col = 1;
//            while (col <= 10) {
//                System.out.print("*");
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

//        int row1 = 1;
//        while (row1 <= 5){
//            int col = 1;
//
//            while (col <= row1 ){
//                System.out.print("*");
//                col++;
//            }
//            System.out.println();
//            row1++;
//
//        }
//
//        int row = 1;
//
//        while (row <= 5) {
//
//            int space = 1;
//            while (space <= 5 - row) {
//                System.out.print(" ");
//                space++;
//            }
//
//            int star = 1;
//            while (star <= row) {
//                System.out.print("*");
//                star++;
//            }
//
//            System.out.println();
//            row++;
//        }

//  Ёлка из звёзд (центрированная)
        int row = 1;

        while (row <= 5) {

            int space = 1;
            while (space <= 5 - row) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while (star <= (2 * row - 1)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            row++;
        }

        // Task Четные цифры, Нечетные цифры:

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//
//        int temp = Math.abs(number); // если число отрицательное
//
//        String evenDigits = "";
//        String oddDigits = "";
//
//        //% 10  → взять последнюю цифру
//        // 10  → убрать последнюю цифру
//
//        while (temp > 0) {
//
//            int digit = temp % 10;
//
//            if (digit % 2 == 0) {
//                evenDigits = digit + " " + evenDigits;
//            } else {
//                oddDigits = digit + " " + oddDigits;
//            }
//
//            temp = temp / 10;
//        }


//        System.out.println("Четные цифры: " + evenDigits);
//        System.out.println("Нечетные цифры: " + oddDigits);

        //Напишите класс, который принимает с клавиатуры целое положительное число
        // любой длины, а затем выводит его первую цифру.
        //Например, для числа 7659 на экран будет выведено 7.

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Напишите целое положительное число!: ");
//        int num = scanner1.nextInt();
//
//        //«Пока число состоит из БОЛЕЕ чем одной цифры — продолжать» Почему? Все двузначные и больше: поэтому 10 и больше
//        while (num >= 10) {
//
//            //Когда делим на 10, мы убираем младший разряд.
//            num = num / 10;
//
//        }
//        System.out.println("Первая цифра числа: " + num);

        // Напишите класс, который принимает с клавиатуры
        // целое число любой длины и строит из него число с обратным порятком
        // цивр. Новое значение следует вывести в консоль

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int reversed = 0;
       // Условия: Повторять цикл , пока число не станет 0
        while (number != 0) {

            int digit = number % 10;   // берём последнюю цифру
            reversed = reversed * 10 + digit; // добавляем в новое число
            number = number / 10; // убираем последнюю цифру
        }

        System.out.println("Число в обратном порядке: " + reversed);
    }


    }










