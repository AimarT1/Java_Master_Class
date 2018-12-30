public class Sum3and5 {
    public static void main(String[] args) {
        // muutuja "count" loeb tingimustele vastvaid argumente, seni kuni me tahame et ta loeks.
        //

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if ( (i % 3 == 0) && (i % 5 == 0) ){
                count++;
                //Addition assignment += liidab tingimustele vastavad argumente seni kuni muutuja count == 5.
                sum += i;
                System.out.println("Found number: " + i);
            }
            // for tsükli kodeblokkisees
            if (count == 5){
                break;
            }
        }
        // main meetodi sees aga for tsükli kodeblokkist väljas.
        System.out.println("Sum = " + sum);
    }
}
