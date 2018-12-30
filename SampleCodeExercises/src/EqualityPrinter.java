public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);

    }

    public static void printEqual(int number1, int number2, int number3) {
        if ((number1 < 0) || (number2 < 0) || (number3 < 0)) {
            System.out.println("Invalid Value");
        } else if ((number1 == number2) && (number1 == number3) && (number2 == number3)) {
            System.out.println("All numbers are equal");
        } else if ((number1 != number2) && (number1 != number3) && (number2 != number3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
// kui nr1 on == nr2 ja nr1 on == n3, siis on ka nr == 3 ehk viimase võrdluse saab jätta kirjutamata.
