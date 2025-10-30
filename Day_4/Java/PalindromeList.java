public class PalindromeList{
	public String getPalindrome(String [] words){
		int last_index = words.length - 1;
		String second_word = "";
	
	for(int index = 0; index < words.length; index++ ){
			String word = words[index];
		
	for(;last_index >= 0; last_index--){	
		second_word += word.charAt(last_index);}

	if( word.equals(second_word))
		return("False");}
	
		return("True");

	
	
}

	

}