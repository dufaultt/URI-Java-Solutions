//Tristan Dufault 2019-07-11
//Problem can be found at: https://www.urionlinejudge.com.br/judge/en/problems/view/1087
import java.io.BufferedInputStream;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		int qx,qy,tx,ty; //Queen x/y and Target x/y
		int ans;
		
		while(true)
		{
			qx = inp.nextInt();
			qy = inp.nextInt();
			tx = inp.nextInt();
			ty = inp.nextInt();
			
			if((qx == qy) && (qy == tx) && (tx == ty) && (ty ==0))
			{
				break;
			}
			
			if((qx == tx) && (qy == ty))
			{
				ans = 0;
			}
			else if((qx == tx) || (qy == ty))
			{
				ans = 1;
			}
			else if(Math.abs(qx-tx) == Math.abs(qy-ty))
			{
				ans = 1;
			}
			else
			{
				ans = 2;
			}
			
			System.out.println(ans);
					
		}
	}
}
