public class NumberOfDaysInMonth {
    public static void main(String[] args) {
/*
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
*/
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
        getDaysInMonth(13, 2019);


    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
//The error was that it was asked to return the walue not print it.
//I print it cause i wanna see if the result are correct or matching as the sould be.
//break and return can not be used togethet because they would become redundant.(üleliigne, kirjutab üle, pmst teevad sama asja. )
    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            //Kuna kõikide "case"-ide väärtus on antut juhul sama, kasutan koodi lühemalt.
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                return 31;
            case 2:
                if (isLeapYear(year) == true) {
                    System.out.println(29);
                    return 29;
                } else {
                    System.out.println(28);
                    return 28;
                }

            case 4: case 6:case 9: case 11:
                System.out.println(30);
                return 30;

            default:
                return -1;

        }
    }
}

/* My first solution what got an error in udemy-s compiler

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

getDaysInMonth(1, 2020);
    getDaysInMonth(2, 2020);
    getDaysInMonth(2, 2018);
    getDaysInMonth(-1, 2020);
    getDaysInMonth(1, -2020);
    getDaysInMonth(13, 2019);


}

public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        return true;
        } else {
        return false;
        }
        }
        return false;
        }

public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
        return -1;
        }
        switch (month) {
        case 1:
        System.out.println(31);
        break;
        case 2:
        if (isLeapYear(year) == true) {
        System.out.println(29);
        } else {
        System.out.println(28);
        }
        break;
        case 3:
        System.out.println(31);
        break;
        case 4:
        System.out.println(30);
        break;
        case 5:
        System.out.println(31);
        break;
        case 6:
        System.out.println(30);
        break;
        case 7:
        System.out.println(31);
        break;
        case 8:
        System.out.println(31);
        break;
        case 9:
        System.out.println(30);
        break;
        case 10:
        System.out.println(31);
        break;
        case 11:
        System.out.println(30);
        break;
        case 12:
        System.out.println(31);
        break;

default:
        return -1;

        }
        return -1;
        }
        }


 */



/*  // esialgne variant "isLeapYear", aga andis -1600 true, siis tuli mõelda natuke ja proovida teisiti.
    public static boolean isLeapYear(int year){
        if ( (year < 1) && (year > 9999) ){
            return false;
        }else if (((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)){
            return true;
        }else {
            return false;
        }
    }*/
