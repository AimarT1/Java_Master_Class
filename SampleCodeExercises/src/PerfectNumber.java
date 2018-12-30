public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;

        if (number < 1){
            return false;
        }else{
            for (int i=1; i< number; i++ ){
                if (number % i == 0){
                    sum+=i; //sum= sum + i;
                    //testimiseks prindin
                    //kui oleks print(sum), siis ta prindiks juba liidetud väärused mis jagunevad jäägita!
                    System.out.println(i);
                }
            }
        }
        //testimiseks
        System.out.println(sum + " = " + number);
        return sum==number;
    }
}
