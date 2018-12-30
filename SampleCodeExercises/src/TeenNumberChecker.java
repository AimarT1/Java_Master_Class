public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 24));

    }

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        if ((teen1 >= 13 && teen1 <= 19) || (teen2 >= 13 && teen2 <= 19) || (teen3 >= 13 && teen3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}
