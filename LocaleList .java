//程序国际化

public class LocaleList 
{
	public static void main(String[] args) 
	{
		Locale [] localeList = Locale.getAvailableLocales();
		for(int i = 0; i < localeList.length; i++)
		{
			System.out.println(localeList[i].getDispayCountry()
			+"="+localeList[i].getCountry()+""
			+localeList[i].getDisplayLanguage()
			+"="+localeList[i].getLanguage());
		}
			
	}
}
