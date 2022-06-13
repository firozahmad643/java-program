import java.util.*;    
                          
class logical                   
{
    public static void main(String args[])        
    {
        Scanner sc = new Scanner(System.in);      

        int a,b,c,d; 
      
                            
        System.out.println("Enter Four Numbers:");

        a=sc.nextInt();                           

        b=sc.nextInt();

        c=sc.nextInt();

        d=sc.nextInt();

        System.out.println((a>b)&&(c<d));      
   
        System.out.println((a<b)||(c>=d));      
   
        System.out.println(!(c>a));              
    }
}