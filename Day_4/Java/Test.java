public class Test{
public static void main(String[] args){
	String[] words = {"madam", "noon"};

	Palindrome function = new Palindrome();

	String[] newArray = function.checkPalindrome(words);
	for( int i = 0; i < newArray.length; i++){
		System.out.print(newArray[i]);}
	
}}