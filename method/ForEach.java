package method;

public class ForEach {
    public static void main(String[] args) {
  //      String[] words = {"Java ", "JavaScript ", "C# ", "C++"};
        String[] vacancy = {"It", "Doctor", "Sales", "Driver", "Engineer", "Teacher"};


        System.out.println(getNum(45, 8));
//        System.out.println("With while loop");
//        int j = 0;
//        while (j < words.length){
//            System.out.print(words[j++]);
//        }
//        System.out.println("For i");
//        for(int i = 0; i < words.length; i++){
//            System.out.print(words[i]);
//        }

//        System.out.println("\nForEach"); // Он работает только с массивами
//        for (String word : words){ // массивтин ичинде канча элемент болсо ошончо жолу айлан дегенди тушундурот
//                                   // Эмне учун String анткени массивтин  ичиндеги аргументердин тиби жазылыш керек
//            System.out.print(word);
//            if (word.equals("C#")) {
//                break;
//            }
//        }

        System.out.println("Task vacancy");

        for (String str : vacancy){
            System.out.println("Менин кесибим: ".concat(str) );
        }

    }



    public static long getNum (int ... numbers){
        int sum = 0;
        for (int element : numbers){
            sum += element;
        }
        return sum;
    }




}
