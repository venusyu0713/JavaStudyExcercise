package study.java.chap4;

public class Ex4_03 {
	public static void main(String args[])
	{
		int sum = 0;
		int count = 1;
		while(count <=10)
		{
			System.out.print(count +": ");
			for(int i=1; i<=count ; i++)
			{
				sum += i;
				if(i!=count)
					System.out.print(i + "+");
				else if (i==count)
					System.out.print(i);
			}
			System.out.println();
			count++;
		}
		
		System.out.println("sum: " + sum);
	}
}
