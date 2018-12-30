public class NumberToWords__3 {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);


    }
    public static void numberToWords(int number)
    {

        int countnumberofdigits=0;

        // muutuja reverse millel on reverse meetodi arv väärtus salvestatud.
        int reversed = reverse(number);
        if(number <0){
            System.out.println("Invalid Value");
        }

        while(reversed > 0) {
         // muutuja digits võtab sisse algsearvu reversed vääruse ja prindib nad välja algsel kujul siestatud järjekorras.
            int digits= reversed%10;
            switch(digits)
            {

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
            }

            reversed =reversed/10;
        }
        // muutuja "countnumberofdigits" võrdleb numbrite arve algnumbris ja pööratud numbris.
        //Kui see võrdub nulliga siis liida printitud arvule juurde "Zero", kui viimane arv sisestatud numbrist on 0 ehk vaba koht,
        //prindi seni kuni numbrite arve algnumbris ja pööratud numbris = 0-iga.
        countnumberofdigits = getDigitCount(number) - getDigitCount(reverse(number));
        //System.out.println(countnumberofdigits); Testiks
        for(int i=1; i<=countnumberofdigits;i++)
        //vaatav loetud numbrite arvu algnumbris ja pööratud numbris
        // kui seal on mingi koht arv numbreid siis prindib nendele kohtadele " Zero"
        //ehk i++ seni kuni kohtadearv "i" on suurem saadud kohtade arvust.
        {
            System.out.println("Zero");
        }
    }
    //Meetod aru lugemiseks vastupidiselt sisestatud arvule.
    public static int reverse(int number) {
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = lastDigit + (reverse * 10);
            //System.out.println(reverse); Testiks
            number = number / 10;
        }
        return reverse;
    }
    // Meetod arvu lugemiseks.
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
