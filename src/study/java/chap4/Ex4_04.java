package study.java.chap4;

public class Ex4_04 {
	public static void main(String args[])
	{
		int sum = 0;
		
		int cnt = 1;
		
		while(true)
		{
			if((cnt != 1) && (cnt % 2 == 0))		//Â¦¼ö
				sum += (-1)*cnt;
			else
				sum += cnt;
		
			if(sum >= 100)
				break;
			
			cnt++;
		}
	}
}
