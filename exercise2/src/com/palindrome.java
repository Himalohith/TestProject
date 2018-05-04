package com;

public class palindrome {

	


public static void main(String[] args)
{
   palindrome e = new palindrome ();
    long largest = 0;
    int a = 999; 		
    int b = 999;
    for (int i = b; i > 0; i--)
    {
       for (int j = a;j > 0; j--)
        {
            if ( e.check( new Long(i*j).toString() ) )
            {
                if ( i*j > largest )
                {
                    largest = i*j;
                }
            }
        }
    }

    System.out.println(largest);
}
public boolean check( String pal )
{
	String v=pal.substring( 0, pal.length() / 2);
	String h=pal.substring( pal.length() / 2);
    boolean x=new StringBuffer(v).reverse().toString().equals(h);
  
    return x;
}
}
