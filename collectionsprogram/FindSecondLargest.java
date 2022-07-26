package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> unique=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			unique.add(data[i]);		
		}
		int n=unique.size();
		List<Integer> num=new ArrayList<Integer>(n);
		for (Integer uni : unique) {
			num.add(uni);
		}
		System.out.println("The elements in the list are "+num);
		System.out.println("The second largest element from the list is "+num.get(n-2));
		
	}

}
