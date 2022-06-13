import java.util.*;     
                                        
 class AreaOfCircle   
{                               
      public static void main(String args[])    
                    
        {
          
                int r;   
                float area,circum;
                float PI = 3.14F;
                Scanner sc = new Scanner(System.in);

                 System.out.println("\nEnter The Radius Of Circle =");        
                 r = sc.nextInt();   
                                      
                area = 3.14F * r * r;                                     
               circum = 2 * 3.14F * r;

                System.out.println("\nArea Of Circle Is = "+area);            
                System.out.println("\nCircumference Of Circle Is = "+circum);
    }
}