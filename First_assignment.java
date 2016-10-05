/**
 * Created by Bogda on 10/4/2016.
 */
import java.io.Console;
import java.lang.*;
import java.util.Scanner;

public class First_assignment {

    public static void main(String args[]) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("sumDouble 2 ints");
            System.out.println(sumDouble(keyboard.nextInt(),keyboard.nextInt()));
            System.out.println("diff41 1 int");
            System.out.println(diff41(keyboard.nextInt()));
            System.out.println("dogTrouble true/false + 1 int");
            System.out.println(dogTrouble(keyboard.nextBoolean(),keyboard.nextInt()));
            System.out.println("makes30 2 ints");
            System.out.println(makes30(keyboard.nextInt(),keyboard.nextInt()));
            System.out.println("notString 1 string");
            System.out.println(notString(keyboard.next()));

    }

   public static int sumDouble(int firstNumber, int secondNumber){

       if(firstNumber == secondNumber){
           return (firstNumber + secondNumber);
       }
       return 2 * (firstNumber + secondNumber);
   }

   public static int diff41(int inputNumber) {

       if(inputNumber >41 )
       {
           return 2 * Math.abs(41 - inputNumber);
       }
       return Math.abs(41 - inputNumber);
   }

   public static boolean dogTrouble(boolean barking, int hour) {

       if(hour > 21 && hour < 8) {
           return true;
       }
       return false;
   }


    public static boolean makes30(int firstNumber, int secondNumber) {

        if((firstNumber == 30 || secondNumber == 30) || (firstNumber + secondNumber) == 30) {
            return true;
        }
        return false;
    }

    public static String notString(String textToCheck) {

        String not = "not";
        if(textToCheck.substring(0,3).equals("not")) {

            return textToCheck;
        }
        return not.concat(textToCheck);
    }
}
