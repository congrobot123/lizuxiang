import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Test02 
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int temp = 0;

		System.out.println("������10��Ԫ�أ�");
		for(int i = 0; i<10; i++)
		{
			temp = sc.nextInt();
			list.add(temp);
		}

		
		System.out.println("����Ϊ5����Ԫ��Ϊ��"+list.get(5));
		
		System.out.println("������Ҫ��ȡ������Ԫ�أ�");
		int index = sc.nextInt();
		System.out.println("Ԫ��Ϊ" + index + "������Ϊ:"+ list.indexOf(index));

		System.out.println("��������Ҫ��ȡ������Ԫ�أ�");
		int index2 = sc.nextInt();
		System.out.println("Ԫ��Ϊ" + index2 + "������Ϊ:"+ list.indexOf(index2));

		list.remove(3);
		System.out.println("ɾ��������Ϊ3��Ԫ�غ��ListΪ��\n"+list);
	}
}
