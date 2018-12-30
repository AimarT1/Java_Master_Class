public class DiagonalStar_With_Comments {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        //kui number on väiksem või == 4 siis "invalid value"
        if (number < 5){
            System.out.println("Invalid Value");
        }else{
            //alustab lugemist ühest(kui alustaks 0 ist siis prindiks ühe rohkem!)
            //a tähistab colomne ehk verge
            for (int a = 1; a <= number; a++){
                //b tähistab ridu ehk row
                for (int b = 1; b <= number; b++){
                    //tingimused patternite printimiseks
                    if (b == 1 || b == number){
                        System.out.print("*");
                    }else if (a == 1 || a == number){
                        System.out.print("*");
                    }else if (b == a){
                        System.out.print("*");
                    }else if (a == number - b + 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                //peab printima peale for tsükli codeblokki lõppu !
                System.out.println();

            }
        }
    }
}
