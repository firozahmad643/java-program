import java.util.*;

public  class operator_2{

                                    public static void main (string[] args)
                                    {

                                           arithmetic_opt();



                                      }

                               public static void arithmetic_opt()

                               {

                                        Scanner sc = new Scanner(System.in);
                  
                                       static  int a,b,add,,mul,sub,div,mod;     
                        
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