public class LargestPrime_2_superb_solution {
    public static void main(String[] args) {

        // System.out.println(getLargestPrime(1));
        System.out.println(getLargestPrime(4));
        System.out.println(getLargestPrime(21));
        //System.out.println(getLargestPrime(217));
        //System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(69));
        System.out.println(getLargestPrime(9));
        //System.out.println(getLargestPrime(18));
        //System.out.println(getLargestPrime(75));
        //System.out.println(getLargestPrime(149));

    }
    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }
        //kui i < number siis läheb while tsükli.
        for (int i = 2; i<number; i++){
            //kui number vastab tingimustele : jääk jagamisel 0 ja pole võrdne i väärtusega, siis teeb jagamis tehte.
            // läheb uuesti while tsükli, saadud numbri väärtusega ja jagab uuesti i-ga(kasvatamata,kuna true).
            //i väärus kasvab kui "number" ei vasta "while" tingimustele ehk läheb "for" tsükli.
            while (number % i == 0 && number != i){
                //System.out.println(i); //for testing (prindib i väärusi)
                number /= i;
                //System.out.println(number); //for testing (prindib number väärtusi, peale tehet.)
            }
        }
        return number;
    }
}
