import java.util.*;  
                                               
 class ProfitLoss    
                                       
{
        public static void main(String args[]) 
 
     {
                             
        int SP,CP,Profit,Loss;  
        Scanner sc = new Scanner(System.in);
                                
        System.out.println("\nEnter The Selling Price Of  a product:");  
        SP = sc.nextInt(); 
                                         
        System.out.println("\nEnter The Cost Price Of a product:");
        CP= sc.nextInt();

        if (SP>CP)                                                 
           {
                Profit = SP - CP;                                      
                 System.out.println("\nProfit is ="+Profit);       
           }

        else if(CP>SP)
             {
                   Loss = CP - SP;
                   System.out.println("\nLoss On The loss ="+Loss);
             }

        else
            {
                   System.out.println("\nNeither Profit Nor Loss");
             }

    }

}