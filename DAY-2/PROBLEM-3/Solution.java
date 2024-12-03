import java.io.*;
import java.util.*;

public class Solution {
    
    public static int H,B;
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
         B=sc.nextInt();
          H=sc.nextInt();
        try{
            if(B<0 || H<0)
            {
                 throw new Exception("Breadth and height must be positive");
            }
            else 
            {
                System.out.println(B*H);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}