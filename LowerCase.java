public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));}

    public static String lowerCase(String str) {
        String low = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A') && (ch <= 'Z')){
				low = low + (char)(str.charAt(i) + 32);
			} else 
            { 
				low = low + str.charAt(i);
			}
		}

        return low;
    }

}
