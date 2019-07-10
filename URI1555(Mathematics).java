//Tristan Dufault 2019-07-01
//Problem can be found at link: https://www.urionlinejudge.com.br/judge/en/problems/view/1555

package src;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
			
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		int count;
		int ans1, ans2, ans3;
		int var1, var2;
		int max;
		
		count = inp.nextInt();
		while(count>0)
		{
			var1 = inp.nextInt();
			var2 = inp.nextInt();

			ans1 = (int) (Math.pow((var1*3),2) + Math.pow(var2,2)); //Rafael
			ans2 = (int) (2*(Math.pow(var1,2)) + Math.pow(var2*5,2)); //Beto
			ans3 = (int) ((-100*var1) + Math.pow(var2,3)); //Carlos
			
			max = ans1;
			
			if(ans2>ans1)
			{
				max = ans2;
				if(ans3>ans2)
				{
					max = ans3;
				}
			}
			
			if(ans3>ans1)
			{
				max = ans3;
				if(ans2>ans3)
				{
					max = ans2;
				}
			}

			if(max==ans1)
			{
				System.out.println("Rafael ganhou");
			}
			else if(max==ans2)
			{
				System.out.println("Beto ganhou");
			}
			else if(max==ans3)
			{
				System.out.println("Carlos ganhou");
			}

			count--;
		}
		
		inp.close();
	}

}
