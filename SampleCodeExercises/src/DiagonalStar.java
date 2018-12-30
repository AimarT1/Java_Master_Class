public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // a tähistab colmn
            for (int a = 1; a <= number; a++) {
                //b tähistab row
                for (int b = 1; b <= number; b++) {
                    if (a == 1 || a == number) {
                        System.out.print("*");
                    } else if (b == 1 || b == number) {
                        System.out.print("*");
                    }else if (a == b){
                        System.out.print("*");
                    }else if (b == number -a +1 ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
