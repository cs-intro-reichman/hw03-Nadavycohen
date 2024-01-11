public class UniqueChars {
    public static void main(String[] args) {  
         String str = args[0];
         System.out.println(uniqueChars(str));
     }

     public static String uniqueChars(String s) 
     {
        String uniq= "";
        
        for (int i = 0; i<s.length(); i++)
        {
         char letter = s.charAt(i);
          if (uniq.indexOf(letter) == -1)
          {
           uniq+=letter;
            }  else if(letter == ' ') 
            {
             uniq +=letter;
            }  
        }
         return uniq;
     }
 }
