public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double decimalA,double decimalB){
        // Et liigutada 3 koma kohta tuleb arvu korrutada tuhandega ! Siis ümardata(cast) täis arvauks et võrrelda. (int: int ei oma komakohti!).
        if ((int)(decimalA * 1000) == (int)(decimalB * 1000)){
            return  true;
        }else{
            return  false;
        }

    }
}

/*
Alternative salution
    public static boolean areEqualByThreeDecimalPlaces(double decimalA,double decimalB){
        if ((Math.abs((decimalA * 10000) - (decimalB * 10000)) >= 0) && (Math.abs((decimalA * 10000) - (decimalB* 10000)) <=  9))
        {
            return  true;
        }else{
            return  false;

}
 */


