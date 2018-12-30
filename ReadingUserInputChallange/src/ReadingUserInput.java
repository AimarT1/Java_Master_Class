import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        // Scanner - java class, scanner - java method, System.in - loeb sisestust/inputi.
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter < 10){

            //enter number line peab olema while tsükli sees, muidu ei kuva kasvamist.
            System.out.println("Enter number #"  + counter + ":");

            // meetod mis kontrollib kas sisestati int
            boolean hasHasInt = scanner.hasNextInt();
            if (hasHasInt){
                int number = scanner.nextInt();
                counter++;
                sum = sum + number;
            }else{
                System.out.println("Invalid value");
            }
            //peale if statementi ehk siis kui tükel kora läbi käinud
            scanner.nextLine();
        }
        System.out.println("Sum of then input numbers is: " + sum);
        //peab lõppema scanner.close().

        scanner.close();
    }
}
