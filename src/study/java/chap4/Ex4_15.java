package study.java.chap4;

public class Ex4_15 {
	public static void main(String args[])
	{
		int number = 1221;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0)
		{
			result *= 10;
			result += tmp%10;
			tmp /= 10;
			
		}
		
		if(number == result)
			System.out.println("회문");
		else
			System.out.println("회문아님");
	}
}
