public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }


    public static String lowerCase(String s) {
        String low = "";
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if ((letter >= 'A') && (letter <= 'Z')){
				low = low + (char)(s.charAt(i) + 32);
			} else 
            { 
				low = low + s.charAt(i);
			}
		}

        return low;
    }

}
