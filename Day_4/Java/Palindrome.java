public class Palindrome{


	public static boolean[] checkPalindrome(String[] words){
		boolean[] newArray = new boolean[words.length];
		for(int count = 0; count < words.length; count++){
		String palindrome = "";

			for(int counter = 0; counter < words[count].length(); counter++){
				palindrome = words[count].charAt(counter) + palindrome;
				}

			if (words[count].equals (palindrome))
				newArray[count] = true;
			else
				newArray[count] = false;
		}
		System.out.print(newArray);
		return newArray;
		
		}
}