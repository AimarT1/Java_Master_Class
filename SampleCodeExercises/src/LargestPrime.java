public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(1));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(4));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(18));
        System.out.println(getLargestPrime(75));
        System.out.println(getLargestPrime(149));
    }

    public static int getLargestPrime(int number) {
        int newNumber = 0;

        if (number <= 1) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                number = number / i;
                if (number == 2) {
                    return 2;
                }
                newNumber = number;
                if (number == 1)
                    return newNumber;
            }
        }
        return number;
    }
}

/*version 1
public static int getLargestPrime(int number) {

        if (number <= 1 || number % 2 == 0) {
            return -1;
        }
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
               int newNumber = number / i;
               if (number%newNumber == 0){
                   return newNumber;
               }
            }
        }
        return number;
    }

    //version 2.
    public static int getLargestPrime(int number) {
        int newNumber = 0;

        if (number <= 1) {
            return -1;
        }
        // kuna alg väärtus i=2 ehk alustab lugemist kohalt 2 ja sisestatud number 2 pole väiksem algvärrtusest siis väljastab selel.
        //nt kuna i on väiksem 4-st siis siseneb if statementi ja kuna jääki pole siis = -1;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                    newNumber = number/i;
                if (newNumber % i == 0){
                    newNumber = newNumber/i;
                    return newNumber;
                }
                return newNumber;
            }
        }
        return number;
    }
 */

