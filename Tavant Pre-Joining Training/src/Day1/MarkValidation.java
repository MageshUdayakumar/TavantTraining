package day1;

import java.util.Scanner;

public class MarkValidation {

	public  String isPass(int mark)
	{
		
		if(mark>=40) 
		return "Pass";
		else
		return "Fail";
		
	}
	public String markGrade(int mark)
	{
		if(mark>=90)
		return "Grade A";
		else if(mark>=75&&mark<90)
		return "Grade B";
		else if(mark>=60&&mark<75)
	    return "Grade C";
		else
		return  "Grade D";	
	}
	public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int mark;
      System.out.println("Mark=");
      mark=scanner.nextInt();
      MarkValidation markvalidation = new MarkValidation();
      System.out.println(markvalidation.isPass(mark));
      System.out.println(markvalidation.markGrade(mark));
      scanner.close();
	} 

}

