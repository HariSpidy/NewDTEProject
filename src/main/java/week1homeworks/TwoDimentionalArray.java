package week1homeworks;

public class TwoDimentionalArray {
	
	public static void main(String args[]) {
		
		String num [][] = {
				            {"hariprasath","asfasf"},
				            {"fahan","fasf"},
				            {"bet","marna","jemini"}
		               };
		for(String value[] : num)
		{
			for(String value0 : value)
			{
				System.out.print(value0+ " ");
			}
			System.out.println("");
		}
		
		
	}

}
