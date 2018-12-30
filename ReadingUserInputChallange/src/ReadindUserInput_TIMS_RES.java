import java.util.Scanner;

public class ReadindUserInput_TIMS_RES {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        // could be also : while(counter < 10){
        //and also no if(counter == 10){ break} needed then!
        //endless loop
        while (true){
            //+1 is used because it starts from 0!
            int order = counter +1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int  number = scanner.nextInt();
                counter++;
                sum+=number;
                if (counter == 10){
                    System.out.println("Sum of then input numbers is: " + sum);
                    //break needed to break out of the loop, breaks out when condition met.
                    break;
                }
            }else{
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line enter key;
        }
        //could be here also "System.out.println("Sum of then input numbers is: " + sum);"
        scanner.close();

    }
}
