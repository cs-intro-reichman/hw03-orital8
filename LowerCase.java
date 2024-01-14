/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
		
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
		//The string input "s"
		String str1 =s ;
        String newS="";
		int length = str1.length()-1; 
		int i=0; // #feedback - declaring i here is not needed, you can declare it inside the for loop.
		char c;
			for (i=0; i<=length;i++){
			c = str1.charAt(i);
			if ( 90 >= c && c>= 65)
			c=(char) (c+32);	
			newS = newS + c;
				
			}
		
		return newS;
    }
}
