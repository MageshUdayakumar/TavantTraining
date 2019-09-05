package day1;

import java.util.Scanner;

public class SumOfNumbers {
	
	 public int SumOfEvenNumber(int start,int end)
		{
			int i,p=0;
			for(i=start;i<=end;i++)
			{
				if(i%2==0)
				{
					p=p+i;
				}
			}
			return p;
			
		}
	 public int SumOfOddNumber(int start,int end)
		{
			int i,p=0;
			for(i=start;i<=end;i++)
			{
				if(i%2!=0)
				{
					p=p+i;
				}
			}
			return p;
			
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start,end;
		System.out.println("Start=");
		start=scanner.nextInt();
		System.out.println("End=");
		end=scanner.nextInt();
		SumOfNumbers sumofnumber = new SumOfNumbers();
		System.out.println("Sumofeven="+sumofnumber.SumOfEvenNumber(start,end) );
		System.out.println("Sumofodd="+sumofnumber.SumOfOddNumber(start,end) );
		scanner.close();
		
		
		

	}

}
