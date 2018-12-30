public class SumOdd2_0 {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));

    }
    public static boolean isOdd(int number){
        if ((number > 0) && (number % 2 != 0)){
            return true;
        }else {
            return false;
        }
    }
    public static int sumOdd(int start,int end){
        //[int sum = 0] for calculating sum.
        int sum = 0;
        //condition
        if ( (end >= start) && (start >0) && (end >  0)){
            //[int i = start] starting point ehk esimene sisestatav parameeter.
            //[i <= end] condition checks if value of i is less then or equal to end(parameter)
            /*i = start so i compares the input to end paramets condition,
             goes throu the loop and adds to sum until the end parameter equals false and returns sum result.
             if you put "start <= end",
             then it will become infinate loop which will run forever cause it will check same start value over and over.

             */
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
            //outside of for loob code block
            return sum;
        }/* out side of if statement code block*/else {
            return -1;
        }
    }
}
