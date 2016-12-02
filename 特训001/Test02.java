import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;


public class Test02 
{

	public static User Select(String str, User user)
	{
		String[] strArray = str.split(",");
		if(strArray.length == 3)
		{
			user.name = strArray[1];
		}
		user.count++;
		return user;
	}
	public static void main(String[] args) throws Exception
	{
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(new File("test.txt"));

		TreeSet ts = new TreeSet((o1, o2) ->
		{
			User u1 = (User)o1;
			User u2 = (User)o2;
			
			return u1.count > u2.count ? -1
					: u1.count < u2.count ? 1 : 0;
		});

		while(sc.hasNext())
		{
			System.out.println(sc.next());
			User tempUser = Select(sc.next(), new User(sc.next()) );
			ts.add(tempUser);
		}

		System.out.println(ts);
	}
}

class User
{
	public String name;
	public int count;
	
	 public User(String name)
	{
		this. name = name;
	}

	public String toString()
	{
		String str = name+count;
		return str;
	}
}
