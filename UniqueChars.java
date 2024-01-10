
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String str) {
        String uniq = "";
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			boolean duplicate = false;
			for (int j = 0; j < uniq.length(); j++) {
				if (uniq.charAt(j) == letter) {
					duplicate = true;
					break;
				}		
			}
			if (!duplicate || letter == ' ') {
				uniq += letter;

			}

		}

		return uniq;
	}

}
