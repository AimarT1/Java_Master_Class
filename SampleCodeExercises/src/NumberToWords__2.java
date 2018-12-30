public class NumberToWords__2 {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(getDigitCount(123456789));
        System.out.println("************");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("************");
        numberToWords(reverse(123));
        numberToWords(reverse(1000));
        System.out.println(getDigitCount(reverse(123)));
    }

    public static void numberToWords(int number) {
        int lastDigit = 0;

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            while (number > 0) {
                lastDigit = number % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                    default:
                        System.out.println("Invalid Value");
                        break;
                }

                number = number / 10;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = lastDigit + (reverse * 10);
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number > 0) {
                //seni kuni number suurem 0 -is jaga kümega(kuna type int siis komakoha tekkimisel eemaldab selle,seni kuni jääk on 0)
                number = number / 10;
                count++;
            }
        }
        return count;
    }
}
