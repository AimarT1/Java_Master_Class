public class SharedDogit_2 {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(100,10));
        System.out.println(hasSharedDigit(12,13));
        System.out.println(hasSharedDigit(12,43));

    }

    public static boolean hasSharedDigit(int number1,int number2) {

        int digit1 = 0;
        int digit2 = 0;
        //added 1 line to check all the 2nd number digits.
        int tempNumber2 = number2;

        if((number1 < 10 || number1 >99 || number2 < 10 || number2 > 99 )){
            return false;}

        while (number1 > 0){
            digit1 = number1 % 10;
            number1 /=10;

            while (tempNumber2 > 0){
                digit2 = tempNumber2 % 10;
                if (digit1 == digit2){
                    return true;
                }else {
                    tempNumber2 /= 10;
                }
            }
            //added 1 line to check all the 2nd number digits.
            tempNumber2 = number2;
        }
        return false;
    }
}

// another solution !
/*
public static boolean hasSharedDigit(int x1, int x2) {

        if ((x1 < 10 || x1 > 99)||(x2<10||x2>99)) {

            return false;

        }

        if ((x1 % 10 == x2 % 10) || (x1 % 10 == x2 / 10) || (x1 / 10 == x2 % 10) || (x1 / 10 == x2 / 10)) {

            return true;

        }

        return false;

    }
 */
