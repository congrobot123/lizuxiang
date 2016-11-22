import java.util.Scanner;

public class Test06 
{
	public static void main(String[] args) 
	{
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("你输入的数是:");
		for(int temp : num)
		{
			System.out.print(temp+" ");
		}

		System.out.println();

		int sum = 0;
		double aver = 0;
		for(int i = 0 ; i < num.length; i++)
		{
			sum += num[i];
		}
		aver = (double)sum / 10;

		int max = num[0];
		for(int i = 1; i < num.length; i++)
		{
			max = Math.max(num[i], max);
		}

		int min = num[0];
		for(int i = 1 ; i < num.length; i++)
		{
			min = Math.min(num[i], min);
		}

		 System.out.println("平均值是："+aver);
		 System.out.println("最大值是："+max);
		 System.out.println("最小值是："+min);
	}
}
