package lessons;

public class CodeWars {

    public static void main(String[] args) {
//        System.out.println(isLove(10, 10));
//        System.out.println(numberToString(123));
        System.out.println(countingSheep(3));
    }

    //https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
    public static int doubleInteger(int i) {
        // Double the integer and return it!
        i = i * 2;
        return i;
    }

    //https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
    public static boolean isLove(final int flower1, final int flower2) {

        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    //https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
    public static String numberToString(int num) {
        // Return a string of the number here!
        return Integer.toString(num);
    }

    //https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    //https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
    public static String countingSheep(int num) {
        //Add your code here
        String str = "";
        for (int i = 1; i <= num; i++) {
             str += i + " sheep...";
        }
        return str;
    }
}
