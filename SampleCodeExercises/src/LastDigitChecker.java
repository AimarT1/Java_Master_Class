public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;

        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000) ){
            return false;
        } else if (number1 > 0 || number2 > 0 || number3 > 0 ){
            digit1 = number1 % 10;
            digit2 = number2 % 10;
            digit3 = number3 % 10;
            if ( digit1 == digit2 || digit1 == digit3 || digit2 == digit3){
                return true;
            }
        }
        return false;

    }
}
