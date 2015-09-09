package study.java.chap4;

public class Ex4_05 {
	public static void main(String args[])
	{
		/*
		//original code
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		*/
		int cnt = 0;
		while(cnt <= 10)
		{
			int writeStar = 0;
			while(writeStar != cnt)
			{
				System.out.print("*");
				writeStar++;
			}
			System.out.println();
			cnt++;
		}
	}
}
