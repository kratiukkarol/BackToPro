import java.util.Arrays;

public class Strings {
	
	public String reverseString(String string) {
		String reversedString = "";
		for(int i=string.length()-1; i>0; i--) {
			reversedString+=string.charAt(i);
		}
		return reversedString;
	}

	public boolean isAnagram(String word, String anagram){
		if(word.length()!=anagram.length()) {
			return false;
		}
		for(int i = 0; i<word.length(); i++) {
			int index = anagram.indexOf(word.charAt(i));
			if(index!=-1) {
				anagram+=anagram.substring(0, index)+anagram.substring(index+1, anagram.length());
			}
			else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	public boolean isAnagram2(String word, String anagram) {
		return sortChars(word).equals(sortChars(anagram));
	}
	
	public String sortChars(String word) {
		char[] charArray = word.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		return String.valueOf(charArray);
	}
	
	public boolean isPalindrome(String str) {
		int n = str.length();
		for(int i=0; i<n/2; i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPalindrome2(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}
}
