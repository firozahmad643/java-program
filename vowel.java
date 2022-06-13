import java.util.*;    
                             
 class vowel                       
{

    public static void main(String args[])  
       
    {
             
        char ch,ch1; 
        Scanner sc = new Scanner(System.in);  
                                  
        System.out.println("Enter Any alphabet:"); 
        ch = sc.next().charAt(0);
        ch1=Character.toLowerCase(ch);
                   
        switch (ch1)                                 
        {
            case 'a' :                            
                System.out.println("It Is a Vowel");
                break;                             
            case 'e' :
                System.out.println("It Is a Vowel");
                break;
            case 'i' :
                System.out.println("It Is a Vowel");
                break;
            case 'o' :
                System.out.println("It Is a Vowel");
                break;
            case 'u' :
                System.out.println("It Is a Vowel");
                break;
            default:                                    
                System.out.println("It Is Not a Vowel");
        }

    }
}