package All_Logical_Programs;

public class Reverse_String 
{
	public static void main(String[]args)
	{
		String Name = "Himanshu";
		String Reverse = "";
		
		for(int i=Name.length()-1; i>=0; i--)
		{
			Reverse = Reverse+Name.charAt(i);
		}
		
		System.out.println(Reverse);
		
		
		
	}

}
