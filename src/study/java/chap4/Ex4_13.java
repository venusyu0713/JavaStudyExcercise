package study.java.chap4;

public class Ex4_13 {
	public static void main(String args[])
	{
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++)
		{
			ch = value.charAt(i);
			
			if( !((ch >= '0') && (ch <= '9'))){
				isNumber = false;
				break;
			}
				
		}
		
		if(isNumber)
		{
			System.out.println(value +" is number");
		}
		else
			System.out.println(value +" is not number");
	}
}
