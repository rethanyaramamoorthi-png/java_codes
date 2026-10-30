import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0&&a%5==0)
        {
            System.out.println("The number divisible by both 5 and 3");
        }
         else if(a%5==0)
         {
            System.out.println("The number divisible by 5 only");
         }
         else if(a%3==0)
         {
            System.out.println("The number divisible by 5 only");
         }
         else 
         {
            System.out.println("Not divisible by 3and 5");
         }
        
    }
}
