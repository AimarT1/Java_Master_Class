public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(bark(true,1));
        System.out.println(bark(false,2));
        System.out.println(bark(true,8));
        System.out.println(bark(true,-1));

    }
// Boolean tüüp sellepärast et tagasi vaja saada ainult tõene või väär väärtus.
    public static boolean bark(boolean barking, int hourOfDay) {
// IF statement 1 osas panen paika esimese vahemiku ja konditsiooni, siis lisan teise teise osa konditsiooni ja kui üks neist on tõene annab tõese vastuse.
        if (hourOfDay >= 0 && hourOfDay < 8 && barking == true || hourOfDay > 22 && hourOfDay <= 23 && barking == true) {

            return true;
        }
// Panen paika kindla tingimuse kuna on annab False. OR || !
        else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        else {

            return false;
        }

    }

}
