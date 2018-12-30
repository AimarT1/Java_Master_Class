public class EvenDigitNumber {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int  number){
        int value = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0){
            if ((number % 10) % 2 == 0){
                value = value + (number % 10);
            }
                number /= 10;

        }
        return value;
    }

}

/*
while (number > 0){
            if ((number % 10) % 2 == 0){
                value = value + (number % 10);
                number /= 10;
            }else{
                number /= 10;
            }
        }
 */