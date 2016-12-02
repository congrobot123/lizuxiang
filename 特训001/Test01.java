public class Test01 
{
	public static void main(String[] args) 
	{
		String str = "a,b,c,d,e,f,g";
		char[] ch = null;
		ch = str.toCharArray();
		int count = 0;

		for(int i = 0; i<ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
		for(int i = 0 ; i<ch.length; i++)
		{
			if(ch[i] == ',')
			{
				for(int j = i; j<(ch.length-i); j++)
				{
					ch[j] = ch[j+1];
				}
				count++;
			}
		}
		
		System.out.println();
		for(int i = 0; i<=count; i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
}
