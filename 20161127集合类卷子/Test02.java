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

		System.out.println("请输入10个元素：");
		for(int i = 0; i<10; i++)
		{
			temp = sc.nextInt();
			list.add(temp);
		}

		
		System.out.println("索引为5处的元素为："+list.get(5));
		
		System.out.println("请输入要获取索引的元素：");
		int index = sc.nextInt();
		System.out.println("元素为" + index + "的索引为:"+ list.indexOf(index));

		System.out.println("请再输入要获取索引的元素：");
		int index2 = sc.nextInt();
		System.out.println("元素为" + index2 + "的索引为:"+ list.indexOf(index2));

		list.remove(3);
		System.out.println("删除索引号为3的元素后的List为：\n"+list);
	}
}
