import java.util.Scanner;
import java.io.File;

public class Test05 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(new File("def.txt"));
		int flag = 0;
		int temp1 = 0;
		int temp2 = 0;
		int newTemp = 0;

		while(sc.hasNextInt())
		{
			if(flag == 0)
			{
				temp1 = sc.nextInt();
				flag = 1;
				continue;
			}

			if(flag == 1)
			{
				temp2 = sc.nextInt();
				newTemp = temp1 + temp2;
				System.out.println(temp1+"+"+temp2+"="+newTemp);
				temp1 = 0;
				temp2 = 0;
				newTemp = 0;
				flag = 0;
			}
		}
	}
}
