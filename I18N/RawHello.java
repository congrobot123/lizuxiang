import java.util.Locale;
import java.util.ResourceBundle;
import static java.util.Locale.*;
import static java.util.ResourceBundle.*;


public class RawHello 
{
	public static void main(String[] args) 
	{
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
		System.out.println(bundle.getString("Hello"));
	}
}
