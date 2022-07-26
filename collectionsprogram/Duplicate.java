package collectionsprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* input: abbaba
		 * output: b
		 */

		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		String word="abbaba";
		char[] ch=word.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int n=ch.length;
		int maxoccurance=0;
		char maxoccurchar = 0;
		for(int i=0;i<n;i++)
		{
			char key=ch[i];
			if(map.containsKey(key)) {
				int value=map.get(key);
				map.put(key,value+1);
			}else {
				map.put(key, 1);
			}
			if(i==n-2)
			{	for (Entry<Character,Integer>entry : map.entrySet()) {
				if(entry.getValue()>maxoccurance) {
					maxoccurance=entry.getValue();
					maxoccurchar=entry.getKey();
				}
			}
			System.out.println("The maxiumum appeared character is "+maxoccurchar+" which occured "+maxoccurance+" times.");
			}
		}
	}
}
