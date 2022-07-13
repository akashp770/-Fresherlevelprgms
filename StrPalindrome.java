import java.util.*;
class Spldm {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the word :");
        String myStr=sc.nextLine();
        
        StringBuffer buff=new StringBuffer(myStr);
        buff.reverse();
        
        String data = buff.toString();
        
     if (myStr.toLowerCase().equals(data.toLowerCase())) {
         System.out.println("Given string "+myStr +" is Palindrome "+ data);
         
     }
     else{
         System.out.println("Given String "+myStr +" is  not Palindrome "+ data);
     }
     
        
    }
}
