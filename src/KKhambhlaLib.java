public class KKhambhlaLib {

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

    public static String dateStr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        return day + " - " + month + " - " + year;
    }

    public static String vigCipher(String message, String key){
        return
    }
}
