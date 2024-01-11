public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }


    public static String lowerCase(String str) {
       String low = "";
       for (int i = 0; i< str.length(); i++){ 
        char letter ='a';
        int charIndex = str.charAt(i);
        if ('A'<charIndex && charIndex<'Z')
        letter = (char)(charIndex + 32);
        else 
        letter = (char)(charIndex);
        low+=letter;
        
       }
        return low;
    }
} 
    
