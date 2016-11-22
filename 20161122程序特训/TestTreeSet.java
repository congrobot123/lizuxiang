/*
�ӿ���̨��ȡ�û�����һ������n,Ȼ��������ֵ���������n������
���뵽һ�������У����뼯�����ɴӴ�С����Ȼ���󼯺�������������ӵ�ƽ��ֵ
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

		System.out.println("������һ������n:");
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
		System.out.println("������ɵ��������м���Ϊ��");
		System.out.println(ts);
		System.out.println("ƽ����Ϊ��");
		System.out.println(adver);
	}
}
