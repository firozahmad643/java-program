import java.util.*;    
                                                    
 class assignment                                         
{
    public static void main(String args[])                                 
    {
        Scanner sc=new Scanner(System.in);                                
        int a,b,c,d,e,f;

        System.out.println("enter six number");               
        a= sc.nextInt();                                                  
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        e= sc.nextInt();
        f= sc.nextInt();

        a+=a;                                                              
        c-=a;
        d*=a;
        e/=a;
        f%=a;

        System.out.println("Addition Assignment Operator Result:"+a);      
        System.out.println("Subtraction Assignment Operator Result:"+c);   
        System.out.println("Multiplication Assignment Operator Result:"+d);
        System.out.println("Division Assignment Operator Result:"+e);      
        System.out.println("Modulus Assignment Operator Result:"+f);      
    }
}