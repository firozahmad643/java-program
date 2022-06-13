import java.util.*;    
                                     
class cube    
                                      
{

    public static void main(String args[])   
               
    {
        Scanner sc = new Scanner(System.in);  
             
        int num,cube; 
                                       
        System.out.println("\nEnter The Number:"); 
           
        num = sc.nextInt();    
                             
        if (num% 2 == 0)    
                                 
              {
                    cube = num* num* num;    
                           
                     System.out.println("Cube of "+num+" is:"+cube);   
               }

       else

             {
                   System.out.println("number is not even");
             }
    }
}