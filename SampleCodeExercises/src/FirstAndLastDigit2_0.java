public class FirstAndLastDigit2_0 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(-257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


    }

    public static int sumFirstAndLastDigit (int number){

        if (number < 0){
            return -1;
        }


        int sum = 0;
        int lastN = 0;
        int firstN = 0;


        while (number > 0){
            lastN = number % 10;

            while (number > 0) {
                number /= 10;
                firstN = number;
                sum = firstN + lastN;
                break;
            }
        }

        return sum ;
    }

}
