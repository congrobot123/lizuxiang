import java.util.Map;
import java.util.HashMap;

public class Test03 
{
	public static void main(String[] args) 
	{
		String[] str = {"a", "b", "a", "b", "c", "a", "b", "c", "b"};

		Map map = new HashMap();
		int acount = 0;
		int bcount = 0;
		int ccount = 0;

		for(int i = 0; i<str.length; i++)
		{
			if(str[i] =="a")
			{
				acount++;
				continue;
			}
			
			if(str[i] =="b")
			{
				bcount++;
				continue;
			}
			
			if(str[i] =="c")
			{
				ccount++;
			}
			
		}
		map.put("a",acount); 
		map.put("b",bcount);
		map.put("c",ccount);

		System.out.println(map);
	}
}
