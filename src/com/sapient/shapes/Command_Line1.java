package com.sapient.shapes;

public class Command_Line1 {
    private int[] a;
    private int sum;
    private int biggest;
    private int smallest;
   
    public void setData(String[] s)
    {
    	a=new int[s.length];
    for(int i=0;i<s.length;i++)
    {
    	a[i]=Integer.valueOf(s[i]);
    }
    }
    public void calData()
    {
    	sum=0;
    	biggest=Integer.MIN_VALUE;
    	smallest=Integer.MAX_VALUE;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 sum+=a[i];
    		 if(a[i]>biggest)
    			 biggest=a[i];
    		 if(a[i]<smallest)
    			 smallest=a[i];
    	 }
    	   
    }
    public void dispData()
    {
    	System.out.println("sum:"+ sum +"  Biggest: "+ biggest+" smallest: "+smallest +" average: "+(sum/a.length));
    }
}
