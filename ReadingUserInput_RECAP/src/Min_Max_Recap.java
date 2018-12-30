import java.util.Scanner;

public class Min_Max_Recap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //useing "Integer.MAX_VALUE;" and "int maxNumber = Integer.MIN_VALUE;" to calulate min value otherwise it stays 0.
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number: ");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber){
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number > maxNumber){
                    maxNumber = number;
                }if (number < minNumber){
                    minNumber = number;
                }
            }
            //else after first if aka the conditions are checked and if its false then break otherwise continue.
            else{
                System.out.println("Invalid number");
                break;
            }
        }
        //after while, print this when condition == false.
        System.out.println("Your min number is: " + minNumber + " and max number is " + maxNumber);

        scanner.close();
    }
}
