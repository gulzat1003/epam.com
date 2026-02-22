package condition;

import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //int num1 = scanner.nextInt();

        if(num > 0) {
            System.out.println("positive");

        }else if(num == 0){
            System.out.println("neitral");

        }
        else{
            System.out.println("negotive");
        }

        int time = scanner.nextInt();
        //int num2 = scanner.nextInt();

        if (time >= 6 && time <= 12){  // and
                                      //  || or
            System.out.println("morning time");
        }
        else if( time >= 13 && time <= 17){
            System.out.println("day time");
        } else {
            System.out.println("evening");
        }

        String argument = scanner.nextLine();
        switch (argument ){
            case "Monday": {
                System.out.println("1 кун");
            }
            break;
            case "Thuesday": {
                System.out.println("2-кун");
            }
            break;
            case "Wednesday": {
                System.out.println("3-кун");
            }
        }

    }



}
