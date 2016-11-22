public class Test04 
{
	public static void main(String[] args) 
	{
		String str = "A1B2C3D4E5F6G7H8";

		System.out.println("原数组为:"+"\n"+str);
		char [] ch = null;

		int [] num = new int[8];
		char [] newch = new char[8];
		String str2 = null;
		int count1 = 0;
		int count2 = 0;

		ch = str.toCharArray();
		for(int i = 0; i < str.length(); i++)
		{
			if(ch[i] >= '1' && ch[i] <= '8')
			{
				String tempStr = null;
				tempStr = String.valueOf(ch[i]);
				
				num[count1] = Integer.parseInt(tempStr); 
				count1++;
				continue;
			}

			if(ch[i] >= 'A' && ch[i] <= 'H')
			{
				newch[count2] = ch[i];
				count2++;
			}
		}

		str2 = String.copyValueOf(newch);

		System.out.println("拆分后的数组分别为:");

		for(int temp : num)
		{
			System.out.print(temp);
		}

		System.out.println();

		System.out.println(str2);
	}
}
