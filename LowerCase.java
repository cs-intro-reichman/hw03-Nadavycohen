/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));}

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
        String rev = " ";
        for (int i = 0; i < str.length();i++){
            char letter = str.charAt(i);
            if ((letter >= 'A')&&(letter<= 'Z')){
                rev = rev + (char)(str.charAt(i)+32);
            }else {
                rev = rev + str.charAt(i);
            }
        }
        return rev;
    }
}
