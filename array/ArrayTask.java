package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        // 1 Task
        // Создайте массив который будет принимать целые числа. Дайте размер через консоль.
        // Заполните массив
        // рандомными циврами.
        //Выведите на консоль общую сумму всех значений

//        System.out.print("Введите число: ");
//        Scanner scanner = new Scanner(System.in);
//        int lengthFromConsole = scanner.nextInt();
//
//        int [] array = new int[lengthFromConsole];
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new Random().nextInt(1, 5);
//            sum += array[i];
//
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("array.length = " + array.length);
//        System.out.println("sum = " + sum);

        // Task 2
        // Создайте массив, размер которого 10. Заполните от 1-10 и потом выведите таблицу умножение
        //для каждого числаю

        // Таблица умножение with for i
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + "*" + j + " = " + (i * j));
//            }
//            System.out.println("----------");
//        }
        // with array
//        int[] table = new int[10];
//
//        for (int i = 2; i < table.length; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//
//            }
//            System.out.println("******************");
////
////        }

            // Task 2
            //Создайте массив размер 15, заполните рандомными числами между (1-10)
            // потом посчитайте сколько четных и не четных и выведите их количество;

//            Random randoms = new Random();
//            int[] array = new int[15];
//            int evenCount = 0;
//            int oddCount = 0;
//
//            // Заполнение массива
//            for (int i = 0; i < array.length; i++) {
//                array[i] = randoms.nextInt(10) + 1; // 1–10
//                System.out.print(array[i] + " ");
//
//                if(array[i] % 2 == 0) {
//                    evenCount++;
//
//            }
//                else {
//                    oddCount++;
//                }
//        }
//        System.out.println();
//        System.out.println("Чётных чисел: " + evenCount);
//        System.out.println("Нечётных чисел: " + oddCount);

        // Task
        //Создайте массив из всех нечётных чисел от 1 до 99, выведите все
        //элементы на экран в одну строку, а затем все элементы этого же
        //массива выведите на новую строку, но в обратном порядке (99 97 95 93
        //… 7 5 3 1)


        int[] array2 = new int[50];
        int num = 1;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = num;
            num += 2;
            System.out.print(array2[i] + " , ");


        }
        System.out.println("---------");

        // Вывод в обратную порядке
        for (int i = array2.length -1; i >= 0; i--) {
            System.out.print(array2[i] + " ");
        }

        // Task 3
        




    }







}