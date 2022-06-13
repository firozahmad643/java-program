import java.util.Scanner;

class operator 

   {
                                    public static void main( String [] args )
                           
                              {
                                   
                                     int choice , a , b ,res;
      
                                     Scanner swi= new Scanner(System.in);

                                    System.out.println("choose the number for arithmetic operation");
                                     
                                     System.out.println("1 for add");

                                    System.out.println("2 for sub");

                                   System.out.println("3 for mul");

                                   System.out.println("4 for div");
 
                                   System.out.println("5 for mod");

                                   System.out.println("enter your choice");
                               
                                  choice = swi.nextInt();
                                 
                                  
                                  System.out.println("enter two number");
                                   a = swi.nextInt();
                                  b = swi.nextInt();

                                  switch  (choice) 
                           {
                                           case 1 : 
                                                          res=a+b;
                                                          System.out.println("addition is ="+res);
                                                           break;
                                            case 2 : 
                                                          res=a-b;
                                                          System.out.println("substraction is="+res);
                                                           break;
                                            
                                                case 3 : 
                                                          res=a*b;
                                                          System.out.println("multipication is="+res);
                                                           break;
                                           
                                                   case 4 : 
                                                          res=a/b;
                                                          System.out.println("division is="+res);
                                                           break;

                                                 case 5: 
                                                          res=a%b;
                                                          System.out.println("modulas is="+res);
                                                           break;
                                         default :
                                                        System.out.println("not from choices");


                          }

        }
                                   
                               


}