package week1homeworks;

public class LearningVariableArgument 
{
	 

	public static void main(String[] args)
	
	{
		//Display obj = new Display();
		//obj.show(5,8,7,9);
	}

class Display
	{

		public void show(int a)
		{
			System.out.println(a);
		}
		public void show(int ...a )
		{
			for(int i : a)
				System.out.println(a);
		}




	}
}


