//Tristan Dufault 2019-06-29
//Problem can found at link: https://www.urionlinejudge.com.br/judge/en/problems/view/1240

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		int int1, int2;
		int count;
		int flag;
		
		count = inp.nextInt();
		while(count>0)
		{
			int1 = inp.nextInt();
			int2 = inp.nextInt();
			flag = 0;
			
			char[] int1ar = Integer.toString(int1).toCharArray();
			char[] int2ar = Integer.toString(int2).toCharArray();
			
			int ln = int1ar.length;
			int n = int2ar.length;
			
			for(int i = 0; i<=n-1; i++)
			{
				if(int1 < int2)
				{
					flag = 1;
					break;
				}
				//System.out.println("Does " + int1ar[ln-1-i] + " = " + int2ar[n-1-i]);
				if(int1ar[ln-1-i] != int2ar[n-1-i])
				{
					flag = 1;
				}
			}
			
			if(flag == 1)
			{
				System.out.println("nao encaixa");
			}
			else
			{
				System.out.println("encaixa");
			}
			
			count--;
		}
		
		inp.close();
	}
}
