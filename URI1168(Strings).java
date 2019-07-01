//Tristan Dufault 2019-06-30

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(new BufferedInputStream(System.in));

		String num;
		int n;
		int total;
		int count = inp.nextInt();
		
		while(count>0)
		{
			num = inp.next();
			char[] ar = num.toCharArray();
			total = 0;
			
			n = ar.length;
			
			for(int i =0; i < n; i++)
			{
				if(ar[i] == '1')
				{
					total += 2;
				}
				else if(ar[i] == '7')
				{
					total += 3;
				}
				else if(ar[i] == '4')
				{
					total += 4;
				}
				else if((ar[i] == '2') || (ar[i] == '3') || (ar[i] == '5'))
				{
					total += 5;
				}
				else if((ar[i] == '6') || (ar[i] == '9') || (ar[i] == '0'))
				{
					total += 6;
				}
				else if(ar[i] == '8')
				{
					total += 7;
				}
			}
			System.out.println(total + " leds");
			count --;
			
		}
		
		inp.close();
	}
}
