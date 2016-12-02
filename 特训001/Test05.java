import java.util.Scanner; 

public class Test05 
{  
	//将字符进行替换调整
	private static String change(String str) 
	{  
        String s = str.replaceAll("零[仟百拾]", "零");  
        s = s.replaceAll("零+", "零").replaceAll("零亿", "亿").replaceAll("零万", "万").
			replaceAll("零圆", "圆").replace("亿万", "亿");
        return s;  
    } 

    public static void main(String[] args) 
	{  
        long num = 0;
		Scanner sc = new Scanner(System.in);
        String[] str1 =    {"零","壹","貳","叁","肆","伍","陆","柒","扒","玖"};  
        String[] str2 =     {"整","圆","拾","百","仟","万","拾","百","仟","亿", "拾","百","仟","万"};  
            
		System.out.println("请输入要转换的金额：");														 
        while(true)
		{  
            num = sc.nextLong();  
            char[] chArray = Long.toString(num).toCharArray();//将输入的数字转换为字符数组
			
            StringBuilder sb = new StringBuilder();  
            for(int i = 0; i < chArray.length; i++)
		    {  
                 String s = str1[ Integer.parseInt(String.valueOf(chArray[i])) ];//计算数字  
                 String s2 = str2[chArray.length-i];  //计算位数
                 sb.append(s).append(s2);//整合数组    
            }
			
				sb.append(str2[0]);  
				String str = sb.toString();//转化为String字符串  
				str = change(str);//整理  
				System.out.println("转换后的金额是：\n"+str);
		}  
    }      
}  