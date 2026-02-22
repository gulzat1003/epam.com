package condition;

import java.util.Random;

public class SwitchClass {
    public static void main(String[] args) {
        Random random = new Random();

        switch (random.nextInt()){
            case 1:
                System.out.println("first case is working");
                break;
            case 2:
                System.out.println("second case is working");
                break;
            case 3:
                System.out.println("third case is working");
                break;
        }

    }
}
