public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(157);
        numberToWords(-1);
        numberToWords(234);
        System.out.println(reverse(234));
        numberToWords(reverse(234));
        numberToWords(reverse(100));
        System.out.println(reverse(12));
        System.out.println(getDigitCount(2223));
        System.out.println(getDigitCount(123456789));
        System.out.println(getDigitCount(5200));


    }

    public static void numberToWords(int number){
        int lastDigit = 0;
        if (number < 0){
            System.out.println("Invalid Value");
        }else{
            while (number > 0){
                lastDigit = number % 10;

                switch (lastDigit){
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

                number = number /10;
            }
        }
    }
    public  static  int reverse(int number){
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0){
            lastDigit = number % 10;
            reverse = lastDigit + (reverse *10);
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count = 0;

        if (number < 0){
            return -1;
        }else{
            for(int i = number; i > 0; i/= 10){
                count++;
            /* komentaarides on minu esialgne mis tagastas vale tulemuse, kuna kasutasin/defineerisin valesti.
            for (int i = 0; i < number; i++){
                count = number %10;
                number = number / 10;
                count = count + i;
*/
            }
        }
        return count;
    }
}
