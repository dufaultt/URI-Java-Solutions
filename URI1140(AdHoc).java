import java.util.Scanner;
import java.io.BufferedInputStream; 

public class Main 
{

	public static void main(String[] args)   
	{
		
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		
		String sentence;
		Boolean flag;
		
		while(true)
		{
			sentence = inp.nextLine();
			flag = true;
			
			if(sentence.equals("*"))
			{

				break;
			}
			String[] Words = sentence.split(" ");
			char Letter1, Letter2;
			
			Letter1 = Words[0].charAt(0);
			Letter1 = Character.toLowerCase(Letter1);
			
			for(int i = 1; i<Words.length; i++)
			{
				Letter2 = Words[i].charAt(0);
				Letter2 = Character.toLowerCase(Letter2);
				if(Letter2 != Letter1)
				{
					flag = false;
				} 
				
			}
			
			if(flag == true)
			{
				System.out.println("Y");
			}
			else
			{
				System.out.println("N");
			}
			

		}
	}
}
