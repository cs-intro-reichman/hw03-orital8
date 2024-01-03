/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
//The string input "s"

		String ogS = s ;
		String newS = "" ;
		newS= newS + ogS.charAt(0);
		int length = ogS.length()-1	;
		char c;
//IsEx boolean virable for checking if character exist.

		boolean isEx=false ;
//for loop with the original string length

		for(int i = 0; i <=length ;i++){
		c = ogS.charAt(i);	
			if(c != 32){     										//the if not space 
//for loop with the original string length
			char q = newS.charAt(0);
			int newLength = newS.length()-1;
			for(int j=0; j <= newLength && isEx==false ; j++){		//the smaller
			q = newS.charAt(j);	
				if (c == q){
					isEx = true;
				}
				else;
			}										//the smaller loop
				
				if(isEx == false)
				newS = newS+c;
		}
			//if not space
			if(c == 32)
				newS = newS + c;
			isEx=false;
			
		}//big for
	
        return newS;
    }
}
