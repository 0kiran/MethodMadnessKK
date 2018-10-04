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
        String returnmessage = "";
        for (int i = 0, j = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (letter < 'A' || letter > 'Z') {
                returnmessage += (char) ((letter + key.charAt(j) - 2 * 'A') % 26 + 'A');
                j = ++j % key.length();
            }
        }
        return returnmessage;
    }

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
}
