package demo;

import java.util.Scanner;

public class Newpattern {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Give the input data here");
	int row=sc.nextInt();
	for(int x=1;x<=row;x++)
	{
		for(int y=1;y<=x;y++)
		{
			System.out.print(y+" ");
		}
		for(int y=x-1;y>=1;y--)
		{
			System.out.print(y+" ");
		}		
		System.out.println( );
	}

	}

}
