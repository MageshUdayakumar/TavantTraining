package day1;


import java.util.Scanner;

public class MarkValidation1 {
    
	 public  String markGrade(int mark)
	 {
		 for(int i=1;i<=4;i++)
		 {
			 switch(i)
			 {
			 case 1: if(mark>=90) return "Grade A";
			 break;
			 case 2: if(mark>=75&&mark<90) return "Grade B";
			 break;
			 case 3: if(mark>=60&&mark<75) return "Grade C";
			 break;
			 case 4: if(mark<60) return "Grade D";	 
			 }
		 }
		return null;
	}

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int mark;
		System.out.println("Mark=");
		mark=scanner.nextInt();
		MarkValidation1 markvalidation1 = new MarkValidation1();
		System.out.println(markvalidation1.markGrade(mark));
		scanner.close();
	}

}
