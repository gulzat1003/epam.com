package method;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        // CharAt
        String profession = "     Java Devoleper is new profession   ";
        char result = profession.charAt(9);
        System.out.println(result);

        //SubString
        System.out.println(profession.substring(3));

        String subString = profession.substring(0, 3);
        System.out.println(subString);
        System.out.println(profession.substring(0, 9));

        //Contains boolean возврощает либо true или false
        boolean result1 = profession.contains("Jav");
        System.out.println(result1);

        for (int i = 0; i < profession.length(); i++) {
            if (profession.charAt(i) == 'e') continue;
            System.out.print(profession.charAt(i));
        }

        // эгер канча 'e' бар экенин билгибиз келсе

        int counter = 0;
        for (int i = 0; i < profession.length(); i++) {
            if (profession.charAt(i) == 'e') {
                counter++;
            }
            System.out.print(profession.charAt(i));
        }
        System.out.println(" \ne size " + counter);

        //ToUppercase

        System.out.println("profession =  " + profession);
        String upperCase = profession.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        //ToLowerCase
        String toLowerCase = profession.toLowerCase();
        System.out.println("LowerCase = " + toLowerCase);

        // trim
        System.out.println("----------");
        System.out.println(profession);

        String trim = profession.trim();
        System.out.println(trim);

        // equals. equalsIgnorCase
        String name = "Sanjar";
        String name2 = "Sanjar";
        String name3 = "SANJAR";
        System.out.println(name.equals(name2)); // true
        System.out.println(name.equals(name3)); // false
        System.out.println(name.equalsIgnoreCase(name3)); //true

        System.out.println("Replace Methode!");

        // replace

        String str = "Java Developer";
        System.out.println("str = " + str);
        String replace = str.replace("Java", "C#");
        System.out.println("replace = " + replace);

        //Length
        System.out.println("profession.length() = " + profession.length());

        String phoneNumber = "+996700429260";
        String phoneNumber1 = "+996700429260";
        String phoneNumber2 = "+8766700429260";
        String phoneNumber3 = "+7743700429260";
        System.out.println(phoneNumber.startsWith("+996"));
        System.out.println(phoneNumber1.endsWith("260"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the word: ");

        String newWord = scanner.nextLine();

        System.out.println("newWord = " + newWord);

        method(newWord);

        int index = newWord.indexOf("a");
        System.out.println("index = " + index);


    }

    public static void method(String newWord){

        String wordUpperCase = newWord.toUpperCase();
        int index = wordUpperCase.indexOf("A");





    }
}
