import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Test01 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		String temp = null;
		for(int i = 0; i<20; i++)
		{
			temp = sc.next();
			s.add(temp);
		}

		System.out.println(s);
	}
}
