package javaAsk;

import org.testng.annotations.Test;

public class Altimetrik {
	
	@Test
	
	void countChar()
	{
	
	String s="mohammad";
	
	char[] a=s.toCharArray();
	
	for (int i=0;i<s.length();i++)
	{
		int count=0;
		if(a[i]=='m')
		{
			count++;
		}
		System.out.println(count);
	}
	
	}

}
