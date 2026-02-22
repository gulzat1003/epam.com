package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class ArrayClass {
    public static void main(String[] args) {
//        int[] numbers = {34, 675, 8, 1, 90, 0};
//        int length = numbers.length;
////        System.out.println(length);
//
//        byte[] array = {-128, 127};
//        char[] symbol = {'d', 'R', 't', 'p', 'H'};
//
//
//        // Как создать массив
//
//        //1 вариант
//        int[] nums = {89, 99, 0, 4};
//
//        // 2 вариант
//        int[] nums1 = new int[]{45, 8, 23, 4};
//
//        // 3 вариант
//        int[] nums2 = new int[4];
//        nums2[0] = 3;
//        nums2[1] = 45;
//        nums2[2] = 31;
//        nums2[3] = 0;

   //     String[] fruits = {"Aple", "Bannana", "Limon", "Pineapple"};

//        System.out.println("fruits.length = " + fruits.length);
//        System.out.println(fruits[1]); // Bannana

//        char[] sym = new char[]{'f', 'f', 'o'};
//        int[] arr = new int[3];
//        boolean[] array2 = {true, false, true, false};
//
//        String[] phones = new String[3];
//        phones[0] = "Iphone";
//        phones[1] = "Samsung";
//        phones[2] = null;

        // Консольго чыгаруунун турлору
//        System.out.println(Arrays.toString(fruits));

        // with for i
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i] + ", ");
//        }

        // with while
//        int j = 0;
//        while (j < fruits.length) {
//            System.out.print(fruits[j] + ", ");
//            j++;
//        }

        Random random = new Random();
        int number = random.nextInt(20);
        int[] numbers1 = new int[10];

        for (int index = 0;  index < numbers1.length ; index++) {

            if (index != 8 ){
                numbers1[index] = random.nextInt(1,20);
            }else {
                numbers1[8] = 1000;
            }
        }
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print (numbers1[i] + ", ");
        }

        // Task
//        Random ran = new Random();
//        int[] arrays = new int[10];
//        int sum = 0;
//        int oneSize = 0;
//        int twoSize = 0;
//        int threeSize = 0;
//        int fourSize = 0;
//
//        for (int i = 0; i < arrays.length; i++) {
//            arrays [i] = ran.nextInt(1,5); // arrays [0]
//            sum += arrays [i];
//            switch (arrays[i]){
//                case 1 -> oneSize++;
//
//                case 2 -> twoSize++;
//
//                case 3 -> threeSize++;
//
//                case 4 -> fourSize++;
//
//            }
//        }
//
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.print(arrays[i] + " ");
//        }
//
//        System.out.println("\nSum: " + sum);
//        System.out.println("Arif: " + (sum / arrays.length));
//
//
//        int maxCounterNumber;
//
//        if(oneSize > twoSize && oneSize > threeSize && oneSize > fourSize){
//            maxCounterNumber = 1;
//        } else if (twoSize > oneSize && twoSize > threeSize && twoSize > fourSize) {
//            maxCounterNumber = 2;
//        } else if (threeSize > oneSize && threeSize > twoSize && threeSize > fourSize) {
//            maxCounterNumber = 3;
//        }else {
//            maxCounterNumber = 4;
//
//        }
//        System.out.println("maxCounterNumber = " + maxCounterNumber);
//
//// если в случайных циврах имеется 3 то каждый раз на кольсоле ввыведи Java 17
//        for (int i = 0; i < arrays.length; i++) {
//            if (arrays[i] == maxCounterNumber){
//                System.out.println("Java 17");
//            }
//
//        }

        // Рандомный 1 -20 аралыгында сандар консолго 10 жолу чыксын. Чыккан сандардын эн чонун табыныз!

//        Random rans = new Random();
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rans.nextInt(1,20);
//        }
//        System.out.println(Arrays.toString(arr));
//
//// условия если нужно найти самый маленькое число
//
//        int minNumber = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(minNumber > arr[i])
//                minNumber = arr[i];
//
//        }
//        System.out.println("minNumber = " + minNumber);
//// самоя большое число
//        int maxNumber = 0;
//        for (int i = 0;  i < arr.length; i++) {
//
//            if(maxNumber < arr[i]){
//                maxNumber =arr[i];
//            }
//        }
//
//        System.out.println("maxNumber = " + maxNumber);


        // Разница между for i и while

//        int n = 5;
//        for (int i = 0; i <= 5 ; i++) {
//            System.out.println("Java 17");
//        }
//        // while
//        int s = 5;
//        int i = 0;
//        while (i <= s){
//            System.out.println("Java 17");
//            i++;
//        }




    }
}
