package loop;

import java.util.Scanner;

public class ForIClass {
    public static void main(String[] args) {
//        int c = 0;
//        while (c < 10) {
//            c++;
//            System.out.println(c + ": While");
//
//        }
//
//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println(i + ": For i");
//        }
//        int a = 1;
//        for (int i = 3; i >= 1; i--) {
//            a = a + 1;
//            System.out.println(a);
//        }
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Write the number: ");
//        int number = scanner.nextInt();
//
//        System.out.println();
//
//        for (int i = 1; i <= number; i++) {
//            System.out.print("* ");
//
//        }
//        System.out.print("Введите номер: ");
//        int number = new Scanner(System.in).nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//
//        }

//        for (int i = 0; i <= 10; i--) {
//            i += 3;
//            System.out.println("i = " + i);
//            System.out.println(i * i);
//
//        }

//        for (int i = 0; i <= 10 ; i+=2) {
//            //System.out.println("i = " + i);
//            System.out.println(i );
//        }
        // Task 1
        //Консольдон бир сан алыңыз. Берилген санга чейинки
        //жуп сандарды чыгарып, алардын суммасын табыныз
        //Мисалы: 10
        //Жооп: 2 + 4 + 6 + 8 = 20

//        System.out.print("Консольго сан жазыныз: ");
//        int num = new Scanner(System.in).nextInt();

        //with while
//        int i = 2;          // начинаем с первого чётного
//        int sum = 0;
//
//        while (i < num) {
//            System.out.print(i);
//            sum += i;
//            if (i + 2 < num) {
//                System.out.print(" + ");
//            }
//            i += 2; // переходим к следующему чётному
//        }
//        System.out.println(" = " + sum);

        // for i
//        int sum = 0;
//        for (int i = 2; i < num ; i += 2) {
//            System.out.print ( i);
//            sum += i;
//            if( i + 2 < num) {
//                System.out.print(" + ");
//            }
//        }
//        System.out.println(" = " + sum);
//
//        // Вложенный цикл
//        for (int i = 0; i < 5  ; i++) {
//            System.out.println("Outer loop: ");
//
//            for (int j = 0; j < 10; j++) {
//                System.out.println("Inner loop");
//
//            }
//
//        }

        // Таблица умножение
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j <= 10 ; j++) {
//                System.out.println(i + "*" + j + " = " + (i * j));
//            }
//            System.out.println("----------");
//
//        }

        // Task
        //0 деген санды жазмайынча консольдон сан ала бериңиз. 0 деп жазганда, ага чейин канча сан жазган болсоңуз консольго
        //ошончо сандын количествосун,
        //алардын суммасын
        //жана орточоарифметикалыксанынчыгарыпберсин.

//        int counter = 0;
//        int sum = 0;
//        while (true) {
//            System.out.print("Write the number: ");
//            int number = new Scanner(System.in).nextInt();
//            if (number == 0) {
//                break;
//            } else {
//                counter++;
//                sum += number;
//            }
//        }
//        System.out.println("Counter: " + counter);
//        System.out.println("Summa " + sum);
//        System.out.println("Ortocho arif: " + (float) sum / counter);


        // Консолдон бир сан бериңиз, анын канча орундуу сан экенин консолго чыгарыңыз.

        System.out.print("Консольдон сан бериниз: ");
        int num = new Scanner(System.in).nextInt();
        int counter = 1;
        while (num > 10){
            num /= 10;
            counter++;
        }
        if (counter == 0){
            counter = 1;
        }
        System.out.println("Бул сан " + counter + " орундуу");








    }
}




