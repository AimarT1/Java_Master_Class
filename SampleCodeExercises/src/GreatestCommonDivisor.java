public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first,int last){

        int common = 0;

        if (first < 10 || last < 10){
            return -1;
        }

        // "i = 1" algväärtus on 1 sest 0 annaks errori(läheks sisse 0 korda)
        // kasvab seni kuni i väärus on väiksem == first
        for (int i = 1; i <= first; i++){
            //kontrollib kas jääki jagatisel ei tekki, kui ei tekki siis kontrollib seni kuni leiab suurima ühise jagaja.
            if ((first % i == 0) && (last % i ==  0)){
                //tagastab suurima ühise jagaja.
                common = i;
            }
        }
        return common;
    }
}
