package com;

public class lcm {

	public static void main(String[] args) {
		long x = 21;
		while(1==1)
		{
		    boolean mul=true;
		    for (int i = 1; i < 21; i++)
		    {
		        mul = true;
		        if ( x % i != 0 )
		        {
		            mul = false;
		            break;
		        }
		    }
		    if ( mul )
		    {
		        System.out.println( x );
		        System.exit(0);
		    }

		    x++;
		
	}
	}
}
