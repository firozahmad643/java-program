import java.util.*;
                                              
 class arithmetic                             
{
    public static void main(String args[])                     
    {
        Scanner sc = new Scanner(System.in);
                  
        int a,b,add,,mul,sub,div,mod;     
                        
        System.out.println("Enter Two Numbers:");  
           
        a=sc.nextInt();                                         
        b=sc.nextInt();

        add=a+b;  
                                               
         mul=a*b;

         sub=a-b;

         div=a/b;

         mod=a%b;

        System.out.println("Addition Of Two Numbers:"+add);      

        System.out.println("Multiplication Of Two Numbers:"+mul);

        System.out.println("Subtraction Of Two Numbers:"+sub);

        System.out.println("Division Of Two Numbers:"+div);     

        System.out.println("Modulus Of Two Numbers:"+mod);       
    }
}