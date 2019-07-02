##Tristan Dufault 2019-07-01

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		int count;
		
		count = inp.nextInt();
		BigInteger hand1, hand2, ans;
		
		while(count>0)
		{
			hand1 = inp.nextBigInteger();
			hand2 = inp.nextBigInteger();
			
			ans = hand1.gcd(hand2);
			System.out.println(ans);
			count--;
		}
		
		inp.close();
	}
}
