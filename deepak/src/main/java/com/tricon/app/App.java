package com.tricon.app;

public class App 
{
    public static void main( String[] args )
    {
		int i=0,j=0;
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print( (i+j) );	
			}	
			
		System.out.println();	
		}
    }
}