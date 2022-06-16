import java.util.*;

public  class operator_2{

                                    public static void main (String[] args)
                                    {

                                           arithmetic_opt();
                                           System.out.println();  
                                           assignment_opt();
                                           System.out.println();  
                                           logical_opt();


                                      }

                               public static void arithmetic_opt()

                               {

                                        Scanner sc = new Scanner(System.in);
                  
                                         int a,b,add,mul,sub,div,mod; 
                                         System.out.println("\n arithmetic function \n");     
                        
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
               
                   
                             public static void assignment_opt()
                      
                         {
                               Scanner sc=new Scanner(System.in);                                
                               int a,b,c,d,e,f;
                                System.out.println("\n assignment function \n"); 
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

                              
                                     public static void logical_opt()
                      
                         {
                              Scanner sc = new Scanner(System.in);      

                                 int a,b,c,d; 
      
                             System.out.println("\n logical function \n"); 
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






















