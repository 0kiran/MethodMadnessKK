public class KKhambhlaLib {
    // Kiran Khambhla
    // Methods for MethodMadness Project

    /**
     * checks if a string is a Palindrome (spelled same forward and backward)
     * @param str1 = string input
     * @return true or false depending on if
     */
    public static boolean isPalindrome(String str1){
        for(int i = 0; i < str1.length(); i++){
            for(int j = str1.length()-1; j > str1.length(); j--){
                if(str1.substring(i,i++).equals(str1.substring(j,j--))){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * changes the look of the date input
     * @param date inputs the date with "/"
     * @return date with "-"
     */
    public static String dateStr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        return day + " - " + month + " - " + year;
    }

    /**
     * returns the sum of all the numbers up to a number
     * @param n the number you want to add up to
     * @return the sum
     */
    public static int sumUpTo(int n){
        int total = 0;
        for(int i=0; i <= n; i++){
            total += i;
        }
        return total;
    }

    /**
     * checks if a number is a part of the Fibonacci sequence
     * @param n the number you want to check
     * @return true or false depending on whether it is or isn't
     */
    public static boolean isFibonnaci(int n){
        int n1 = 0;
        int n2 = 1;
        int sto = 0;
        while(n1+n2 <= n){
            sto = n1;
            n1 = n2;
            n2 = sto + n2;
        }
        if (n2 == n){
            return true;
        }
        return false;
    }

    /**
     * returns the least common multiple of 3 numbers
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the lcm of all 3
     */
    public static int leastCommonMultiple(int num1, int num2, int num3){

        for(int i = 2; i < num1*num2*num3; i++){
            if (i % num1 == 0 && i % num2 == 0 && i % num3 == 0){
                return i;
            }
        }

        return num1*num2*num3;

    }
}
