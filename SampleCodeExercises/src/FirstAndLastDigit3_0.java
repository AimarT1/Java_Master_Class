public class FirstAndLastDigit3_0 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


    }

    public static int sumFirstAndLastDigit(int number){

        if (number <0){
            return -1;
        }
        //for extracting and saveing the last digit
        // deklareerin muututaja et salvestada viimasel kohal asuv number(ehk jääk)
        int lastNumber = number % 10;

        // Remove last digit from number
        // till only one digit is left
        //kui number >= kümnega siis jaga number 10ga seni kuni üks number on ainult järgi,(eemaldab viimase nr)
        //kui number väiksem kümnest siis väljasta see.
        //Liida saadud nr(esimesel kohla asuv) eeelnevalt salvestatud nr-ga(jääk/viimasel kohal asuv).
        while (number >= 10){
            number /= 10;
        }
        return  number + lastNumber;

    }

}

/*
      public static int sumFirstAndLastDigit(int number){
    	        if(number<0)
    	        return -1;

    	        int first =0;
    	        int last = number %10;
    	        while(number >0){
    	           first = number;
    	            number /= 10;
    	        }

    	        return first + last;
    	    }
 */

