package com.IT7320.A3_partB;

/**
 * Hello world!
 *
 */
public class Arithmitic 
{
	private int x,y,sum;
	
	public Arithmitic(int x, int y) {
		this.x = x;
		this.y = y;
			
	}
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int subtract(int a, int b) {
		return a-b;
	}
	
    public static void main( String[] args )
    {
    	
        System.out.println( "The sum of 45 and 37 = "+ add(45,37) );
    }
}
