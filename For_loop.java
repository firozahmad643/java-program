//program to display a table

import java.util.*;

 class For_loop{

	public static void main(String[] args) 
               {
		
                         int t,p,i;
                        Scanner sc = new Scanner(System.in);
	     System.out.println("enter the number for table:");
                         
                         t=sc.nextInt();
                         System.out.println("\n");
	    		 
	    for(i=1;i<=10;i++)
	    {
	        p=t*i;
                            System.out.println(t+"*"+i+"="+p);	
	      
	    }
	}

}