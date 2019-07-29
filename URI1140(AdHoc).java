//Work in Progress
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
			
			if(sentence.equals("*"))
			{
				break;
			}
			String[] Words = sentence.split(" ");
			String[] Letters;
			
			for(int i = 0; i<Words.length; i++)
			{
				Letters = Words[i];
			}
			
			System.out.println(sentence);
		}
	}
}
