package method;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MethodReturnClass {
    public static void main(String[] args) {

        int age = getAge(2000, 2025);
        System.out.println(age + 5);



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Write the number: ");
//        int scanNum = scanner.nextInt();
//        System.out.println( getInfoByNumber(scanNum));

        // calculator

        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        char symbol = scanner.next().charAt(0);
        int secondNum = scanner.nextInt();

       double calculated = (calculator(firstNum, symbol, secondNum));
        System.out.print(calculated);

//        showPhoneName();
//        System.out.println(getPhoneName());

    }

    // method void
    public static void showPhoneName(){
        System.out.println("Iphone 11");
    }

    // method return

    public static String getPhoneName(){
        return "Iphone 15";
    }

    public static byte getAge(){
        return 36;
    }
    public static char hetGender(){
        return 'M';
    }
    public static boolean check(){
        return true;
    }


    public static String getInfoByNumber(int number){
//        if(number == 0)  return "Hello";
//
//        else if(number == 1) return "Bye";
//
//        else return "Invalid number";

        // trinary operator
        return number == 0? "Hello" : "Bye";

    }

    // calculator Task
    public static double calculator(int a, char symbol, int b){


        switch (symbol){
            case '+' ->{
                return a + b;
            }
            case '-' ->{
                return a - b;
            }
            case '*' ->{
                return   a * b;

            }
            case '/' ->{
                return   a / b;
            }
        }
        return 0;
    }

    public static int getAge(int dateBirth, int currentYeah){
        return currentYeah - dateBirth;

    }





}
