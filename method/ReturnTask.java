package method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReturnTask {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println(getArifNum(scanner.nextInt(), scanner.nextInt()));
//
//            System.out.println(getNum(49));
//
//            double result  = getArifNum(80, 9);
//            System.out.println(result);
//        }

        // Task
//        System.out.println("Сан жазыныз: ");
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int numFromConsole = scanner.nextInt();
//        System.out.println("numFromConsole = " + numFromConsole);
//
//        int randomNumber = random.nextInt(1, 5);
//        System.out.println("randomNumber = " + randomNumber);
//
//        boolean result = getNumbers(numFromConsole, randomNumber);
//        System.out.println(result);

       // Task Метод түзүнүз, параметрине массив бериңиз.
        //Парметрден келген массивдин маанилерин 2
        //ге кобойтуп кайтарып бериниз.
        //Параметрге келген массивге маанини мейн
        //методдон бериниз.

        int[] num = new int[]{3, 9, 30, 7, 3 };
        int[] result = multiplyByTwo(num);
        System.out.println("Жаны сан: ");
        System.out.println(Arrays.toString(result));


        //Метод түзүнүз, параметрине массив бериңиз.
        //Массивге маанини мейн методдон сканнер аркылуу бериниз.
        //Массивдин размери 10 болсун.
        //Метод берилген массивдин эң кичине элементин кайтарсын.
        //Кайтарган маанинин квадратын табыныз.



    }
    // // trinary operator
    //        return number == 0? "Hello" : "Bye";

    public static String  getNum (int n ){
        return n % 2  == 0? "Жуп сан" : "Так сан";
    }

    public static double getArifNum(int n , int b){
        return (double) (n + b ) / 2; // double casting
    }

    public static boolean getNumbers(int number, int number1){
//        if (number == number1){
//            return  true;
//        }
//        else {
//            return  false;
//        }
        // еще одна решения
        return number == number1; // true, false
    }

    public static int[] multiplyByTwo(int[] array){
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;

    }





}
