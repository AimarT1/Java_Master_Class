import java.util.Scanner;

public class R_U_I_Callange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            //print has to inside while oderwise it wount print the statement again with conted numbers.
            System.out.println("Enter number #" + count + ": ");

            //to check if input is int type
            boolean hasNextInt = scanner.hasNextInt();
            // aka hasNextInt == true
            if (hasNextInt){
                int number = scanner.nextInt();
                //kasvata counti
                count++;
                // liida summa jaoks numbreid seni kuni loend on väiksem 10-st.
                sum = sum + number;

            }else{
                System.out.println("Invalid number");
            }
            //väljas pool if statementi muidu tekib endless loop
            scanner.nextLine();
        }
        System.out.println("Sum of input numbers is: " + sum);

        scanner.close();
    }
}
