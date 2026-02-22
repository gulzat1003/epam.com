package method;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        method(6, 7, 89, 0, 1, 20, 50, 3, 0, 12);
//        method1(2003, "Guli ", "Peri ", "Ramazan ", "Nur ");
//        long result = getSum(4,6,7,32,56,7,2,5);
//
//        System.out.println("-----------");
//        System.out.println(result);

//        table(1, 2, 3,4,5,6,7,8,9);

 //       varArgsMethod(3,2,23,4,13,56,45,2);

//        double ariff = findAverage(2, 1, 9);
//        System.out.println(ariff);
//
//        double result = findAverage1(4, 7, 9, 0, 5, 4, 2, 4, 5, 6);
//        System.out.println("Среднее арифметическое: " + result);

        System.out.println(getWorldByIndex(2, false,"Sanjar", "Melsi", "Kalys", "Meder"));
        int result1 = countWordsWithChar('a', "Apple", "Banana", "Juice", "Pineapple");
        System.out.println(result1);

        String[] result = replaceEverySecond("Java", "one", "two", "three", "four", "five", "six");
        for (String word: result){
            System.out.println(word + "");
        }

    }

    public static void method(int... varargs) {
        System.out.println("number = " + Arrays.toString(varargs));
        System.out.println("varargs.length = " + varargs.length);
        System.out.println("varargs[0] = " + varargs[0]);

    }

    // башында канча переметр берсе дагы без разницы, гласное в конце один varArgs болушу шарт
    //Varargsетодтун параметрде гана колдонулат
    public static void method1(int year, String... studentName) {
//        for (int i = 0; i < studentName.length; i++) {
//            System.out.println(studentName[i]);
//
//        }
        // with while
        int index = 0;
        while (index < studentName.length) {
            System.out.print(studentName[index++]);
        }
    }

    public static long getSum(int... num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    // Таблица умножения c ForEacah
    public static void table(int... numbers) {
        ;
        for (int element : numbers) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(element + "*" + i + "=" + (element * i));
            }
            System.out.println();


        }

    }

    // Таблица умножение
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j <= 10 ; j++) {
//                System.out.println(i + "*" + j + " = " + (i * j));
//            }
//            System.out.println("----------");
//
//        }

    // Метод тузунуз сандардын varargs-ын алсын ошол varargs тын ар бир элементеринин
    // ичинен так жана жуп сандардын
    // санын чыгарыныз

    public static void varArgsMethod(int... numbers) {

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else oddCount++;

        }
        System.out.println("Жуп сандар: = " + evenCount);
        System.out.println("Так сандар: = " + oddCount);

    }
    // varArs with for each
    //Создайте метод который принимает количество целых
    // чисел и возврощает их среднее арифметическое число

    public static double findAverage(int ... numbers){
        if(numbers.length == 0){
            return 0;
        }
        int sum = 0;

        for (int num : numbers){
            sum += num;
        }
        return (double) sum / numbers.length;

    }

    // for i
    public static double findAverage1 (int ... numbers1){
        int sum = 0;
        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];
        }
        return (double) sum / numbers1.length;
    }

    public static String getWorldByIndex(int index, boolean isTrue, String ... words){
        String word;
        if (index >= words.length){
            return "Мындай индех жок";

        }else {
            word = words[index];
            return isTrue ? word.toUpperCase() : word.toLowerCase();
        }
    }

    // Создайте метод который берет в параметры бесконечный массив слов и char,
    // метод должен проверить на наличие символа в каждом слове данного
    // через параметр и в конце вернуть количество слов в которых встречался этот символ

    public static int countWordsWithChar(char symbol, String... words){

//        int count = 0;
//       for (String word : words ){
//           if(word.indexOf(symbol) != -1){
//               count++;
//           }
//       }
//       return  count;
        // for i
        int count = 0;
        for (String word: words){
            for (int i = 0; i < words.length; i++) {
                if(word.charAt(i) == symbol){
                    count++;
                    break;

                }


            }

        }
        return count;


    }
    // Создайте метод который берет в парметры бесконечный массив слов и одно слово. Ваш метод должен заменить
    //каждое второе слово на то  которое было задано через параметр и возвращает этот новый массив
    public static String[] replaceEverySecond (String string, String... words){
        String[] newArray = new String[words.length];

        for (int i = 0; i < words.length; i++) {

            if (i % 2 == 1) {
                newArray[i] = string;
            }else {
                newArray[i] = words[i];
            }

        }
        return newArray;



    }









}
