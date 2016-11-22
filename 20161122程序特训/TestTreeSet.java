/*
从控制台获取用户输入一个整数n,然后根据这个值，随机产生n个整数
存入到一个集合中，存入集合中由从大到小排序，然后求集合数中所有数相加的平均值
*/
import java.util.Scanner;
import java.util.Random;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;



public class TestTreeSet
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个整数n:");
		int n =sc.nextInt();

		Random rd = new Random();

		TreeSet ts = new TreeSet((o1 , o2) ->
								{
									Integer tempInt1 = (Integer)o1;
									Integer tempInt2 = (Integer)o2;
									return tempInt1 > tempInt2 ? -1 : 
										   tempInt1 < tempInt2 ? 1 : 0;								
								});
		for(int i = 0; i<n; i++)
		{
			ts.add(rd.nextInt());
		}

		Iterator it = ts.iterator();
		int sum = 0;
		while(it.hasNext())
		{
			int temp = (Integer)it.next();
			sum = sum + temp;
		}

		int adver = sum/(ts.size());
		System.out.println("随机生成的数字排列集合为：");
		System.out.println(ts);
		System.out.println("平均数为：");
		System.out.println(adver);
	}
}
