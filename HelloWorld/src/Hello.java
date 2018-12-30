public class Hello {
    public static void main(String[] args) {
        //Entry point for running Java
        System.out.println("Hello, World! & Hello Aimar!");
        //Giving a command
        int myFirstNumber = 7 ;
        // int = dataType, myFirstNumber = memory location which you call out with the assingned value aka variable name.
        System.out.println(myFirstNumber);
        // sout = System.out.println();, quiker way to write code.

        int mySecondNumber = (72+31)*15;
        int myThirdNumber = 23;
        int myTotalSum = myFirstNumber + mySecondNumber + myThirdNumber ;
        int myNewSum =myTotalSum - myThirdNumber*10 ;
        //Order is important!
        // iF variable is Grayed out like this comment then it means its not used!
        System.out.println(mySecondNumber);
        System.out.println(myTotalSum);
        System.out.println(myNewSum);
    }
}
