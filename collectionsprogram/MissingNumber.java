package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 */

		/*
		 * Psuedocode
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */

		int[] nums= {5,2,7,1,8,9,4,2,8,9,1,4,2,2,9,10,6,10};
		Set<Integer> unique=new TreeSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			unique.add(nums[i]);
		}
		System.out.println("The set contains elements "+unique);
		int n=unique.size();
		List<Integer> num=new ArrayList<Integer>(n);
		for (Integer uni : unique) {
			num.add(uni);
		}

		
		for(int j=0;j<(num.size())-1;j++)
		{
			if((num.get(j))+1!=(num.get(j+1)))
			{
				System.out.println("The missing number is "+((num.get(j))+1));
			}
	//System.out.println(num.get(j));
		}
	}

}
