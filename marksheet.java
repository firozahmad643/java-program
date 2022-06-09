import java.util.Scanner;

public class marksheet {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name :- ");
		String name = sc.nextLine();
		
		System.out.println("Enter  Roll No. :- ");
		int roolno = sc.nextInt();
		
		System.out.println("Enter Subject Marks  :- ");
		
		System.out.println("math = ");
		int math = sc.nextInt();
		
		System.out.println("science = ");
		int science = sc.nextInt();
		
		System.out.println("english = ");
		int english = sc.nextInt();
		
		System.out.println("SST =  ");
		int SST = sc.nextInt();
		
		System.out.println("hindi =  ");
		int hindi = sc.nextInt();
		
		
		int t = (math+science+english+SST+hindi)*100/500;
		System.out.println(" your Percentage is = "+t);
		
		
		            
	}

}