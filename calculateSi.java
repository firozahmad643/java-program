import java.util.*;          
                               
 class calculateSi                       
{
    public static void main(String args[])  
                
    {
        Scanner sc = new Scanner(System.in);                
        int Pa,Time;                                            
        float Roi,SI;

        System.out.println("Enter The Principal Amount:");  
        Pa = sc.nextInt();                                   
        
        System.out.println("\nEnter The No. Of Years:");
        Time = sc.nextInt();
        
         System.out.println("\nEnter The Rate Of Interest:");
        Roi = sc.nextFloat();

        SI = (Pa* Time * Roi)/100;                              
        System.out.println("\nSimple Interest Is:"+SI);       
    }
}