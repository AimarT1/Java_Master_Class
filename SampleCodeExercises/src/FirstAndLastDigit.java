public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int lastN = 0;
        int firstN = 0;

        while (number > 0 ){
            lastN = number % 10;
            break;
        }

        while (number >= 0){
            firstN = (number / 10) / 10;
            break;
        }
        return sum = (firstN + lastN);
    }

}

/* code from net.
 public static int firstDigit(int n)
    {
        // Remove last digit from number
        // till only one digit is left
        while (n >= 10)
            n /= 10;

        // return the first digit
        return n;
    }
 */
