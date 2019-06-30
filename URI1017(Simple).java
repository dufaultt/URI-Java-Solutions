//Tristan Dufault 2019-06-29

import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(new BufferedInputStream(System.in));
		DecimalFormat numFormat = new DecimalFormat("#.000");
		
		float time = inp.nextInt();
		float speed = inp.nextInt();		
		double num = (time*speed)/12;
		
		System.out.println(numFormat.format(num));
		
		inp.close();
	}
}
