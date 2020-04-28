package demo;

import java.util.Scanner;

public class Demoprject {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want to print in this pattern");
		int row=sc.nextInt();
	for(int x=1;x<=row;x++)
	{
		for(int y=1;y<=x;y++)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
for(int x=row-1;x>=1;x--)
{
	for(int y=1;y<=x;y++)
	{
		System.out.print(y+" ");
	}
	System.out.println();
}
	}

}
