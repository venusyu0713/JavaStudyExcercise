package study.java.chap4;

public class Ex4_10 {
	public static void main(String args[])	
	{
		int num = 11111;
		int sum = 0;
		
		int devideNum = 10;
		while(true)
		{
			if(num > 0)
			{
				sum +=  num % devideNum;
				num = num / devideNum;
			}
			else
				break;
		}
		
		System.out.println("sum="+sum);
	}
}
