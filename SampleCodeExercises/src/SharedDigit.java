public class SharedDigit {
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
        if((number1 < 10 || number1 >99 || number2 < 10 || number2 > 99 )){
            return false;}

        while (number1 > 0){
            digit1 = number1 % 10;
            number1 /=10;

            while (number2 > 0){
                digit2 = number2 % 10;
                if (digit1 == digit2){
                    return true;
                }else {
                    number2 /= 10;
                }
            }
        }
        return false;
    }
}
