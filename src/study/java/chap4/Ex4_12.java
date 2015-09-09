package study.java.chap4;

public class Ex4_12 {
	public static void main(String args[])
	{
		/*
		for (int i = 1 ; i <= 9 ; i++) {
			for (int j = 1; j <= 3; j++) {
			int x = j+1+(i-1)/3*3;
			int y = i%3==0? 3 : i%3 ;
			if(x > 9) // 9단까지만 출력한다. 이 코드가 없으면 10단까지 출력된다.
			break;
			System.out.print(x+"*"+y+"="+x*y+"\t"); //println이 아님에 주의
			}
			System.out.println();
			if(i%3==0) System.out.println(); //
		}
		*/
		/*
		for(int next=1; next<=3; next++)
		{
			for(int prev=2; prev<=4; prev++)
			{
				System.out.print(prev+"*"+next+"="+prev*next + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int next=1; next<=3; next++)
		{
			for(int prev=5; prev<=7; prev++)
			{
				System.out.print(prev+"*"+next+"="+prev*next + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int next=1; next<=3; next++)
		{
			for(int prev=8; prev<=9; prev++)
			{
				System.out.print(prev+"*"+next+"="+prev*next + "\t");
			}
			System.out.println();
		}
		*/
	}
}
