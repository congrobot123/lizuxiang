import java.util.Locale;
import java.util.ResourceBundle;
//程序国际化
class LocaleList 
{
	public static void main(String[] args) 
	{
		Locale [] localeList = Locale.getAvailableLocales();
		for(int i = 0; i < localeList.length; i++)
		{
			System.out.println(localeList[i].getDisplayCountry()
			+"="+localeList[i].getCountry()+""
			+localeList[i].getDisplayLanguage()
			+"="+localeList[i].getLanguage());
		}			
	}
}
