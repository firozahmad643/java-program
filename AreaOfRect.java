import java.util.*;    
                                         
 class AreaOfRect                                     
{
    public static void main(String args[])                   
  
  {
                           
        int len,bre,pera,area;   
        Scanner sc = new Scanner(System.in);   
                                
        System.out.println("\nEnter the Length Of Rectangle:");   
        len = sc.nextInt();  
                                     
        System.out.println("\nEnter the Breadth Of Rectangle:");
        bre= sc.nextInt();

        area = len * bre;                                           
        pera= 2 * (len+bre);

        System.out.println("\nArea Of Rectangle Is:"+area);       
        System.out.println("\nArea Of Rectangle Is:"+pera);
   
     }
}