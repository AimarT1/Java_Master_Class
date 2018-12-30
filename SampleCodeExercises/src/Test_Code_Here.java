public class Test_Code_Here {
    //CODE WITH MORE BRASES!

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(2, 10, 18));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 1, 12));
        System.out.println(canPack(6, 2, 17));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 7, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount = bigCount * 5;
        smallCount = smallCount * 1;

        System.out.println(bigCount); //For testing
        System.out.println(smallCount); //For testing
        System.out.println(goal); //For testing

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if ((bigCount + smallCount) < goal || (bigCount == 0) && (smallCount < goal)) {
            return false;
        } else if ((bigCount != 0) && (bigCount % 2 == 0) && (smallCount > 1)) {
            return true;
        } else if ((bigCount / 2 == goal) || (bigCount + smallCount) == goal) {
            return true;
        } else if ((bigCount > goal) && (bigCount / goal) == goal) {
            return true;
        } else if ((bigCount < goal) && ((smallCount + bigCount) > goal)) {
            return true;
        } else if (((bigCount + smallCount) > goal) && ((bigCount + smallCount) % goal != 0)) {
            return false;
        } else if ((bigCount != goal) && (smallCount == 0) && ((bigCount + smallCount) != goal)) {
            return false;
        } else {
            return false;
        }
    }
}

