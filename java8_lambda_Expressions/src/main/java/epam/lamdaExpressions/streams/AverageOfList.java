package epam.lamdaExpressions.streams;
import java.util.*;

public class AverageOfList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		double avg = AverageOfList.average(numbers);
		System.out.println(avg);
	  }

	private static double average(List <Integer> marks) {
	    if (marks == null || marks.isEmpty()) {
	        return 0;
	    }

	    double sum = 0;
	    for (Integer mark : marks) {
	        sum += mark;
	    }

	    return sum / marks.size();
	}
	  
	}