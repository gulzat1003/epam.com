package method;

import java.util.Random;
import java.util.Scanner;

public class VoidTask {
    public static void main(String[] args) {

        // образец

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

        // Task printGreaterThan20 метод

//        Random random = new Random();
//        int[] numbers = new int [5];
//
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = random.nextInt(50)-1;
//        }
//        printGreaterThan20(numbers);

        Random ran = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++){
            nums[i] = ran.nextInt(50)-1;
        }

        int n = 25;
        countNumber(nums, n);









//        int[] massiv = new int[]{3, 6, 9, 598};
//        printArrayElements(massiv);

//        int[] arrays = new int[]{10, 30, 40, 50};
//        int n = 50;
//        taskMethod1(arrays, n);

//        checkNumber(0);

        int[] mass = new int[]{34, 8, 9, 0};
        multiplyByTwo(mass);

        boolean[] bool = new boolean[]{true, false, true, true, false};
        taskBoolean(bool);

//        System.out.print("Сан жазыныз: ");
//        int n1 = new Scanner(System.in).nextInt();
//        System.out.println("Соз жазыныз: ");
//        String world = new Scanner(System.in).nextLine();
//
//        task2(n1, world);
//
//        task3("laptop");


    }

    public static void printArrayElements(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");

        }
    }

    public static void taskMethod1(int[] numbers, int n) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= n) {
                result = true;
                break;
            }
            System.out.println(result);
        }
    }

    public static void booleanTask(boolean[] booleans) {

    }

    public static void checkNumber(int num) {
        if (num >= 0) System.out.println("Он сан");
        else System.out.println("Терс сан");
    }

    public static void task2(int numbers, String string) {
        for (int i = 1; i <= numbers; i++) {
            System.out.println(string);
        }
    }

    public static void task3(String world) {
        for (int i = world.length() - 1; i >= 0; i--) {
            System.out.print(world.charAt(i) + " ");
        }
    }
 // Параметре бутон сандардын массивен алган
 // Жана барды бурун сандалы 2 ге кобойтулгон Жаны массивди кайтарган метод жазыныз
    public static void multiplyByTwo(int[] arrays) {

        int[] newArray = new int[arrays.length];

        for (int i = 0; i < arrays.length; i++) {
            newArray[i] = arrays[i] * 2;
        }

        System.out.println("\nЖаны метод");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
    //Напишите не возвращающий метод который берет в
    // параметры массив из boolean типа и выводит в консоль количество true элементов массива

    public static void taskBoolean(boolean[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == true)
                count++;
        }
        System.out.println("\nКоличество true элементов: " + count);
    }




    // Напишите void метод который в параметры берут массив из рандомных чисел от 1-50 выводит в консоль только
    // те числа что больше 20
    public static void printGreaterThan20(int[] array){
        System.out.println("Число больше чем 20: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 20){
                System.out.print(array[i] + " ");
            }
        }
    }
    //Напишите не возвращающий метод который берет массив из рандомных чисел от 1 до 50 и
    // еще одно целое число n
    //Нужно вывести в консоль сколько раз число n повторялось в массиве

    public static void countNumber(int[] array, int n){
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] == n){
                count++;
            }
        }
        System.out.println("Число " + n + " встречается " + count + " раз(а).");


    }
}

