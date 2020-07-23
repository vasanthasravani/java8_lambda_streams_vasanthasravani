package epam.lamdaExpressions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] args) {
        List<String> a = Arrays.asList("malayalam","mom","1221","welcome","Goods","21");
        List<String> s= Palindrome.findPalindrome(a,(str) ->Palindrome.isPalindrome((String) str));
        System.out.println("List of Palindromes: " +s);
    }
 
    public static boolean isPalindrome(String str) {
    	StringBuffer newStr =new StringBuffer();
    	for(int i = str.length()-1; i >= 0 ; i--)
    		newStr = newStr.append(str.charAt(i));
    	if(str.equalsIgnoreCase(newStr.toString()))
    		return true;
    	else 
    		return false;
    } 
    public static List<String> findPalindrome(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedpal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            sortedpal.add((String) i);
        });
        return sortedpal;

}
}