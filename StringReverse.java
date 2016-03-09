import java.util.Scanner;

public class StringReverse{
   public static void main(String[] args){
	   Scanner scc = new Scanner(System.in);
   	
  	 System.out.println("Enter String to be reversed");
  	 String sTag = scc.next();
      
      String reverse = new StringBuffer(sTag).
      reverse().toString();
      System.out.println("\nString before reverse: "+sTag);
      System.out.println("String after reverse:"+reverse);
   }
}
