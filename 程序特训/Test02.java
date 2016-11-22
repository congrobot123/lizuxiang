import java.util.Scanner;

public class Test02 
{
	public static void main(String[] args) 
	{

		System.out.println("请输入当月的利润：");
		Scanner sc = new Scanner(System.in);
		int profit = sc.nextInt();
		double bonus = 0;

		if(profit <= 100000)
		{
			bonus = profit * 0.1;
		}else if(profit > 100000 && profit <= 200000)
		{
			bonus = (profit - 100000)*0.075 + 100000*0.1;
		}else if(profit > 200000 && profit <= 400000)
		{
			bonus = (profit - 200000)*0.05 + 100000*0.1 + 100000*0.07;
		}else if(profit > 400000 && profit < 600000)
		{
			bonus = (profit - 400000)*0.03 + 100000*0.1 + 100000*0.07 + 200000*0.5;
		}else if(profit > 600000 && profit < 1000000)
		{
			bonus = (profit - 600000)*0.015 + 100000*0.1 + 100000*0.07 + 200000*0.5 + 200000*0.03;
		}else if(profit > 1000000)
		{
			bonus = (profit - 1000000)*0.01 + 400000*0.015 + 100000*0.1 + 100000*0.07 + 200000*0.5 + 200000*0.03;
		}
		else
		{
			System.out.println("ERROR");
		}
		System.out.println("应当发的奖金总数是:"+bonus);
	}
}
