import java.lang.*; 
import java.io.*; 
import java.util.*;

public class Test {
	public static String makePalindrome(String word) {
		char[] try1 = word.toCharArray();
		for(int i = try1.length - 1; i >= 0; i--)
		    word = word + try1[i];
		return word;
	}
}
