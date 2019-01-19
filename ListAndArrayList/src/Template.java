import java.util.Scanner;

public class Template {

    private static Scanner scanner = new Scanner(System.in);
    //baseData array variable
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        System.out.println("*****");
        reziseArray();
       // System.out.println("Enter 12 integers:");
        //getInput();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);

    }
    //get input method - to get input data and save it to array
    private static void getInput(){
        for (int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }
    //print out array contents
    private static void printArray(int[] array){
        for (int i = 0; i <array.length; i++){
            System.out.print(array[i] + "");
            System.out.println();
        }
    }
    //reziseArray()- takse a copy of original array and creates a new array and changes it to 12 elemnts,
    // and passes the 10 original elements to it
    private static void reziseArray(){
        //variable "int[] original" . saving the original array into it first.
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }
}
