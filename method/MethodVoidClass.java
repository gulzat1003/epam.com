package method;

import java.util.Arrays;

public class MethodVoidClass {
    public static void main(String[] args) {

//        System.out.print("Write the name: ");
//        String name = new Scanner(System.in).nextLine();
//        //sayHello(name);
//        saySalam(name);
        createArray(new String[]{"Elnur", "Gulzat", "Meri" });
        numArray(new int[]{1, 5, 6, 9776});

        pritPersonInfo("Gulzat", "Aldashova", 37, 'F');
        pritPersonInfo("Elnure", "Arapova", 30, 'F');



//        createArray(300);
//        createArray(4);
//        createArray(23);
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the number: ");
//            int num = scanner.nextInt();
//
//
//            if (num == 1) helloMethod();
//            else if (num == 2) byeMethod();
//            else System.out.println("Invalid number");
//
//
//        }
//    }

//    public static void helloMethod(){
//        System.out.println("Hello");
//    }
//    public static void byeMethod(){
//        System.out.println("Bye");
//    }
//
//    public static void baitenir(){
//
//    }

    }


    public static void createArray ( int length){
        int[] array = new int[length];
        System.out.println("array.length = " + array.length);

    }

    public static void sayHello (String name){
        System.out.println("Hello " + name + "!");

    }

    public static void pritPersonInfo(String name, String lastName, int age, char gender){
        System.out.printf("""
             Name: %s
             LastName: %s
             Age: %d
             Gender: %s
             """, name, lastName, age, gender);

    }

    public static void saySalam(String name){
        System.out.println("Салам " + name + "!");
    }
    //How to create array String

    public static void createArray(String[] names){
        System.out.println(" Привет " + Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            System.out.println("Привет: " + names[i]);

        }


    }
    public static void numArray(int[] numbers){
        System.out.println(" Числы  " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Hello: " + numbers[i]);


        }
    }




}
