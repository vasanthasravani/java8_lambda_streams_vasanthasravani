package epam.lamdaExpressions.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

	public class RequiredString {
		public static List<Object> search(List<String> list) {
			return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
			}
			public static void main(String[] args) {
				List<String> arraylist = new ArrayList<String>();
				 arraylist.add("abc"); 
			     arraylist.add("abcd"); 
			     arraylist.add("bcd");
			     arraylist.add("air");
			     arraylist.add("App");
			     arraylist.add("bat");
			     arraylist.add("act");
			     List<Object> s = search(arraylist); 
			     System.out.println("Three letter string that starts with 'a' : "+s);

			}

	}