package com.sapient.shapes;

public class FigToWordsConverter {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};
	public static void fig_to_words(long number)
	{
		if(number<20)
		{
			int n=(int)(number);
			System.out.print(units[n]);
			return;
		}
		if(number<100)
		{
			int n=(int)(number);
			System.out.print(tens[n/10]+" "+units[n%10]);
			return;
		}
		if(number<1000)
		{
			int n=(int)(number);
			System.out.print(units[n/100]+" hundreds and ");
			 fig_to_words(n%100);
			
			return;
		}
		if(number<100000)
		{
			int n=(int)(number);
			 fig_to_words(n/1000);
			System.out.print(" thousand ");
			 fig_to_words(n%1000);
			 return;
		}
		if(number<1000000)
		{
			int n=(int)(number);
			 fig_to_words(n/100000);
			System.out.print(" lakh ");
			 fig_to_words(n%100000);
			 return;
		}
		else
		{
			int n=(int)(number);
			 fig_to_words(number/1000000);
			System.out.print(" crore ");
			 fig_to_words(number%1000000);
			 return;
		}
	}
}
