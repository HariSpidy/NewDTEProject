package testLeafJAVAProgramsForInterviews;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
/***************************************************************************************************/
//How do you count occurrences of each element in an array?
public class Program2ToCountOccuranceOfEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        
        int arr[] = {2,6,5,9,8,3,5,2,6,7,8,9,5,5};
        //int count = 0;
        
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        
        for (int i=0;i<arr.length;i++) 
        {
        	
        	int key = arr[i];
        	
        	if(elementCountMap.containsKey(key)) {
        		
        		 int count = elementCountMap.get(key);
        		 count++;
        		 elementCountMap.put(key, count);
        		
        	}else
        		elementCountMap.put(key, 1);
        	
        	
			
		}
        
        for (Map.Entry<Integer, Integer> i : elementCountMap.entrySet()) {
        	
        	System.out.println(i.getKey()+"   "+i.getValue());
			
		}
        
        
		
		
	}

}
