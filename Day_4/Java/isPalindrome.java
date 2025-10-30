public class Palindrome{


	public static boolean[] isPalindrome(String[] myArray){
		boolean[] newArray = new boolean[myArray.length];
			for(int count = 0; count < myArray.length; count++){
				String palindrome = "";

				for(int counter = 0; counter < myArray[count].length(); counter++){
					palindrome = myArray[count].charAt(counter) + palindrome;
				}

				if (myArray[count].equals (palindrome))
					newArray[count] = true;
				else
					newArray[count] = false;
			}
			return newArray;
		
		}








}