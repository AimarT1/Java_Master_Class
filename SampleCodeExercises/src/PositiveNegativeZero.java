public class PositiveNegativeZero{

// psvm for testing in intellij
    public static void main(String[] args) {
        checkNumber(-1);
        checkNumber(0);
        checkNumber(7);
    }

    public static void checkNumber(int number) {

        if (number > 0){
            System.out.println("positive");
        }else if (number < 0){
            System.out.println("negative");
        }else  if (number == 0){
            System.out.println("zero");
        }
    }
}