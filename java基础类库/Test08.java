import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;

public class Test08 
{
	public static void main(String[] args) 
	{
		Locale currentLocale = null;
		if(args.length == 2)
		{
			if(args[1].equals("US") )
			{
				currentLocale = new Locale("en");
			}else if(args[1].equals("CN"))
			{
				currentLocale = new Locale("zh");
			}
			else
			{
				System.out.println("ERROR");
			}
		}else
		{
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		

		ResourceBundle bundle = ResourceBundle.getBundle("mess" , currentLocale);

		String msg = bundle.getString("msg");
		System.out.println(MessageFormat.format(msg,args[0]));
	}
}
